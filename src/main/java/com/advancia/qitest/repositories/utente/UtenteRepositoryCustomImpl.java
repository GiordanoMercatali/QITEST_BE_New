package com.advancia.qitest.repositories.utente;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.advancia.qitest.dtos.UtenteDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Repository
public class UtenteRepositoryCustomImpl implements UtenteRepositoryCustom {

	@PersistenceContext
	EntityManager em;

	private static String EXTRACT_ALL_UTENTE_DTO = "select new com.advancia.qitest.dtos.UtenteDTO(u.idUtente, u.profilo, u.tCognome, u.email, u.tNome) from Utente u";

	@Override
	public List<UtenteDTO> findAllCruscotto() {
		TypedQuery<UtenteDTO> query = em.createQuery(EXTRACT_ALL_UTENTE_DTO, UtenteDTO.class);
		return query.getResultList();
	}

	@Override
	public List<UtenteDTO> searchByFilter(String tNome, String tCognome, String email) {
		StringBuilder str = new StringBuilder();
		str.append(EXTRACT_ALL_UTENTE_DTO);
		str.append(" where 1=1 ");
		Map<String, String> params = new HashMap<>();
		if (null != tNome && !tNome.equals("")) {
			str.append(" and u.tNome LIKE :nome ");
	        params.put("nome", tNome + "%");
		}
		if (null != tCognome && !tCognome.equals("")) {
			str.append(" and u.tCognome LIKE :cognome ");
	        params.put("cognome", tCognome + "%");
		}
		if (null != email && !email.equals("")) {
			str.append(" and u.email LIKE :email ");
	        params.put("email", email + "%");
		}
		TypedQuery<UtenteDTO> query = em.createQuery(str.toString(), UtenteDTO.class);
		params.keySet().forEach(key -> query.setParameter(key, params.get(key)));
		return query.getResultList();
	}
}
