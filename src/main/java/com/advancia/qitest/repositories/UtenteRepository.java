package com.advancia.qitest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.advancia.qitest.models.Utente;

import java.util.List;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, Integer>, CrudRepository<Utente, Integer> {

	@Query("SELECT u FROM Utente u WHERE u.email = :username AND u.pPassword = :password AND u.fDeleted = false")
	Utente findByEmailAndPassword(String username, String password);
	
	Utente findByEmail(String email);

    @Query("SELECT u FROM Utente u WHERE u.azienda.idAzienda = :idAzienda AND u.fDeleted = false ORDER BY u.idUtente DESC")
    List<Utente> findAllByAziendaIdAndFDeletedFalse(@Param("idAzienda") Integer idAzienda);

    @Query("SELECT u FROM Utente u WHERE u.idUtente = :idUtente AND u.fDeleted = false")
    Utente findActiveById(Integer idUtente);

    @Query("SELECT u FROM Utente u WHERE u.email LIKE %:username% AND u.fDeleted = false")
    List<Utente> searchByUsername(String username);
}
