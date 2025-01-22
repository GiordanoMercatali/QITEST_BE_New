package com.advancia.qitest.dtos;

import java.sql.Timestamp;

public class EsecuzioneTestDTO implements Comparable<EsecuzioneTestDTO> {
	private int idEsecTest;
	private Timestamp dDataEndTest;
	private Timestamp dDataIniTest;
	private Timestamp dDataInser;
	private Timestamp dDataUpdate;
	private boolean fDeleted;
	private int tTotaleRispCorrette;
	private TestDTO test;
	private QuizDTO quizUtente;
	private UtenteDTO utente;

	public EsecuzioneTestDTO() {
	}

	public int getIdEsecTest() {
		return idEsecTest;
	}

	public void setIdEsecTest(int idEsecTest) {
		this.idEsecTest = idEsecTest;
	}

	public Timestamp getdDataEndTest() {
		return dDataEndTest;
	}

	public void setdDataEndTest(Timestamp dDataEndTest) {
		this.dDataEndTest = dDataEndTest;
	}

	public Timestamp getdDataIniTest() {
		return dDataIniTest;
	}

	public void setdDataIniTest(Timestamp dDataIniTest) {
		this.dDataIniTest = dDataIniTest;
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

	public boolean isfDeleted() {
		return fDeleted;
	}

	public void setfDeleted(boolean fDeleted) {
		this.fDeleted = fDeleted;
	}

	public int gettTotaleRispCorrette() {
		return tTotaleRispCorrette;
	}

	public void settTotaleRispCorrette(int tTotaleRispCorrette) {
		this.tTotaleRispCorrette = tTotaleRispCorrette;
	}

	public TestDTO getTest() {
		return test;
	}

	public void setTest(TestDTO test) {
		this.test = test;
	}

	public QuizDTO getQuizUtente() {
		return quizUtente;
	}

	public void setQuizUtente(QuizDTO quizUtente) {
		this.quizUtente = quizUtente;
	}

	public UtenteDTO getUtente() {
		return utente;
	}

	public void setUtente(UtenteDTO utente) {
		this.utente = utente;
	}

	public int compareTo(EsecuzioneTestDTO o) {
		if (this.dDataIniTest.after(o.dDataIniTest)) {
			return -1;
		} else if (this.dDataIniTest.before(o.dDataIniTest)) {
			return 1;
		}
		return 0;
	}
}
