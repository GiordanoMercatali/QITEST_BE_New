package com.advancia.qitest.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.advancia.qitest.dtos.RispostaDTO;
import com.advancia.qitest.models.Risposta;

public interface RispostaRepository extends JpaRepository<Risposta, Integer> {

	// Trova una risposta per ID
	RispostaDTO findByIdRisposta(int idRisposta);

	// Trova tutte le risposte per una determinata domanda
	List<RispostaDTO> findByDomandaIdDomanda(int idDomanda);
}
