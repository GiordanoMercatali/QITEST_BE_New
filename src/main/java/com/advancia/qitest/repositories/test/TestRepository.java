package com.advancia.qitest.repositories.test;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.advancia.qitest.dtos.TestDTO;
import com.advancia.qitest.models.Test;
import com.advancia.qitest.models.Utente;

public interface TestRepository extends JpaRepository<Test, Integer>, TestRepositoryCustom {

	// Trova un test non eliminato (fDeleted == 0) per idTest
	List<Test> findByIdTestAndLogicDeleted(int idTest, int logicDeleted);

	// Trova tutti i test non eliminati
	List<TestDTO> findByLogicDeleted(int logicDeleted);
	
	@Query("SELECT t FROM Test t WHERE t.idTest = :idTest")
	Test findTestById(Integer idTest);

}
