package com.advancia.qitest.models;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipo_domanda")
@NamedQuery(name = "TipoDomanda.findAll", query = "SELECT t FROM TipoDomanda t")
public class TipoDomanda implements Serializable, TableObject {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "Id_tipo_domanda")
	private int id_tipo_domanda;

	@Column(name = "f_deleted")
	private boolean fDeleted;

	@Column(name = "t_tipo_domanda")
	private String tTipoDomanda;

	@OneToMany(mappedBy = "tipoDomanda", fetch = FetchType.EAGER)
	private List<Domanda> domandas;

	public TipoDomanda() {
	}

	public int getId_tipo_domanda() {
		return this.id_tipo_domanda;
	}

	public void setId_tipo_domanda(int id_tipo_domanda) {
		this.id_tipo_domanda = id_tipo_domanda;
	}

	public boolean isfDeleted() {
		return fDeleted;
	}

	public void setfDeleted(boolean fDeleted) {
		this.fDeleted = fDeleted;
	}

	public String getTTipoDomanda() {
		return this.tTipoDomanda;
	}

	public void setTTipoDomanda(String tTipoDomanda) {
		this.tTipoDomanda = tTipoDomanda;
	}

	public List<Domanda> getDomandas() {
		return this.domandas;
	}

	public void setDomandas(List<Domanda> domandas) {
		this.domandas = domandas;
	}

	public Domanda addDomanda(Domanda domanda) {
		getDomandas().add(domanda);
		domanda.setTipoDomanda(this);

		return domanda;
	}

	public Domanda removeDomanda(Domanda domanda) {
		getDomandas().remove(domanda);
		domanda.setTipoDomanda(null);

		return domanda;
	}

}