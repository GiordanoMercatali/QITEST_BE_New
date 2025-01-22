package com.advancia.qitest.models;

import java.io.Serializable;
import java.sql.Timestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;


/**
 * The persistent class for the risposta database table.
 * 
 */
@Entity
@NamedQuery(name="Risposta.findAll", query="SELECT r FROM Risposta r")
public class Risposta implements Serializable,TableObject,Comparable<Risposta> {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_risposta")
	private int idRisposta;

	@Column(name="d_data_inser")
	private Timestamp dDataInser;

	@Column(name="d_data_update")
	private Timestamp dDataUpdate;

	@Column(name="f_deleted")
	private boolean fDeleted;

	@Column(name="f_flag_corretta")
	private int fFlagCorretta;

	@Column(name="t_image_path")
	private String tImagePath;

	@Column(name="t_testo_risposta")
	private String tTestoRisposta;

	@ManyToOne (cascade = CascadeType.PERSIST)
	@JoinColumn(name="id_domanda")
	private Domanda domanda;

	public Risposta() {
	}

	public int getIdRisposta() {
		return this.idRisposta;
	}

	public void setIdRisposta(int idRisposta) {
		this.idRisposta = idRisposta;
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

	public int getFFlagCorretta() {
		return this.fFlagCorretta;
	}

	public void setFFlagCorretta(int fFlagCorretta) {
		this.fFlagCorretta = fFlagCorretta;
	}

	public String getTImagePath() {
		return this.tImagePath;
	}

	public void setTImagePath(String tImagePath) {
		this.tImagePath = tImagePath;
	}

	public String getTTestoRisposta() {
		return this.tTestoRisposta;
	}

	public void setTTestoRisposta(String tTestoRisposta) {
		this.tTestoRisposta = tTestoRisposta;
	}

	public Domanda getDomanda() {
		return this.domanda;
	}

	public void setDomanda(Domanda domanda) {
		this.domanda = domanda;
	}

	@Override
	public int compareTo(Risposta o) {
		if(this.idRisposta < o.idRisposta){
			return -1;
		} else if(this.idRisposta > o.idRisposta){
			return 1;
		}
		return 0;
	}

}