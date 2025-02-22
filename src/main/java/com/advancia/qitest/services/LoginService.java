package com.advancia.qitest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.advancia.qitest.models.Utente;
import com.advancia.qitest.repositories.utente.UtenteRepository;
import com.advancia.qitest.utils.AuthRequest;

@Service
@Transactional
public class LoginService {

	@Autowired
	private UtenteRepository utenteRepository;

	public LoginService() {

	}

	public ResponseEntity<?> login(AuthRequest request) {
		Utente user = utenteRepository.findByEmailAndPassword(request.username, request.password);
		new ResponseEntity<Utente>(HttpStatus.ACCEPTED);
		return ResponseEntity.ok(user);
	}
}