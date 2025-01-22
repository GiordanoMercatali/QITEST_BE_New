package com.advancia.qitest.models;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Azienda")
@NamedQuery(name = "Azienda.findAll", query = "SELECT a FROM Azienda a")
public class Azienda implements Serializable, TableObject {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_azienda")
	private int idAzienda;

	@Column(name = "d_data_inser")
	private Timestamp dDataInser;

	@Column(name = "d_data_update")
	private Timestamp dDataUpdate;

	@Column(name = "f_deleted")
	private boolean fDeleted;

	@Column(name = "t_cap")
	private int tCap;

	@Column(name = "t_citta")
	private String tCitta;

	@Column(name = "t_codicefiscale")
	private String tCodicefiscale;

	@Column(name = "t_email")
	private String tEmail;

	@Column(name = "t_facebook")
	private String tFacebook;

	@Column(name = "t_indirizzo")
	private String tIndirizzo;

	@Column(name = "t_linkedin")
	private String tLinkedin;

	@Column(name = "t_ragione_sociale")
	private String tRagioneSociale;

	@Column(name = "t_numero_telefono")
	private int tNumeroTelefono;

	@Column(name = "t_partitaiva")
	private String tPartitaiva;

	@Column(name = "t_pr_sigla")
	private String tPrSigla;

	@Column(name = "t_provincia")
	private String tProvincia;

	@Column(name = "t_regione")
	private String tRegione;

	@Column(name = "t_site")
	private String tSite;

	@Column(name = "t_site_list")
	private byte[] tSiteList;

	@Column(name = "t_sitoweb")
	private String tSitoweb;

	@Column(name = "t_stato")
	private String tStato;

	@Column(name = "t_tel_cell")
	private int tTelCell;

	@Column(name = "t_tel_fisso")
	private String tTelFisso;

	@Column(name = "t_twitter")
	private String tTwitter;

	@OneToMany(mappedBy = "azienda")
	private List<Utente> utenti;

	public Azienda() {
	}

	public int getIdAzienda() {
		return this.idAzienda;
	}

	public void setIdAzienda(int idAzienda) {
		this.idAzienda = idAzienda;
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

	public int getTCap() {
		return this.tCap;
	}

	public void setTCap(int tCap) {
		this.tCap = tCap;
	}

	public String getTCitta() {
		return this.tCitta;
	}

	public void setTCitta(String tCitta) {
		this.tCitta = tCitta;
	}

	public String getTCodicefiscale() {
		return this.tCodicefiscale;
	}

	public void setTCodicefiscale(String tCodicefiscale) {
		this.tCodicefiscale = tCodicefiscale;
	}

	public String getTEmail() {
		return this.tEmail;
	}

	public void setTEmail(String tEmail) {
		this.tEmail = tEmail;
	}

	public String getTFacebook() {
		return this.tFacebook;
	}

	public void setTFacebook(String tFacebook) {
		this.tFacebook = tFacebook;
	}

	public String getTIndirizzo() {
		return this.tIndirizzo;
	}

	public void setTIndirizzo(String tIndirizzo) {
		this.tIndirizzo = tIndirizzo;
	}

	public String getTLinkedin() {
		return this.tLinkedin;
	}

	public void setTLinkedin(String tLinkedin) {
		this.tLinkedin = tLinkedin;
	}

	public String getTRagioneSociale() {
		return this.tRagioneSociale;
	}

	public void setTRagioneSociale(String tRagioneSociale) {
		this.tRagioneSociale = tRagioneSociale;
	}

	public int getTNumeroTelefono() {
		return this.tNumeroTelefono;
	}

	public void setTNumeroTelefono(int tNumeroTelefono) {
		this.tNumeroTelefono = tNumeroTelefono;
	}

	public String getTPartitaiva() {
		return this.tPartitaiva;
	}

	public void setTPartitaiva(String tPartitaiva) {
		this.tPartitaiva = tPartitaiva;
	}

	public String getTPrSigla() {
		return this.tPrSigla;
	}

	public void setTPrSigla(String tPrSigla) {
		this.tPrSigla = tPrSigla;
	}

	public String getTProvincia() {
		return this.tProvincia;
	}

	public void setTProvincia(String tProvincia) {
		this.tProvincia = tProvincia;
	}

	public String getTRegione() {
		return this.tRegione;
	}

	public void setTRegione(String tRegione) {
		this.tRegione = tRegione;
	}

	public String getTSite() {
		return this.tSite;
	}

	public void setTSite(String tSite) {
		this.tSite = tSite;
	}

	public byte[] getTSiteList() {
		return this.tSiteList;
	}

	public void setTSiteList(byte[] tSiteList) {
		this.tSiteList = tSiteList;
	}

	public String getTSitoweb() {
		return this.tSitoweb;
	}

	public void setTSitoweb(String tSitoweb) {
		this.tSitoweb = tSitoweb;
	}

	public String getTStato() {
		return this.tStato;
	}

	public void setTStato(String tStato) {
		this.tStato = tStato;
	}

	public int getTTelCell() {
		return this.tTelCell;
	}

	public void setTTelCell(int tTelCell) {
		this.tTelCell = tTelCell;
	}

	public String getTTelFisso() {
		return this.tTelFisso;
	}

	public void setTTelFisso(String tTelFisso) {
		this.tTelFisso = tTelFisso;
	}

	public String getTTwitter() {
		return this.tTwitter;
	}

	public void setTTwitter(String tTwitter) {
		this.tTwitter = tTwitter;
	}

}