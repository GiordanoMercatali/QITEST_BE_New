package com.advancia.qitest.repositories.test;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.advancia.qitest.dtos.TestDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Repository
public class TestRepositoryCustomImpl implements TestRepositoryCustom {

	@PersistenceContext
	EntityManager em;

	private static String EXTRACT_ALL_TEST_DTO = "select new com.advancia.qitest.dtos.TestDTO(t.idTest, t.tDescrizioneTest, t.tDurata, t.ordine) from Test t";

	@Override
	public List<TestDTO> findAllTestDTO() {
		TypedQuery<TestDTO> query = em.createQuery(EXTRACT_ALL_TEST_DTO, TestDTO.class);
		return query.getResultList();
	}

}