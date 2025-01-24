package com.advancia.qitest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.advancia.qitest.repositories.UtenteRepository;

@Service
public class UtenteTestService {

	@Autowired
	private UtenteRepository utenterepository;
}
