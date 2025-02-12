package com.advancia.qitest.services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.advancia.qitest.dtos.UtenteDTO;
import com.advancia.qitest.models.Utente;
import com.advancia.qitest.repositories.utente.UtenteRepository;

@Service
@Transactional
public class UtenteService {

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private UtenteRepository utenteRepository;
	
//	@Autowired
//	private UtenteRepositoryCustomImpl utenteRepoCustomImpl;

	public List<UtenteDTO> findAllUtenti() {
		List<UtenteDTO> result = utenteRepository.findAllCruscotto();
		return result;
	}
	
	public List<Utente> findAll() {
		List<Utente> result = utenteRepository.findAll();
		return result;
	}

	public List<UtenteDTO> searchUtenti(String tNome, String tCognome, String email) {
		return utenteRepository.searchByFilter(tNome, tCognome, email);
	}

	public boolean eliminaUtente(int idUtente) {
		Utente utente = utenteRepository.findById(idUtente).orElse(null);
		if (utente != null) {
			utenteRepository.delete(utente);
			return true;
		}
		return false;
	}

	public UtenteDTO getUtenteById(int idUtente) {
		return convertToDto(utenteRepository.findActiveById(idUtente));
	}

	public UtenteDTO convertToDto(Utente u) {
		return modelMapper.map(u, UtenteDTO.class);
	}
}
