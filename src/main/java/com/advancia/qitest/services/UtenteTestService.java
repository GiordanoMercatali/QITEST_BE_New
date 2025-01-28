package com.advancia.qitest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.advancia.qitest.models.Utente;
import com.advancia.qitest.models.UtenteTest;
import com.advancia.qitest.repositories.UtenteTestRepository;

@Service
@Transactional
public class UtenteTestService {

	@Autowired
	private UtenteTestRepository utenteTestRepository;

	public List<UtenteTest> getListaUtenteTest(Utente utente) {
		return utenteTestRepository.findByUtente(utente);
	}

}
