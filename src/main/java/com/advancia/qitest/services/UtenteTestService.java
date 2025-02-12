package com.advancia.qitest.services;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.advancia.qitest.dtos.UtenteTestDTO;
import com.advancia.qitest.models.Utente;
import com.advancia.qitest.models.UtenteTest;
import com.advancia.qitest.repositories.UtenteTestRepository;
import com.advancia.qitest.repositories.test.TestRepository;
import com.advancia.qitest.repositories.utente.UtenteRepository;

@Service
@Transactional
public class UtenteTestService {
	
	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private UtenteTestRepository utRepository;
	
	@Autowired
	private UtenteRepository utenteRepository;
	
	@Autowired
	private TestRepository testRepository;

	public List<UtenteTest> getListaUtenteTest(Utente utente) {
		return utRepository.findByUtente(utente);
	}
	
	public List<UtenteTestDTO> findAllTestDTO() {
		return utRepository.findAll().stream().map(this::convertToDto).collect(Collectors.toList());
	}
	
	private UtenteTestDTO convertToDto(UtenteTest utenteTest) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		return modelMapper.map(utenteTest, UtenteTestDTO.class);
	}
	
	public UtenteTest salvaUtenteTest(UtenteTest utenteTest) {
		return utRepository.save(utenteTest);
	}

    
    public UtenteTest convertToEntity(UtenteTestDTO utDTO) {
    	UtenteTest ut = new UtenteTest();
		ut.setUtente(utenteRepository.findUtenteById(utDTO.getIdUtente()));
		ut.setTest(testRepository.findTestById(utDTO.getIdTest()));
		ut.setTipoQuiz("T");
		return ut;
		
	}
}
