package com.advancia.qitest.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.advancia.qitest.dtos.UtenteTestDTO;
import com.advancia.qitest.models.EsecuzioneTest;
import com.advancia.qitest.models.Utente;
import com.advancia.qitest.models.UtenteTest;
import com.advancia.qitest.repositories.EsecuzioneTestRepository;
import com.advancia.qitest.repositories.UtenteTestRepository;
import com.advancia.qitest.repositories.test.TestRepository;
import com.advancia.qitest.repositories.utente.UtenteRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Service
@Transactional
public class UtenteTestService {

	@PersistenceContext
	private EntityManager em;

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private UtenteTestRepository utRepository;

	@Autowired
	private UtenteRepository utenteRepository;

	@Autowired
	private TestRepository testRepository;

	@Autowired
	private EsecuzioneTestRepository esecuzioneTestRepository;

	public List<UtenteTest> getListaUtenteTestByUtenteId(Integer utenteId) {
		Utente utente = utenteRepository.findUtenteById(utenteId);
		return utRepository.findByUtente(utente);
	}

	public List<UtenteTestDTO> findAllTestDTO() {
		return utRepository.findAll().stream().map(this::convertToDto).collect(Collectors.toList());
	}

	private UtenteTestDTO convertToDto(UtenteTest utenteTest) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		return modelMapper.map(utenteTest, UtenteTestDTO.class);
	}

//	public UtenteTest salvaUtenteTest(UtenteTestDTO utenteTestDTO) {
//		for (int idTest : utenteTestDTO.getIdTest()) {
//			System.out.println("l'idTest valutato è: " + idTest);
//			TypedQuery<Test> query = em.createQuery("SELECT t FROM test t WHERE t.idTest = :id", Test.class);
//			query.setParameter("id", idTest);
//			query.getResultList();
//			System.out
//					.println("QUERY PARAMETRIZZATA: " + query.getResultList().toString() + " " + query.getResultList());
//		}
//		UtenteTest utNuovo = convertToEntity(utenteTestDTO);
//		return utRepository.save(utNuovo);
//	}
//
//	public UtenteTest convertToEntity(UtenteTestDTO utDTO) {
//		UtenteTest ut = new UtenteTest();
//		ut.setUtente(utenteRepository.findUtenteById(utDTO.getIdUtente()));
//		ut.setTest(testRepository.findTestsById(utDTO.getIdTest()));
//		ut.setTipoQuiz("T");
//		return ut;
//	}

	/**
	 * Aggiunge i test assegnati all'utente aggiungendo i record alla tabella
	 * utente_quiz e alla tabella esecuzione_test.
	 * 
	 * @param utDTO
	 * @return
	 */
	@Transactional
	public UtenteTest[] salvaUtentiTest(UtenteTestDTO utDTO) {
		UtenteTest[] utArray = convertToEntities(utDTO);
		List<UtenteTest> savedEntities = utRepository.saveAll(Arrays.asList(utArray));
		List<EsecuzioneTest> listaEsecuzioneTest = new ArrayList<>();
		for (UtenteTest ut : utArray) {
			EsecuzioneTest et = new EsecuzioneTest();
			et.setQuizUtente(ut);
			et.setUtente(ut.getUtente());
			et.setTest(ut.getTest());
			et.setDDataUpdate(null);
			listaEsecuzioneTest.add(et);
		}
		esecuzioneTestRepository.saveAll(listaEsecuzioneTest);
		return savedEntities.toArray(new UtenteTest[0]);
	}

	public UtenteTest[] convertToEntities(UtenteTestDTO utDTO) {
		List<UtenteTest> utList = new ArrayList<>();
		for (int idTest : utDTO.getIdTest()) {
			UtenteTest ut = new UtenteTest();
			ut.setUtente(utenteRepository.findUtenteById(utDTO.getIdUtente()));
			ut.setTest(testRepository.findTestById(idTest));
			ut.setTipoQuiz("T");
			utList.add(ut);
		}
		return utList.toArray(new UtenteTest[0]);
	}
}