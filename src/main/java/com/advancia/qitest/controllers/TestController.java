package com.advancia.qitest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.advancia.qitest.dtos.DomandaDTO;
import com.advancia.qitest.dtos.TestDTO;
import com.advancia.qitest.services.DomandaService;
import com.advancia.qitest.services.TestService;

@RestController
public class TestController {

	@Autowired
	private TestService testService;
	
	@Autowired
	private DomandaService domandaService;

	@GetMapping("api/test")
	public ResponseEntity<List<TestDTO>> getTest() {
		List<TestDTO> listTest = testService.findAllTestDTO();
		return ResponseEntity.ok(listTest);
	}

	@GetMapping("api/test/utente/{idUtente}")
	public ResponseEntity<List<TestDTO>> getTestNonEseguitiByIdUtente(@PathVariable String idUtente) {
		List<TestDTO> listTestUtente = testService.findAllTestDTONonEseguitiByIdUtente(idUtente);
		return ResponseEntity.ok(listTestUtente);
	}
	
	@GetMapping("api/test/{idTest}/domande")
	public ResponseEntity<List<DomandaDTO>> getListaDomandaDTOByIdTest(@PathVariable String idTest) {
		List<DomandaDTO> listDomandeTest = domandaService.findAllDomandeDTOByIdTest(idTest);
		return ResponseEntity.ok(listDomandeTest);
	}
}