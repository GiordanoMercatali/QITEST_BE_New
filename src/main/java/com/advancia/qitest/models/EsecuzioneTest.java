package com.advancia.qitest.models;

import java.io.Serializable;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


/**
 * The persistent class for the esecuzione_test database table.
 * 
 */
@Entity
@Table(name="esecuzione_test")
@NamedQuery(name="EsecuzioneTest.findAll", query="SELECT e FROM EsecuzioneTest e")
public class EsecuzioneTest implements Serializable,TableObject, Comparable<EsecuzioneTest> {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_esec_test")
	private int idEsecTest;

	@Column(name="d_data_end_test")
	private Timestamp dDataEndTest;

	@Column(name="d_data_ini_test")
	private Timestamp dDataIniTest;

	@Column(name="d_data_inser")
	private Timestamp dDataInser;

	@Column(name="d_data_update")
	private Timestamp dDataUpdate;

	@Column(name="f_deleted")
	private boolean fDeleted;

	@Column(name="t_totale_risp_corrette")
	private int tTotaleRispCorrette;

	@Column(name="t_totale_risposte")
	private int tTotaleRisposte;

	@ManyToOne
	@JoinColumn(name="id_test")
	private Test test;
	
	@OneToOne
	@JoinColumn(name="id_quiz")
	private Quiz quizUtente;

	@ManyToOne
	@JsonIgnore
	@JoinColumn(name="id_utente")
	private Utente utente;

	public EsecuzioneTest() {
	}

	public int getIdEsecTest() {
		return this.idEsecTest;
	}

	public void setIdEsecTest(int idEsecTest) {
		this.idEsecTest = idEsecTest;
	}

	public Timestamp getDDataEndTest() {
		return this.dDataEndTest;
	}

	public void setDDataEndTest(Timestamp dDataEndTest) {
		this.dDataEndTest = dDataEndTest;
	}

	public Timestamp getDDataIniTest() {
		return this.dDataIniTest;
	}

	public void setDDataIniTest(Timestamp dDataIniTest) {
		this.dDataIniTest = dDataIniTest;
	}

	public Timestamp getDDataInser() {
		return this.dDataInser;
	}

	public void setDDataInser(Timestamp dDataInser) {
		this.dDataInser = dDataInser;
	}

	public Timestamp getDDataUpdate() {
		return this.dDataUpdate;
	}

	public void setDDataUpdate(Timestamp dDataUpdate) {
		this.dDataUpdate = dDataUpdate;
	}

	
	public boolean isfDeleted() {
		return fDeleted;
	}

	public void setfDeleted(boolean fDeleted) {
		this.fDeleted = fDeleted;
	}

	public int getTTotaleRispCorrette() {
		return this.tTotaleRispCorrette;
	}

	public void setTTotaleRispCorrette(int tTotaleRispCorrette) {
		this.tTotaleRispCorrette = tTotaleRispCorrette;
	}

	public int getTTotaleRisposte() {
		return this.tTotaleRisposte;
	}

	public void setTTotaleRisposte(int tTotaleRisposte) {
		this.tTotaleRisposte = tTotaleRisposte;
	}


	public Test getTest() {
		return this.test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

	public Utente getUtente() {
		return this.utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}
	
	public Quiz getQuizUtente() {
		return quizUtente;
	}

	public void setQuizUtente(Quiz quizUtente) {
		this.quizUtente = quizUtente;
	}

	@Override
	public int compareTo(EsecuzioneTest o) {
		if(this.dDataIniTest.after(o.dDataIniTest)){
			return -1;
		} else if(this.dDataIniTest.before(o.dDataIniTest)){
			return 1;
		}
		return 0;
	}


}