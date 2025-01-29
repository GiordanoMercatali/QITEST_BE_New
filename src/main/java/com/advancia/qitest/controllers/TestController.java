package com.advancia.qitest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.advancia.qitest.dtos.TestDTO;
import com.advancia.qitest.services.TestService;

@RestController
public class TestController {
	
	@Autowired
	private TestService testService;
	
	@GetMapping("api/test")
	public ResponseEntity<List<TestDTO>> getTest() {
		List<TestDTO> listTest = testService.findAllTestDTO();
		return ResponseEntity.ok(listTest);
	}

}