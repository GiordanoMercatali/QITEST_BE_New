package com.advancia.qitest.repositories.utente;

import java.util.List;

import com.advancia.qitest.dtos.UtenteDTO;

public interface UtenteRepositoryCustom {

	List<UtenteDTO> findAllCruscotto();

	List<UtenteDTO> searchByFilter(String tNome, String tCognome, String email);

}