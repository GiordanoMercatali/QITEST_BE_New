package com.advancia.qitest.models;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "utente")
public class Utente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_utente")
	private Integer idUtente;

	@Column(name = "t_profilo")
	private String profilo;

	@Column(name = "d_data_inser")
	@CreationTimestamp
	private Timestamp dDataInser;

	@Temporal(TemporalType.DATE)
	@Column(name = "d_data_nascita")
	private Date dDataNascita;

	@Column(name = "d_data_update")
	@UpdateTimestamp
	private Timestamp dDataUpdate;

	@Column(name = "f_deleted")
	private boolean fDeleted;

	@Column(name = "p_password")
	private String pPassword;

	@Column(name = "t_cap_residenza")
	private String tCapResidenza;

	@Column(name = "t_cellulare")
	private String tCellulare;

	@Column(name = "t_citta_residenza")
	private String tCittaResidenza;

	@Column(name = "t_civico_residenza")
	private String tCivicoResidenza;

	@Column(name = "t_codice_fiscale")
	private String tCodiceFiscale;

	@Column(name = "t_cognome")
	private String tCognome;

	@Column(name = "t_email")
	private String email;

	@Column(name = "t_indirizzo_residenza")
	private String tIndirizzoResidenza;

	@Column(name = "t_luogo_nascita")
	private String tLuogoNascita;

	@Column(name = "t_nome")
	private String tNome;

	@Column(name = "t_provincia_nascita")
	private String tProvinciaNascita;

	@Column(name = "t_provincia_residenza")
	private String tProvinciaResidenza;

	@OneToMany(mappedBy = "utente", orphanRemoval = true)
	@JsonManagedReference
	private List<EsecuzioneTest> esecuzioneTests;

	@OneToMany(mappedBy = "utente")
	private List<UtenteTest> listaUtenteTest;

	@ManyToOne
	@JoinColumn(name = "id_azienda")
	private Azienda azienda;

	public Utente() {
	}

	public Integer getIdUtente() {
		return this.idUtente;
	}

	public void setIdUtente(Integer idUtente) {
		this.idUtente = idUtente;
	}

	public Timestamp getDDataInser() {
		return this.dDataInser;
	}

	public void setDDataInser(Timestamp dDataInser) {
		this.dDataInser = dDataInser;
	}

	public Date getDDataNascita() {
		return this.dDataNascita;
	}

	public void setDDataNascita(Date dDataNascita) {
		this.dDataNascita = dDataNascita;
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

	public String getPPassword() {
		return pPassword;
	}

	public void setPPassword(String pPassword) {
		this.pPassword = pPassword;
	}

	public String getTCapResidenza() {
		return this.tCapResidenza;
	}

	public void setTCapResidenza(String tCapResidenza) {
		this.tCapResidenza = tCapResidenza;
	}

	public String getTCellulare() {
		return this.tCellulare;
	}

	public void setTCellulare(String tCellulare) {
		this.tCellulare = tCellulare;
	}

	public String getTCittaResidenza() {
		return this.tCittaResidenza;
	}

	public void setTCittaResidenza(String tCittaResidenza) {
		this.tCittaResidenza = tCittaResidenza;
	}

	public String getTCivicoResidenza() {
		return this.tCivicoResidenza;
	}

	public void setTCivicoResidenza(String tCivicoResidenza) {
		this.tCivicoResidenza = tCivicoResidenza;
	}

	public String getTCodiceFiscale() {
		return this.tCodiceFiscale;
	}

	public void setTCodiceFiscale(String tCodiceFiscale) {
		this.tCodiceFiscale = tCodiceFiscale;
	}

	public String getTCognome() {
		return this.tCognome;
	}

	public void setTCognome(String tCognome) {
		this.tCognome = tCognome;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTIndirizzoResidenza() {
		return this.tIndirizzoResidenza;
	}

	public void setTIndirizzoResidenza(String tIndirizzoResidenza) {
		this.tIndirizzoResidenza = tIndirizzoResidenza;
	}

	public String getTLuogoNascita() {
		return this.tLuogoNascita;
	}

	public void setTLuogoNascita(String tLuogoNascita) {
		this.tLuogoNascita = tLuogoNascita;
	}

	public String getTNome() {
		return this.tNome;
	}

	public void setTNome(String tNome) {
		this.tNome = tNome;
	}

	public String getTProvinciaNascita() {
		return this.tProvinciaNascita;
	}

	public void setTProvinciaNascita(String tProvinciaNascita) {
		this.tProvinciaNascita = tProvinciaNascita;
	}

	public String getTProvinciaResidenza() {
		return this.tProvinciaResidenza;
	}

	public void setTProvinciaResidenza(String tProvinciaResidenza) {
		this.tProvinciaResidenza = tProvinciaResidenza;
	}

	public List<EsecuzioneTest> getEsecuzioneTests() {
		return this.esecuzioneTests;
	}

	public void setEsecuzioneTests(List<EsecuzioneTest> esecuzioneTests) {
		this.esecuzioneTests = esecuzioneTests;
	}

	public EsecuzioneTest addEsecuzioneTest(EsecuzioneTest esecuzioneTest) {
		getEsecuzioneTests().add(esecuzioneTest);
		esecuzioneTest.setUtente(this);

		return esecuzioneTest;
	}

	public EsecuzioneTest removeEsecuzioneTest(EsecuzioneTest esecuzioneTest) {
		getEsecuzioneTests().remove(esecuzioneTest);
		esecuzioneTest.setUtente(null);

		return esecuzioneTest;
	}

	public Azienda getAzienda() {
		return azienda;
	}

	public void setAzienda(Azienda azienda) {
		this.azienda = azienda;
	}

	public String getProfilo() {
		return profilo;
	}

	public void setProfilo(String profilo) {
		this.profilo = profilo;
	}

	public List<UtenteTest> getListaUtenteTest() {
		return listaUtenteTest;
	}

	public void setListaUtenteTest(List<UtenteTest> listaUtenteTest) {
		this.listaUtenteTest = listaUtenteTest;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.tNome + ' ' + this.tCognome + ' ' + this.email);
		return sb.toString();
	}
}