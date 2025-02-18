package com.advancia.qitest.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.advancia.qitest.models.Test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Repository
public class EsecuzioneTestRepositoryImpl implements EsecuzioneTestRepositoryCustom {
	@PersistenceContext
	EntityManager entityManager;
	
	public List<Test> findAllListaTestUtenteById(String idUtente) {
		TypedQuery<Test> query = entityManager.createQuery(""
				+ "select t "
				+ "from EsecuzioneTest et, Test t "
				+ "where et.utente.idUtente = :idUtente "
				+ "  and et.dDataIniTest IS NULL "
				+ "  and et.test.idTest = t.idTest ", 
				Test.class);
		query.setParameter("idUtente", idUtente);
		return query.getResultList();
	}
}