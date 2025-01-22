package com.advancia.qitest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.advancia.qitest.models.TipoDomanda;

@Repository
public interface TipoDomandaRepository extends JpaRepository<TipoDomanda, Integer> {
    
   
}