//package com.advancia.qitest.repositories;
//
//import java.util.List;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import com.advancia.qitest.dtos.LogEventiDTO;
//import com.advancia.qitest.models.LogEventi;
//
//@Repository
//public interface LogEventiRepository extends JpaRepository<LogEventi, Integer> {
//
//    List<LogEventiDTO> findByUtenteIdUtente(int idUtente);
//
//    List<LogEventiDTO> findByQuizIdQuiz(int idQuiz);
//}