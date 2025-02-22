package com.advancia.qitest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.advancia.qitest.dtos.UtenteDTO;
import com.advancia.qitest.models.Utente;
import com.advancia.qitest.services.UtenteService;

@RestController
public class UtenteController {

	@Autowired
	private UtenteService utenteService;

	@GetMapping("api/utenti")
	public ResponseEntity<List<UtenteDTO>> getUtenti() {
		List<UtenteDTO> listUtenti = utenteService.findAllUtenti();

		return ResponseEntity.ok(listUtenti);
	}
	
	@GetMapping("api/utentiAll")
	public ResponseEntity<List<Utente>> getUtentiAll() {
		List<Utente> listUtenti = utenteService.findAll();

		return ResponseEntity.ok(listUtenti);
	}

	@GetMapping("api/utenti/{idUtente}")
	public ResponseEntity<UtenteDTO> getUtenteById(@PathVariable int idUtente) {
		UtenteDTO utente = utenteService.getUtenteById(idUtente);
		return ResponseEntity.ok(utente);
	}

	@DeleteMapping("api/utenti/{idUtente}")
	public boolean eliminaUtente(@PathVariable int idUtente) {
		return utenteService.eliminaUtente(idUtente);
	}

	@GetMapping("api/utenti/search")
	public List<UtenteDTO> searchUtenti(@RequestParam(required = false) String tNome,
			@RequestParam(required = false) String tCognome, @RequestParam(required = false) String email) {
		return utenteService.searchUtenti(tNome, tCognome, email);
	}
}
