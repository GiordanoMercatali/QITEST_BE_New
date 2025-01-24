package com.advancia.qitest.models;

import java.io.Serializable;
import java.sql.Timestamp;

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

@Entity
@Table(name = "esecuzione_esame")
@NamedQuery(name = "EsecuzioneEsame.findAll", query = "SELECT e FROM EsecuzioneEsame e")
public class EsecuzioneEsame implements Serializable, TableObject {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_esecuzione_esame;

	@Column(name = "d_data_end_esame")
	private Timestamp dDataEndEsame;

	@Column(name = "d_data_ini_esame")
	private Timestamp dDataIniEsame;

	@Column(name = "f_deleted")
	private boolean fDeleted;

	@ManyToOne
	@JoinColumn(name = "id_esame")
	private Esame esame;

	@ManyToOne
	@JoinColumn(name = "id_utente")
	private Utente utente;

	@OneToOne
	@JoinColumn(name = "id_quiz")
	private UtenteTest quizUtente;

	public EsecuzioneEsame() {
	}

	public int getId_esecuzione_esame() {
		return id_esecuzione_esame;
	}

	public void setId_esecuzione_esame(int id_esecuzione_esame) {
		this.id_esecuzione_esame = id_esecuzione_esame;
	}

	public Timestamp getdDataEndEsame() {
		return dDataEndEsame;
	}

	public void setdDataEndEsame(Timestamp dDataEndEsame) {
		this.dDataEndEsame = dDataEndEsame;
	}

	public Timestamp getdDataIniEsame() {
		return dDataIniEsame;
	}

	public void setdDataIniEsame(Timestamp dDataIniEsame) {
		this.dDataIniEsame = dDataIniEsame;
	}

	public boolean isfDeleted() {
		return fDeleted;
	}

	public void setfDeleted(boolean fDeleted) {
		this.fDeleted = fDeleted;
	}

	public Esame getEsame() {
		return esame;
	}

	public void setEsame(Esame esame) {
		this.esame = esame;
	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	public UtenteTest getQuizUtente() {
		return quizUtente;
	}

	public void setQuizUtente(UtenteTest quizUtente) {
		this.quizUtente = quizUtente;
	}

	@Override
	public String toString() {
	    return "EsecuzioneEsame{" +
	           "id_esecuzione_esame=" + id_esecuzione_esame +
	           ", dDataEndEsame=" + dDataEndEsame +
	           ", dDataIniEsame=" + dDataIniEsame +
	           ", fDeleted=" + fDeleted +
	           ", esame=" + esame +
	           ", utente=" + utente +
	           ", quizUtente=" + quizUtente +
	           '}';
	}


}