package com.advancia.qitest.repositories.utente;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.advancia.qitest.dtos.UtenteDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Repository
public class UtenteRepositoryCustomImpl implements UtenteRepositoryCustom {

	@PersistenceContext
	EntityManager em;

	/**
	 * metodo per l'ottenimento delle informazioni essenziali per gli utenti
	 * visualizzati in anteprima
	 */
	@Override
	public List<UtenteDTO> findAllCruscotto() {
		TypedQuery<UtenteDTO> query = em.createQuery(
				"select new com.advancia.qitest.dtos.UtenteDTO(u.idUtente, u.profilo, u.tCognome, u.email, u.tNome) from Utente u",
				UtenteDTO.class);
		return query.getResultList();
	}
}
