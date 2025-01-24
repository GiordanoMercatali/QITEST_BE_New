package com.advancia.qitest.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "riposta_utente")
public class RispostaUtente implements Serializable, TableObject, Comparable<RispostaUtente> {

	private static final long serialVersionUID = 6171928664347001870L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_risposta_utente")
	int idRispostaUtente;
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_test")
	Test test;
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_risposta")
	Risposta risposta;
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_domanda")
	Domanda domanda;
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_utente")
	Utente utente;
	
	@Column(name="note")
	String note;
	
	@Column(name="testo_risposta")
	String testoRisposta;
	
	@OneToOne
	@JoinColumn(name="id_quiz")
	private UtenteTest quizUtente;

	public int getIdRispostaUtente() {
		return idRispostaUtente;
	}

	public UtenteTest getQuizUtente() {
		return quizUtente;
	}

	public void setQuizUtente(UtenteTest quizUtente) {
		this.quizUtente = quizUtente;
	}

	public void setIdRispostaUtente(int idRispostaUtente) {
		this.idRispostaUtente = idRispostaUtente;
	}

	public Risposta getRisposta() {
		return risposta;
	}

	public void setRisposta(Risposta risposta) {
		this.risposta = risposta;
	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

	public Domanda getDomanda() {
		return domanda;
	}

	public void setDomanda(Domanda domanda) {
		this.domanda = domanda;
	}

	public String getTestoRisposta() {
		return testoRisposta;
	}

	public void setTestoRisposta(String testoRisposta) {
		this.testoRisposta = testoRisposta;
	}

	@Override
	public int compareTo(RispostaUtente o) {
		if(this.idRispostaUtente < o.getIdRispostaUtente()){
			return -1;
		} else if(this.idRispostaUtente > o.getIdRispostaUtente()){
			return 1;
		}
		return 0;
	}
	
}
