package com.advancia.qitest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.advancia.qitest.models.TipoDomanda;

public interface TipoDomandaRepository extends JpaRepository<TipoDomanda, Integer> {

}