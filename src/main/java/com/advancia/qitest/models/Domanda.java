package com.advancia.qitest.models;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "domanda")
@NamedQuery(name = "Domanda.findAll", query = "SELECT d FROM Domanda d")
public class Domanda implements Serializable, TableObject {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_domanda")
	private int idDomanda;

	@Column(name = "d_data_inser")
	private Timestamp dDataInser;

	@Column(name = "d_data_update")
	private Timestamp dDataUpdate;

	@Column(name = "f_deleted")
	private boolean fDeleted;

	@Column(name = "t_image_path")
	private String tImagePath;

	@Column(name = "t_testo_domanda")
	private String tTestoDomanda;

	// bi-directional many-to-one association to TipoDomanda
	@ManyToOne
	@JoinColumn(name = "id_tipo_domanda")
	private TipoDomanda tipoDomanda;

	// bi-directional many-to-one association to Risposta
	@OneToMany(mappedBy = "domanda", cascade = CascadeType.PERSIST)
	private List<Risposta> rispostas;

	// bi-directional many-to-many association to Test
	@ManyToMany(mappedBy = "domandas")
	private List<Test> tests;

	public Domanda() {
	}

	public int getIdDomanda() {
		return this.idDomanda;
	}

	public void setIdDomanda(int idDomanda) {
		this.idDomanda = idDomanda;
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

	public String getTImagePath() {
		return this.tImagePath;
	}

	public void setTImagePath(String tImagePath) {
		this.tImagePath = tImagePath;
	}

	public String getTTestoDomanda() {
		return this.tTestoDomanda;
	}

	public void setTTestoDomanda(String tTestoDomanda) {
		this.tTestoDomanda = tTestoDomanda;
	}

	public TipoDomanda getTipoDomanda() {
		return this.tipoDomanda;
	}

	public void setTipoDomanda(TipoDomanda tipoDomanda) {
		this.tipoDomanda = tipoDomanda;
	}

	public List<Risposta> getRispostas() {
		return this.rispostas;
	}

	public void setRispostas(List<Risposta> rispostas) {
		this.rispostas = rispostas;
	}

	public Risposta addRisposta(Risposta risposta) {
		getRispostas().add(risposta);
		risposta.setDomanda(this);

		return risposta;
	}

	public Risposta removeRisposta(Risposta risposta) {
		getRispostas().remove(risposta);
		risposta.setDomanda(null);

		return risposta;
	}

	public List<Test> getTests() {
		return this.tests;
	}

	public void setTests(List<Test> tests) {
		this.tests = tests;
	}

}