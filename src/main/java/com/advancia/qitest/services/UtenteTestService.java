package com.advancia.qitest.services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.advancia.qitest.dtos.UtenteTestDTO;
import com.advancia.qitest.models.Utente;
import com.advancia.qitest.models.UtenteTest;
import com.advancia.qitest.repositories.UtenteTestRepository;

@Service
public class UtenteTestService {

	@Autowired
	private UtenteTestRepository utenteTestRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public List<UtenteTest> getListaUtenteTest(Utente utente) {
        return utenteTest.findByUtente(utente);
    }
	
	   private UtenteTestDTO convertToDto(UtenteTest ut) {
	        return modelMapper.map(ut, UtenteTestDTO.class);
	    }

	      
	   
}
