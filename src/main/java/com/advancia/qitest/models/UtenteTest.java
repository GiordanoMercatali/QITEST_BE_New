package com.advancia.qitest.models;

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
@Table(name = "utente_quiz")
public class UtenteTest implements TableObject {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_utente_quiz")
	private int idUtenteQuiz;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_utente")
	private Utente utente;

	@Column(name = "id_quiz")
	private int idQuiz;

	@Column(name = "tipo_quiz")
	private String tipoQuiz;

	@Column(name = "mostra_risultati")
	private int mostraRisultati;

	@Column(name = "ord")
	private int ord;

	@Column(name = "flag_studio")
	private boolean flagStudio;

	public int getIdUtenteQuiz() {
		return idUtenteQuiz;
	}

	public void setIdUtenteQuiz(int idUtenteQuiz) {
		this.idUtenteQuiz = idUtenteQuiz;
	}

	public int getIdQuiz() {
		return idQuiz;
	}

	public void setIdQuiz(int idQuiz) {
		this.idQuiz = idQuiz;
	}

	public String getTipoQuiz() {
		return tipoQuiz;
	}

	public void setTipoQuiz(String tipoQuiz) {
		this.tipoQuiz = tipoQuiz;
	}

	public Utente getIdUtente() {
		return utente;
	}

	public void setIdUtente(Utente idUtente) {
		this.utente = idUtente;
	}

	public Integer getOrd() {
		return ord;
	}

	public void setOrd(Integer ord) {
		this.ord = ord;
	}

	/**
	 * Restituisce il tipo di risultati da mostrare
	 * 
	 * @return 0 - Solo inizio e fine test, 1 - Inizio e fine Test e percentuale di
	 *         successo, 2 - Risposta per risposta
	 */
	public int getMostraRisultati() {
		return mostraRisultati;
	}

	public void setMostraRisultati(int mostraRisultati) {
		this.mostraRisultati = mostraRisultati;
	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	public boolean isFlagStudio() {
		return flagStudio;
	}

	public void setFlagStudio(boolean flagStudio) {
		this.flagStudio = flagStudio;
	}

	public void setOrd(int ord) {
		this.ord = ord;
	}
}