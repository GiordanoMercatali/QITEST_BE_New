package com.advancia.qitest.dtos;

import java.sql.Timestamp;
import java.util.List;

public class TestDTO {
	private int idTest;
	private Timestamp dDataInser;
	private Timestamp dDataUpdate;
	private int logicDeleted;
	private String tDescrizioneTest;
	private int tDurata;
	private List<EsameDTO> esames;

	private List<UtenteTestDTO> utentetestDTO;

	private List<EsecuzioneTestDTO> esecuzioneTests;
	private int ordine;

	public List<UtenteTestDTO> getUtDTO() {
		return utentetestDTO;
	}

	public void setUtDTO(List<UtenteTestDTO> utentetestDTO) {
		this.utentetestDTO = utentetestDTO;
	}

	public TestDTO() {
	}

	public int getIdTest() {
		return idTest;
	}

	public void setIdTest(int idTest) {
		this.idTest = idTest;
	}

	public Timestamp getdDataInser() {
		return dDataInser;
	}

	public void setdDataInser(Timestamp dDataInser) {
		this.dDataInser = dDataInser;
	}

	public Timestamp getdDataUpdate() {
		return dDataUpdate;
	}

	public void setdDataUpdate(Timestamp dDataUpdate) {
		this.dDataUpdate = dDataUpdate;
	}

	public int getLogicDeleted() {
		return logicDeleted;
	}

	public void setLogicDeleted(int logicDeleted) {
		this.logicDeleted = logicDeleted;
	}

	public String gettDescrizioneTest() {
		return tDescrizioneTest;
	}

	public void settDescrizioneTest(String tDescrizioneTest) {
		this.tDescrizioneTest = tDescrizioneTest;
	}

	public int gettDurata() {
		return tDurata;
	}

	public void settDurata(int tDurata) {
		this.tDurata = tDurata;
	}

	public List<EsameDTO> getEsames() {
		return esames;
	}

	public void setEsames(List<EsameDTO> esames) {
		this.esames = esames;
	}

	public List<EsecuzioneTestDTO> getEsecuzioneTests() {
		return esecuzioneTests;
	}

	public void setEsecuzioneTests(List<EsecuzioneTestDTO> esecuzioneTests) {
		this.esecuzioneTests = esecuzioneTests;
	}

	public int getOrdine() {
		return ordine;
	}

	public void setOrdine(int ordine) {
		this.ordine = ordine;
	}

	public TestDTO(int idTest, String tDescrizioneTest, int tDurata, int ordine) {
		super();
		this.idTest = idTest;
		this.tDescrizioneTest = tDescrizioneTest;
		this.tDurata = tDurata;
		this.ordine = ordine;
	}
	
}