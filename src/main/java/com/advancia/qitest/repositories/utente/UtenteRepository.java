package com.advancia.qitest.repositories.utente;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.advancia.qitest.models.Utente;

public interface UtenteRepository
		extends JpaRepository<Utente, Integer>, CrudRepository<Utente, Integer>, UtenteRepositoryCustom {

	@Query("SELECT u FROM Utente u WHERE u.email = :username AND u.pPassword = :password AND u.fDeleted = false")
	Utente findByEmailAndPassword(String username, String password);

	Utente findByEmail(String email);

	@Query("SELECT u FROM Utente u WHERE u.azienda.idAzienda = :idAzienda AND u.fDeleted = false ORDER BY u.idUtente DESC")
	List<Utente> findAllByAziendaIdAndFDeletedFalse(@Param("idAzienda") Integer idAzienda);

	@Query("SELECT u FROM Utente u WHERE u.idUtente = :idUtente AND u.fDeleted = false")
	Utente findActiveById(Integer idUtente);	

}