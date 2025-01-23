package com.advancia.qitest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.advancia.qitest.dtos.UtenteDTO;
import com.advancia.qitest.services.UtenteService;

@RestController
public class UtenteController {

	@Autowired
	private UtenteService utenteService;

//	@GetMapping("api/utenti")
//	public List<UtenteDTO> getAllUtenti() {
//		return utenteService.findAllUtenti();
//	}
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("api/utenti")
	public ResponseEntity<List<UtenteDTO>> getUtenti() {
		List<UtenteDTO> listUtenti = utenteService.findAllUtenti();
		
		return ResponseEntity.ok(listUtenti);
	}

	@GetMapping("api/utenti/{idUtente}")
	public ResponseEntity<UtenteDTO> getUtenteById(@PathVariable int idUtente) {
		UtenteDTO utente = utenteService.getUtenteById(idUtente);
		return ResponseEntity.ok(utente);
	}
//	@GetMapping("api/utenti/{idUtente}")
//	public UtenteDTO getUtenteById(@PathVariable int idUtente) {
//		return utenteService.getUtenteById(idUtente);
//	}
	
	
//
//	@GetMapping("/email/{email}")
//	public UtenteDTO getUtenteByEmail(@PathVariable String email) {
//		return utenteService.getUtenteByEmail(email);
//	}
//
//	@GetMapping("/azienda/{idAzienda}")
//	public List<UtenteDTO> getAllUtenti(@PathVariable int idAzienda) {
//		return utenteService.getAllUtenti(idAzienda);
//	}
//
//	// TODO
//	/*
//	 * org.hibernate.HibernateException: A collection with
//	 * cascade="all-delete-orphan" was no longer referenced by the owning entity
//	 * instance
//	 */
//	@PostMapping("/merge")
//	public boolean mergeUtente(@RequestBody UtenteDTO utente) {
//		return utenteService.mergeUtente(utente);
//	}
//
//	// TODO
//	@PostMapping("/trasformaGuest")
//	public boolean trasformaGuest(@RequestBody UtenteDTO utente) {
//		return utenteService.trasformaGuest(utente);
//	}
//
//	// WORKS
	@DeleteMapping("api/utenti/{idUtente}")
	public boolean eliminaUtente(@PathVariable int idUtente) {
		return utenteService.eliminaUtente(idUtente);
	}

//	// WORKS
	@GetMapping("api/utenti/search")
	public List<UtenteDTO> searchUtenti(
			@RequestParam(required = false) String tNome,
			@RequestParam(required = false) String tCognome,
			@RequestParam(required = false) String email) {
		return utenteService.searchUtenti(tNome, tCognome, email);
	}
}
