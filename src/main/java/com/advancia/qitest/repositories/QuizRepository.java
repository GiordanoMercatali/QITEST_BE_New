package com.advancia.qitest.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.advancia.qitest.dtos.EsameDTO;
import com.advancia.qitest.dtos.TestDTO;
import com.advancia.qitest.models.Quiz;
import com.advancia.qitest.models.Utente;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Integer> {
    
    // Metodo per trovare il test associato al quiz
    TestDTO findTestByIdQuiz(int i);
    
    // Metodo per trovare l'esame associato al quiz
    EsameDTO findEsameByIdQuiz(int i);
    
    // Metodo per trovare tutti i quiz di un utente
    List<Quiz> findByUtente(Utente utente);

    // Metodo per trovare i quiz per utente e tipo (Test o Esame)
    List<Quiz> findByUtenteAndTipoQuiz(Utente utente, String tipoQuiz);
}