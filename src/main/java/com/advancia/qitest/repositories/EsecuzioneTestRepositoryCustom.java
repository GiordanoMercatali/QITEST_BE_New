package com.advancia.qitest.repositories;

import java.util.List;

import com.advancia.qitest.models.EsecuzioneTest;
import com.advancia.qitest.models.Test;

public interface EsecuzioneTestRepositoryCustom {
	public List<Test> findAllListaTestUtenteById(Integer idUtente);
	public EsecuzioneTest findBydDataEndTestIsNullAndUtenteIdUtenteAndTestIdTest(Integer idUtente, Integer idTest);
}
