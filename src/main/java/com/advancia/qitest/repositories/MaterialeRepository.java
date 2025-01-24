//package com.advancia.qitest.repositories;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
//
//import com.advancia.qitest.models.MaterialeDomanda;
//import com.advancia.qitest.models.MaterialeQuiz;
//
//import java.util.List;
//
//@Repository
//public interface MaterialeRepository extends JpaRepository<MaterialeQuiz, Integer> {
//
//    @Query("SELECT m FROM MaterialeQuiz m JOIN Quiz q ON q.idQuiz = m.test.idTest WHERE q.idUtenteQuiz = :idUtenteQuiz AND q.flagStudio = TRUE ORDER BY m.ordine")
//    List<MaterialeQuiz> findMaterialeByUtenteQuiz(int idUtenteQuiz);
//
//    List<MaterialeQuiz> findByTestIdTest(int idTest);
//
//    @Query("SELECT m FROM MaterialeDomanda m WHERE m.domanda.idDomanda = :idDomanda")
//    List<MaterialeDomanda> findMaterialeDomandaByIdDomanda(int idDomanda);
//
//
//}