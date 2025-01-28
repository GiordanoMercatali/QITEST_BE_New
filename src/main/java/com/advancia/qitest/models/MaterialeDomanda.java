package com.advancia.qitest.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "materiale_domanda")
public class MaterialeDomanda implements Serializable {

	private static final long serialVersionUID = -6526820699723201872L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@OneToOne
	@JoinColumn(name = "id_domanda")
	private Domanda domanda;

	@Lob
	@Column(name = "materiale_file")
	private byte[] materialeFile;

	@Column(name = "materiale_testuale")
	private String materialeTestuale;

	@Column(name = "tipo_file")
	private String tipoFile;

	@Column(name = "titolo")
	private String titolo;

	@Column(name = "descrizione")
	private String descrizione;

	@Column(name = "flag_eliminato")
	private boolean flagEliminato;

	@Column(name = "ordine")
	private int ordine;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Domanda getDomanda() {
		return domanda;
	}

	public void setDomanda(Domanda domanda) {
		this.domanda = domanda;
	}

	public String getMaterialeTestuale() {
		return materialeTestuale;
	}

	public void setMaterialeTestuale(String materialeTestuale) {
		this.materialeTestuale = materialeTestuale;
	}

	public String getTipoFile() {
		return tipoFile;
	}

	public void setTipoFile(String tipoFile) {
		this.tipoFile = tipoFile;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public boolean isFlagEliminato() {
		return flagEliminato;
	}

	public void setFlagEliminato(boolean flagEliminato) {
		this.flagEliminato = flagEliminato;
	}

	public int getOrdine() {
		return ordine;
	}

	public void setOrdine(int ordine) {
		this.ordine = ordine;
	}

	public byte[] getMaterialeFile() {
		return materialeFile;
	}

	public void setMaterialeFile(byte[] materialeFile) {
		this.materialeFile = materialeFile;
	}

}
