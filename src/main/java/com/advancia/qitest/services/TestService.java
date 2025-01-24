package com.advancia.qitest.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.advancia.qitest.dtos.TestDTO;
import com.advancia.qitest.models.Test;
import com.advancia.qitest.repositories.TestRepository;

@Service
public class TestService {

	@Autowired
	private TestRepository testRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	   private TestDTO convertToDto(Test t) {
	        return modelMapper.map(t, TestDTO.class);
	    }

	      
	   
}
