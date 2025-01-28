package com.advancia.qitest.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.advancia.qitest.dtos.UtenteDTO;
import com.advancia.qitest.models.Utente;
import com.advancia.qitest.services.LoginService;
import com.advancia.qitest.utils.AuthRequest;

@RestController
public class LoginController {

	@Autowired
	LoginService loginService;
	
	@PostMapping(value="/login")
	public UtenteDTO login(@RequestBody AuthRequest request){
		ModelMapper modelMapper = new ModelMapper();
		ResponseEntity<?> response = loginService.login(request);
		
		Utente utente = (Utente) response.getBody();
		UtenteDTO uDto = new UtenteDTO();
		uDto = modelMapper.map(utente, UtenteDTO.class);
		
		System.out.println(response);
		System.out.println(utente.toString());
		System.out.println(uDto.toString());
		return uDto;
	}
}