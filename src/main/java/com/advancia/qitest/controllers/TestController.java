package com.advancia.qitest.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.advancia.qitest.dtos.DomandaDTO;
import com.advancia.qitest.dtos.TestDTO;
import com.advancia.qitest.services.DomandaService;
import com.advancia.qitest.services.EsecuzioneTestService;
import com.advancia.qitest.services.RispostaUtenteService;
import com.advancia.qitest.services.TestService;
import com.advancia.qitest.utils.RispostaTestRequest;

@RestController
public class TestController {

	@Autowired
	private TestService testService;

	@Autowired
	private EsecuzioneTestService esecuzioneTestService;
	
	@Autowired
	private DomandaService domandaService;

	@Autowired
	private RispostaUtenteService rispostaUtenteService;

	@GetMapping("api/test")
	public ResponseEntity<List<TestDTO>> getTest() {
		List<TestDTO> listTest = testService.findAllTestDTO();
		return ResponseEntity.ok(listTest);
	}

	@GetMapping("api/test/utente/{idUtente}")
	public ResponseEntity<List<TestDTO>> getTestNonEseguitiByIdUtente(@PathVariable String idUtente) {
		List<TestDTO> listTestUtente = esecuzioneTestService.findAllTestDTONonEseguitiByIdUtente(idUtente);
		return ResponseEntity.ok(listTestUtente);
	}
	
	@GetMapping("api/test/{idTest}/domande")
	public ResponseEntity<List<DomandaDTO>> getListaDomandaDTOByIdTest(@PathVariable String idTest) {
		List<DomandaDTO> listDomandeTest = domandaService.findAllDomandeDTOByIdTest(idTest);
		return ResponseEntity.ok(listDomandeTest);
	}

	@PostMapping(value = "/api/test/{idTest}/utente/{idUtente}/risposte", consumes = "application/json")
	public ResponseEntity<String> postRisposteTest(@PathVariable String idTest, @PathVariable String idUtente, @RequestBody RispostaTestRequest rispostaTestRequest) {
		rispostaUtenteService.saveRisposteTest(idTest, idUtente, rispostaTestRequest.getMappaDomandaRisposta());
		esecuzioneTestService.updateFineEsecuzioneTest(idTest, idUtente);
		return ResponseEntity.ok("Test caricato correttamente");
	}

	@PatchMapping(value = "/api/test/{idTest}/utente/{idUtente}/inizio", consumes = "application/json")
	public ResponseEntity<String> patchInizioTest(@PathVariable String idTest, @PathVariable String idUtente) {
		esecuzioneTestService.updateInizioEsecuzioneTest(idTest, idUtente);
		return ResponseEntity.ok("Test iniziato correttamente");
	}
}