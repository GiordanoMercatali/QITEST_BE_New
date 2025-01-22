package com.advancia.qitest.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.advancia.qitest.dtos.TestDTO;
import com.advancia.qitest.models.Test;

@Repository
public interface TestRepository extends JpaRepository<Test, Integer> {
    
    // Trova un test non eliminato (fDeleted == 0) per idTest
    List<Test> findByIdTestAndLogicDeleted(int idTest, int logicDeleted);
    
    // Trova tutti i test non eliminati
    List<TestDTO> findByLogicDeleted(int logicDeleted);
}
