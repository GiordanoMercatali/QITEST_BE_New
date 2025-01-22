package com.advancia.qitest.models;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * The persistent class for the esame database table.
 * 
 */
@Entity
@Table(name = "Esame")
@NamedQuery(name = "Esame.findAll", query = "SELECT e FROM Esame e")
public class Esame implements Serializable, TableObject {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_esame")
	private int idEsame;

	@Column(name = "d_data_ins")
	private Timestamp dDataIns;

	@Column(name = "d_data_upd")
	private Timestamp dDataUpd;

	@Column(name = "f_deleted")
	private boolean fDeleted;

	@Column(name = "t_descrizione")
	private String tDescrizione;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "esame_test", joinColumns = { @JoinColumn(name = "id_esame") }, inverseJoinColumns = {
			@JoinColumn(name = "id_test") })
	private List<Test> tests;

	@OneToMany(mappedBy = "esame")
	private List<EsecuzioneEsame> esecuzioneEsami;

	public Esame() {
	}

	public int getIdEsame() {
		return this.idEsame;
	}

	public void setIdEsame(int idEsame) {
		this.idEsame = idEsame;
	}

	public Timestamp getDDataIns() {
		return this.dDataIns;
	}

	public void setDDataIns(Timestamp dDataIns) {
		this.dDataIns = dDataIns;
	}

	public Timestamp getDDataUpd() {
		return this.dDataUpd;
	}

	public void setDDataUpd(Timestamp dDataUpd) {
		this.dDataUpd = dDataUpd;
	}

	public boolean isfDeleted() {
		return fDeleted;
	}

	public void setfDeleted(boolean fDeleted) {
		this.fDeleted = fDeleted;
	}

	public String getTDescrizione() {
		return this.tDescrizione;
	}

	public void setTDescrizione(String tDescrizione) {
		this.tDescrizione = tDescrizione;
	}

	public List<Test> getTests() {
		return this.tests;
	}

	public void setTests(List<Test> tests) {
		this.tests = tests;
	}

	public List<EsecuzioneEsame> getEsecuzioneEsami() {
		return esecuzioneEsami;
	}

	public void setEsecuzioneEsami(List<EsecuzioneEsame> esecuzioneEsami) {
		this.esecuzioneEsami = esecuzioneEsami;
	}

	/*
	 * public List<Utente> getUtentes() { return this.utentes; }
	 * 
	 * public void setUtentes(List<Utente> utentes) { this.utentes = utentes; }
	 */
}