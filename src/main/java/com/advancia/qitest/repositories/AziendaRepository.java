package com.advancia.qitest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.advancia.qitest.models.Azienda;


public interface AziendaRepository extends JpaRepository<Azienda, Integer> {
    
}