package com.advancia.qitest.services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.advancia.qitest.dtos.UtenteDTO;
import com.advancia.qitest.models.Utente;
import com.advancia.qitest.repositories.UtenteRepository;

@Service
public class UtenteService {

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private UtenteRepository utenteRepository;

	public List<UtenteDTO> findAllUtenti() {
        return utenteRepository.findAll().stream().map(this::convertToDto).toList();
    }
	
	public UtenteDTO convertToDto(Utente u) {
		return modelMapper.map(u, UtenteDTO.class);
	}
}
