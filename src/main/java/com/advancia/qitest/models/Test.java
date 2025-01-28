package com.advancia.qitest.models;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Test")
public class Test implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_test")
	private int idTest;

	@Column(name = "d_data_inser")
	@CreationTimestamp
	private Timestamp dDataInser;

	@Column(name = "d_data_update")
	@UpdateTimestamp
	private Timestamp dDataUpdate;

	@Column(name = "f_deleted")
	private int logicDeleted;

	@Column(name = "t_descrizione_test")
	private String tDescrizioneTest;

	@Column(name = "t_durata")
	private int tDurata;

	@Column(name = "t_ordine")
	private int ordine;

	@OneToMany(mappedBy = "test")
	private List<UtenteTest> listaUtenteTest;

	@ManyToMany(mappedBy = "tests")
	private List<Esame> esames;

	@OneToMany(mappedBy = "test")
	private List<EsecuzioneTest> esecuzioneTests;

	@ManyToMany
	@JoinTable(name = "test_domanda", joinColumns = { @JoinColumn(name = "id_test") }, inverseJoinColumns = {
			@JoinColumn(name = "id_domanda") })
	private List<Domanda> domandas;

	public Test() {
	}

	public int getIdTest() {
		return this.idTest;
	}

	public void setIdTest(int idTest) {
		this.idTest = idTest;
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

	public int getFDeleted() {
		return this.logicDeleted;
	}

	public void setFDeleted(int fDeleted) {
		this.logicDeleted = fDeleted;
	}

	public String getTDescrizioneTest() {
		return this.tDescrizioneTest;
	}

	public void setTDescrizioneTest(String tDescrizioneTest) {
		this.tDescrizioneTest = tDescrizioneTest;
	}

	public int getTDurata() {
		return this.tDurata;
	}

	public void setTDurata(int tDurata) {
		this.tDurata = tDurata;
	}

	public List<Esame> getEsames() {
		return this.esames;
	}

	public void setEsames(List<Esame> esames) {
		this.esames = esames;
	}

	public List<EsecuzioneTest> getEsecuzioneTests() {
		return this.esecuzioneTests;
	}

	public void setEsecuzioneTests(List<EsecuzioneTest> esecuzioneTests) {
		this.esecuzioneTests = esecuzioneTests;
	}

	public EsecuzioneTest addEsecuzioneTest(EsecuzioneTest esecuzioneTest) {
		getEsecuzioneTests().add(esecuzioneTest);
		esecuzioneTest.setTest(this);

		return esecuzioneTest;
	}

	public EsecuzioneTest removeEsecuzioneTest(EsecuzioneTest esecuzioneTest) {
		getEsecuzioneTests().remove(esecuzioneTest);
		esecuzioneTest.setTest(null);

		return esecuzioneTest;
	}

	public List<Domanda> getDomandas() {
		return this.domandas;
	}

	public void setDomandas(List<Domanda> domandas) {
		this.domandas = domandas;
	}

	public int getOrdine() {
		return ordine;
	}

	public void setOrdine(int ordine) {
		this.ordine = ordine;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idTest;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test other = (Test) obj;
		if (idTest != other.idTest)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Test [idTest=" + idTest + ", tDescrizioneTest=" + tDescrizioneTest + ", tDurata=" + tDurata
				+ ", ordine=" + ordine + "]";
	}

}