package com.advancia.qitest.repositories.test;

import java.util.List;

import com.advancia.qitest.dtos.TestDTO;

public interface TestRepositoryCustom {
	List<TestDTO> findAllTestDTO();
}
