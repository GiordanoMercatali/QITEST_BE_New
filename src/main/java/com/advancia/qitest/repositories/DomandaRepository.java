package com.advancia.qitest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.advancia.qitest.models.Domanda;

public interface DomandaRepository extends JpaRepository<Domanda, Integer> {

}
