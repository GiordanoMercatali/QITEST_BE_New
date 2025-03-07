package com.advancia.qitest.services;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.advancia.qitest.models.Domanda;
import com.advancia.qitest.models.EsecuzioneTest;
import com.advancia.qitest.models.RispostaUtente;
import com.advancia.qitest.repositories.DomandaRepository;
import com.advancia.qitest.repositories.EsecuzioneTestRepository;
import com.advancia.qitest.repositories.RispostaRepository;
import com.advancia.qitest.repositories.RispostaUtenteRepository;
import com.advancia.qitest.repositories.test.TestRepository;
import com.advancia.qitest.repositories.utente.UtenteRepository;

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

    @Autowired
    private EsecuzioneTestRepository esecuzioneTestRepository;

    public void saveRisposteTest(String idTest, String idUtente, Map<String, List<String>> domandeRisposte) {
        for (String idDomanda : domandeRisposte.keySet()) {
            Set<String> risposte = new HashSet<>(domandeRisposte.get(idDomanda));
            if(risposte.size() > 0) {
                for (String risposta : risposte) {
                    RispostaUtente ru = new RispostaUtente();
                    Domanda domanda = domandaRepository.findById(Integer.parseInt(idDomanda)).get();
                    EsecuzioneTest et = esecuzioneTestRepository.findByIdUtenteAndIdTest(Integer.parseInt(idUtente), Integer.parseInt(idTest));
                    ru.setUtente(utenteRepository.findById(Integer.parseInt(idUtente)).get());
                    ru.setDomanda(domanda);
                    ru.setTest(testRepository.findById(Integer.parseInt(idTest)).get());
                    if (domanda.getTipoDomanda().getTTipoDomanda().equalsIgnoreCase("aperta")) {
                        ru.setTestoRisposta(risposta);
                    } else {
                        ru.setRisposta(rispostaRepository.findById(Integer.parseInt(risposta)).get());
                    }
                    ru.setQuizUtente(et.getQuizUtente());
                    rispostaUtenteRepository.save(ru);
                }
            } else {
                RispostaUtente ru = new RispostaUtente();
                Domanda domanda = domandaRepository.findById(Integer.parseInt(idDomanda)).get();
                EsecuzioneTest et = esecuzioneTestRepository.findByIdUtenteAndIdTest(Integer.parseInt(idUtente),
                        Integer.parseInt(idTest));
                ru.setUtente(utenteRepository.findById(Integer.parseInt(idUtente)).get());
                ru.setDomanda(domanda);
                ru.setTest(testRepository.findById(Integer.parseInt(idTest)).get());
                ru.setQuizUtente(et.getQuizUtente());
                rispostaUtenteRepository.save(ru);
            }
        }
    }
}