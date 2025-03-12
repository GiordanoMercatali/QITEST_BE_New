package com.advancia.qitest.services;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.advancia.qitest.models.Domanda;
import com.advancia.qitest.models.EsecuzioneTest;
import com.advancia.qitest.models.Risposta;
import com.advancia.qitest.models.RispostaUtente;
import com.advancia.qitest.models.Test;
import com.advancia.qitest.models.Utente;
import com.advancia.qitest.repositories.DomandaRepository;
import com.advancia.qitest.repositories.RispostaRepository;
import com.advancia.qitest.repositories.RispostaUtenteRepository;
import com.advancia.qitest.repositories.test.TestRepository;
import com.advancia.qitest.repositories.utente.UtenteRepository;
import com.advancia.qitest.services.GeCV.UtentiDAO;

@Service
@Transactional
public class RispostaUtenteService {

    @Autowired
    private RispostaUtenteRepository rispostaUtenteRepository;

    @Autowired
    private UtenteRepository utenteRepository;

    @Autowired
    private DomandaRepository domandaRepository;

    @Autowired
    private RispostaRepository rispostaRepository;

    @Autowired
    private TestRepository testRepository;

    public void saveRisposteTest(String idTest, String idUtente, Map<String, List<String>> domandeRisposte, EsecuzioneTest esecuzioneTest) {
        Test test = testRepository.findById(Integer.parseInt(idTest)).get();
        Utente utente = utenteRepository.findById(Integer.parseInt(idUtente)).get();

        for (String idDomanda : domandeRisposte.keySet()) {
            Set<String> risposte = new HashSet<>(domandeRisposte.get(idDomanda));
            if (risposte.size() > 0) {
                for (String risposta : risposte) {
                    RispostaUtente ru = new RispostaUtente();
                    Domanda domanda = domandaRepository.findById(Integer.parseInt(idDomanda)).get();
                    ru.setUtente(utente);
                    ru.setDomanda(domanda);
                    ru.setTest(test);
                    if (domanda.getTipoDomanda().getTTipoDomanda().equalsIgnoreCase("aperta")) {
                        ru.setTestoRisposta(risposta);
                    } else {
                        ru.setRisposta(rispostaRepository.findById(Integer.parseInt(risposta)).get());
                    }
                    ru.setQuizUtente(esecuzioneTest.getQuizUtente());
                    rispostaUtenteRepository.save(ru);
                }
            } else {
                RispostaUtente ru = new RispostaUtente();
                Domanda domanda = domandaRepository.findById(Integer.parseInt(idDomanda)).get();
                ru.setUtente(utente);
                ru.setDomanda(domanda);
                ru.setTest(test);
                ru.setQuizUtente(esecuzioneTest.getQuizUtente());
                rispostaUtenteRepository.save(ru);
            }
        }
        Integer punteggio = calcolaPunteggioTest(idTest, idUtente);
        esecuzioneTest.setTTotaleRispCorrette(punteggio);
        esecuzioneTest.setTTotaleRisposte(getSetRisposteCorretteByIdTest(idTest).size());

        // aggiorno su GeCV il punteggio del test per quello di logica e quello analitico
        if (test.getTDescrizioneTest().equalsIgnoreCase("analitico")) {
            UtentiDAO utentiDAO = new UtentiDAO();
            utentiDAO.updateVotoTestAnalitico(utente, punteggio);
        } else if (test.getTDescrizioneTest().equalsIgnoreCase("logico")) {
            UtentiDAO utentiDAO = new UtentiDAO();
            utentiDAO.updateVotoTestLogica(utente, punteggio);
        }
    }

    private Set<Risposta> getSetRisposteUtenteByIdTestIdUtente(String idTest, String idUtente) {
        Set<Risposta> risposteUtente = new HashSet<>(rispostaUtenteRepository.findAllRispostaByUtenteIdUtenteAndTestIdTest(
                Integer.parseInt(idUtente), Integer.parseInt(idTest)));
        return risposteUtente;
    }

    private Set<Risposta> getSetRisposteCorretteByIdTest(String idTest) {
        Test test = testRepository.findById(Integer.parseInt(idTest)).get();
        List<Domanda> domandeTest = test.getDomandas();
        Set<Risposta> risposteCorrette = new HashSet<>();
        for (Domanda d : domandeTest) {
            if (!d.getTipoDomanda().getTTipoDomanda().equalsIgnoreCase("aperta")) {
                risposteCorrette.add( d.getRispostas().stream().filter((Risposta r) -> {
                    if (r.getFFlagCorretta() == 1) {
                        return true;
                    }
                    return false;
                }).collect(Collectors.toList()).get(0));
            }
        }
        return risposteCorrette;
    }

    private Integer calcolaPunteggioTest(String idTest, String idUtente) {
        Set<Risposta> risposteCorrette = getSetRisposteCorretteByIdTest(idTest);
        Set<Risposta> risposteUtente = getSetRisposteUtenteByIdTestIdUtente(idTest, idUtente);
        Integer cntCorrette = 0;
        for (Risposta rCorretta : risposteCorrette) {
            if (risposteUtente.contains(rCorretta)) {
                cntCorrette += 1;
            }
        }
        System.out.println("Il punteggio del test è: " + cntCorrette + " su " + risposteCorrette.size());
        return cntCorrette;
    }
}