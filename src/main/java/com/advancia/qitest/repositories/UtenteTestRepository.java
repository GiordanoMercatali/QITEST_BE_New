package com.advancia.qitest.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.advancia.qitest.dtos.TestDTO;
import com.advancia.qitest.models.Utente;
import com.advancia.qitest.models.UtenteTest;

import jakarta.persistence.TypedQuery;

public interface UtenteTestRepository extends JpaRepository<UtenteTest, Integer> {

//	// Metodo per trovare il test associato al quiz
//	TestDTO findTestByIdQuiz(int i);
//
//	// Metodo per trovare l'esame associato al quiz
//	EsameDTO findEsameByIdQuiz(int i);

	// Metodo per trovare tutti i quiz di un utente
	List<UtenteTest> findByUtente(Utente utente);

//	@Query("SELECT ut FROM UtenteTest ut JOIN ut.utente u WHERE u = :utente")
//	List<UtenteTest> findByUtente(@Param("utente") Utente utente);

	// Metodo per trovare i quiz per utente e tipo (Test o Esame)
	List<UtenteTest> findByUtenteAndTipoQuiz(Utente utente, String tipoQuiz);
}