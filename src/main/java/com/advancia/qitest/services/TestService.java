package com.advancia.qitest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.advancia.qitest.dtos.TestDTO;
import com.advancia.qitest.repositories.test.TestRepository;

@Service
@Transactional
public class TestService {

	@Autowired
	private TestRepository testRepository;

	public List<TestDTO> findAllTestDTO() {
		return testRepository.findAllTestDTO();
	}

}