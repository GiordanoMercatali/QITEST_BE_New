package com.advancia.qitest.services;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.advancia.qitest.dtos.DomandaDTO;
import com.advancia.qitest.dtos.RispostaDTO;
import com.advancia.qitest.dtos.TipoDomandaDTO;
import com.advancia.qitest.models.Domanda;
import com.advancia.qitest.models.Risposta;
import com.advancia.qitest.models.TipoDomanda;
import com.advancia.qitest.repositories.test.TestRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class DomandaService {

	@Autowired
	private TestRepository testRepository;

	public DomandaService() {
	}

	public List<DomandaDTO> findAllDomandeDTOByIdTest(String idTest) {
		// uso il set per togliere tutti i duplicati
		Set<Domanda> domande = new HashSet<>(testRepository.findById(Integer.parseInt(idTest)).get().getDomandas());
		List<DomandaDTO> listaDomandeDto = new ArrayList<>();
		for (Domanda d : domande) {
			if (!d.isfDeleted()) {
				DomandaDTO domandaDto = new DomandaDTO();
				TipoDomandaDTO tdDto = new TipoDomandaDTO();
				TipoDomanda td = d.getTipoDomanda();
				tdDto.setIdTipoDomanda(td.getId_tipo_domanda());
				tdDto.settTipoDomanda(td.getTTipoDomanda());

				Set<RispostaDTO> listaRisposteDto = new HashSet<>();
				Set<Risposta> listaRisposte = new HashSet<>(d.getRispostas());
				for (Risposta r : listaRisposte) {
					if (!r.isfDeleted()) {
						RispostaDTO rDto = new RispostaDTO();
						rDto.setIdRisposta(r.getIdRisposta());
						rDto.setfFlagCorretta(r.getFFlagCorretta());
						rDto.settImagePath(r.getTImagePath());
						rDto.settTestoRisposta(r.getTTestoRisposta());
						listaRisposteDto.add(rDto);
					}
				}
				domandaDto.setIdDomanda(d.getIdDomanda());
				domandaDto.setRisposte(new ArrayList<>(listaRisposteDto));
				domandaDto.settImagePath(d.getTImagePath());
				domandaDto.settTestoDomanda(d.getTTestoDomanda());
				domandaDto.setTipoDomanda(tdDto);
				listaDomandeDto.add(domandaDto);
			}
		}
		return listaDomandeDto;
	}
}