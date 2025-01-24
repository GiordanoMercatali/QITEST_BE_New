//package com.advancia.qitest.repositories;
//
//import java.util.List;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import com.advancia.qitest.dtos.RispostaUtenteDTO;
//import com.advancia.qitest.models.RispostaUtente;
//
//@Repository
//public interface RispostaUtenteRepository extends JpaRepository<RispostaUtente, Integer> {
//    
//    // Trova tutte le risposte di un utente per un quiz
//    List<RispostaUtenteDTO> findByUtenteIdUtenteAndQuizUtenteIdUtenteQuiz(int idUtente, int idQuiz);
//    
//    // Trova tutte le risposte di un utente per un quiz specifico e un test
//    List<RispostaUtenteDTO> findByUtenteIdUtenteAndQuizUtenteIdUtenteQuizAndTestIdTest(int idUtente, int idQuiz, int idTest);
//
//    // Trova tutte le risposte di un test specifico e utente
//    List<Integer> findDistinctTestIdTestByUtenteIdUtenteAndTestIdTest(int idUtente, int idTest);
//
//    // Trova tutte le risposte di un utente per una domanda specifica
//    List<RispostaUtenteDTO> findByDomandaIdDomandaAndUtenteIdUtenteAndQuizUtenteIdUtenteQuiz(int idDomanda, int idUtente, int idQuiz);
//}