package com.advancia.qitest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
	
	@PostMapping("api/create/utenteTest")
	public ResponseEntity<UtenteTest> creaUtenteTest(@RequestBody UtenteTest utenteTest) {
		UtenteTest utNuovo = utService.salvaUtenteTest(utenteTest);
		return new ResponseEntity<>(utNuovo, HttpStatus.CREATED);
	}

}