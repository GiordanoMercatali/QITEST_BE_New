package com.advancia.qitest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.advancia.qitest.dtos.TestDTO;
import com.advancia.qitest.models.Test;
import com.advancia.qitest.repositories.EsecuzioneTestRepository;
import com.advancia.qitest.repositories.test.TestRepository;

@Service
@Transactional
public class TestService {

	@Autowired
	private TestRepository testRepository;

	@Autowired
	private EsecuzioneTestRepository esecuzioneTestRepository;

	public List<TestDTO> findAllTestDTO() {
		return testRepository.findAllTestDTO();
	}

	public List<TestDTO> findAllTestDTONonEseguitiByIdUtente(String idUtente) {
		List<Test> list = esecuzioneTestRepository.findAllListaTestUtenteById(idUtente);
		List<TestDTO> listDto = new ArrayList<>();
		for (Test t : list) {
			TestDTO tDto = new TestDTO();
			tDto.setIdTest(t.getIdTest());
			tDto.settDescrizioneTest(t.getTDescrizioneTest());
			tDto.settDurata(t.getTDurata());
			tDto.setdDataInser(t.getDDataInser());
			listDto.add(tDto);
		}
		return listDto;
	}
}