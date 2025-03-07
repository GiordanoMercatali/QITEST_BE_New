package com.advancia.qitest.repositories;

import java.util.List;

import com.advancia.qitest.models.EsecuzioneTest;
import com.advancia.qitest.models.Test;

public interface EsecuzioneTestRepositoryCustom {
	public List<Test> findAllListaTestUtenteById(String idUtente);
	public EsecuzioneTest findByIdUtenteAndIdTest(Integer idUtente, Integer idTest);
}
