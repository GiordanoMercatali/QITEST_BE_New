package com.advancia.qitest.models;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "log_eventi")
public class LogEventi implements Serializable {

	private static final long serialVersionUID = -5499110282755873660L;

	@Id
	@Column(name = "id_log")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idLogEventi;

	@OneToOne
	@JoinColumn(name = "id_utente")
	private Utente utente;

	@OneToOne
	@JoinColumn(name = "id_quiz")
	private Quiz quiz;

	private String messaggio;

	@Column(name = "data_inserimento", insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataInserimento;

	public int getIdLogEventi() {
		return idLogEventi;
	}

	public void setIdLogEventi(int idLogEventi) {
		this.idLogEventi = idLogEventi;
	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	public Quiz getQuiz() {
		return quiz;
	}

	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}

	public String getMessaggio() {
		return messaggio;
	}

	public void setMessaggio(String messaggio) {
		this.messaggio = messaggio;
	}

	public Date getDataInserimento() {
		return dataInserimento;
	}

	public void setDataInserimento(Date dataInserimento) {
		this.dataInserimento = dataInserimento;
	}

}
