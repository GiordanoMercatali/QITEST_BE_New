package com.advancia.qitest.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.advancia.qitest.models.Risposta;
import com.advancia.qitest.models.RispostaUtente;

@Repository
public interface RispostaUtenteRepository extends JpaRepository<RispostaUtente, Integer> {
   
   // Trova tutte le risposte di un utente per un quiz
   // List<RispostaUtenteDTO> findByUtenteIdUtenteAndQuizUtenteIdUtenteQuiz(int idUtente, int idQuiz);
   
   // Trova tutte le risposte di un utente per un quiz specifico e un test
   // List<RispostaUtenteDTO> findByUtenteIdUtenteAndQuizUtenteIdUtenteQuizAndTestIdTest(int idUtente, int idQuiz, int idTest);
   
   // Trova tutte le risposte di un test specifico e utente
   @Query("SELECT ru.risposta FROM RispostaUtente ru WHERE ru.utente.idUtente = :idUtente AND ru.test.idTest = :idTest")
   List<Risposta> findAllRispostaByUtenteIdUtenteAndTestIdTest(@Param("idUtente") Integer idUtente, 
         @Param("idTest") Integer idTest);

   // Trova tutte le risposte di un utente per una domanda specifica
   // List<RispostaUtenteDTO> findByDomandaIdDomandaAndUtenteIdUtenteAndQuizUtenteIdUtenteQuiz(int idDomanda, int idUtente, int idQuiz);
}