//package com.advancia.qitest.repositories;
//
//import java.sql.Timestamp;
//import java.util.List;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//
//import com.advancia.qitest.dtos.EsecuzioneTestDTO;
//import com.advancia.qitest.dtos.TestDTO;
//import com.advancia.qitest.models.EsecuzioneTest;
//import com.advancia.qitest.models.Test;
//
//public interface EsecuzioneTestRepository extends JpaRepository<EsecuzioneTest, Integer> {
//
//    @Query("SELECT ts FROM EsecuzioneTest ts WHERE ts.quizUtente.idUtenteQuiz = :idQuiz AND ts.utente.idUtente = :idUtente AND ts.test.idTest = :idTest")
//    List<EsecuzioneTestDTO> findEsecuzioneByQuizUtenteAndTest(@Param("idQuiz") int idQuiz, @Param("idUtente") int idUtente, @Param("idTest") int idTest);
//
//    @Query("SELECT ts FROM EsecuzioneTest ts WHERE ts.test.idTest = :idTest AND ts.utente.idUtente = :idUtente AND ts.dDataEndTest IS NULL")
//    List<EsecuzioneTest> findEsecuzioneInCorso(@Param("idTest") int idTest, @Param("idUtente") int idUtente);
//
//    @Query("SELECT ts.test FROM EsecuzioneTest ts WHERE ts.utente.idUtente = :idUtente AND ts.dDataEndTest IS NULL ORDER BY ts.dDataEndTest ASC")
//    List<TestDTO> findTestInCorso(@Param("idUtente") int idUtente);
//
//    @Query("SELECT ts.dDataIniTest FROM EsecuzioneTest ts WHERE ts.test.idTest = :idTest AND ts.utente.idUtente = :idUtente AND ts.dDataEndTest IS NULL")
//    Timestamp findInizioTest(@Param("idTest") int idTest, @Param("idUtente") int idUtente);
//
//    @Query("SELECT ts.test.idTest FROM EsecuzioneTest ts WHERE ts.utente.idUtente = :idUtente AND ts.dDataEndTest IS NOT NULL")
//    List<Integer> findIdTestEseguiti(@Param("idUtente") int idUtente);
//
//    @Query("SELECT ts.test FROM EsecuzioneTest ts WHERE ts.utente.idUtente = :idUtente AND ts.dDataEndTest IS NOT NULL")
//    List<Test> findTestEseguiti(@Param("idUtente") int idUtente);
//}
