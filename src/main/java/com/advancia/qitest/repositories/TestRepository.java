package com.advancia.qitest.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.advancia.qitest.dtos.TestDTO;
import com.advancia.qitest.models.Test;

public interface TestRepository extends JpaRepository<Test, Integer> {
    
    // Trova un test non eliminato (fDeleted == 0) per idTest
    List<Test> findByIdTestAndLogicDeleted(int idTest, int logicDeleted);
    
    // Trova tutti i test non eliminati
    List<TestDTO> findByLogicDeleted(int logicDeleted);
}
