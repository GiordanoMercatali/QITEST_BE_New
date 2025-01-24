package com.advancia.qitest.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.advancia.qitest.dtos.EsameDTO;
import com.advancia.qitest.dtos.TestDTO;
import com.advancia.qitest.models.Utente;
import com.advancia.qitest.models.UtenteTest;

@Repository
public interface UtenteTestRepository extends JpaRepository<UtenteTest, Integer> {

	// Metodo per trovare il test associato al quiz
	TestDTO findTestByIdQuiz(int i);

	// Metodo per trovare l'esame associato al quiz
	EsameDTO findEsameByIdQuiz(int i);

	// Metodo per trovare tutti i quiz di un utente
	List<UtenteTest> findByUtente(Utente utente);

	// Metodo per trovare i quiz per utente e tipo (Test o Esame)
	List<UtenteTest> findByUtenteAndTipoQuiz(Utente utente, String tipoQuiz);
}