package com.advancia.qitest.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.advancia.qitest.models.Esame;
import com.advancia.qitest.models.EsecuzioneEsame;
import com.advancia.qitest.models.Utente;

public interface EsecuzioneEsameRepository extends JpaRepository<EsecuzioneEsame, Integer> {

    @Query("SELECT e.esame FROM EsecuzioneEsame e WHERE e.utente = :utente")
    List<Esame> findEsamiEseguitiByUtente(@Param("utente") Utente utente);

    @Query("SELECT e FROM EsecuzioneEsame e WHERE e.utente = :utente")
    List<EsecuzioneEsame> findEsecuzioniByUtente(@Param("utente") Utente utente);

    @Query("SELECT e FROM EsecuzioneEsame e WHERE e.utente.idUtente = :idUtente AND e.esame.idEsame = :idEsame")
    EsecuzioneEsame findEsecuzioneByUtenteAndEsame(@Param("idUtente") int idUtente, @Param("idEsame") int idEsame);
}
