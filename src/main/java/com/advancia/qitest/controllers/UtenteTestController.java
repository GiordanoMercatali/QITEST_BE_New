package com.advancia.qitest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.advancia.qitest.dtos.UtenteTestDTO;
import com.advancia.qitest.models.UtenteTest;
import com.advancia.qitest.services.UtenteTestService;

@RestController
public class UtenteTestController {

	@Autowired
	private UtenteTestService utService;

//	@GetMapping("api/utenteTest")
//	public ResponseEntity<List<UtenteTestDTO>> getTest() {
//		List<UtenteTestDTO> utList = utService.findAllTestDTO();
//		return ResponseEntity.ok(utList);
//	}

//	@PostMapping(path = "api/create/utenteTest", consumes = "application/json")
//	public ResponseEntity<UtenteTest> creaUtenteTest(@RequestBody UtenteTest utenteTest) {
//		// conversione delle stringhe nel formdata in interi -- da inserire --
//		UtenteTest utNuovo = utService.salvaUtenteTest(utenteTest);
//		return new ResponseEntity<>(utNuovo, HttpStatus.CREATED);
//	}

//	@PostMapping(path = "api/create/utenteTest", consumes = "application/json")
//	public ResponseEntity<UtenteTest> creaUtenteTest(@RequestBody UtenteTestDTO utenteTestDTO) {
//		
//		
//		//Spostare la conversione sul Service
//		
//				
//		return new ResponseEntity<>(utService.salvaUtenteTest(utenteTestDTO), HttpStatus.CREATED);
//	}

	@PostMapping(path = "api/create/utenteTest", consumes = "application/json")
	public ResponseEntity<UtenteTest[]> creaUtentiTest(@RequestBody UtenteTestDTO utenteTestDTO) {

		return new ResponseEntity<>(utService.salvaUtentiTest(utenteTestDTO), HttpStatus.CREATED);
	}
}