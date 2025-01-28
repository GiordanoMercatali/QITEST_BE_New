package com.advancia.qitest.dtos;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public class UtenteDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private int idUtente;
	private AziendaDTO azienda;
	private List<UtenteTestDTO> utenteTest;
	private String profilo;
	private Timestamp dDataInser;
	private Date dDataNascita;
	private Timestamp dDataUpdate;
	private boolean fDeleted;
	private String pPassword;
	private String tCapResidenza;
	private String tCellulare;
	private String tCittaResidenza;
	private String tCivicoResidenza;
	private String tCodiceFiscale;
	private String tCognome;
	private String email;
	private String tIndirizzoResidenza;
	private String tLuogoNascita;
	private String tNome;
	private String tProvinciaNascita;
	private String tProvinciaResidenza;

	public UtenteDTO(int idUtente, String profilo, String tCognome, String email, String tNome) {
		super();
		this.idUtente = idUtente;
		this.profilo = profilo;
		this.tCognome = tCognome;
		this.email = email;
		this.tNome = tNome;
	}

	public List<UtenteTestDTO> getUtDTO() {
		return utenteTest;
	}

	public void setUtDTO(List<UtenteTestDTO> utentetestDTO) {
		this.utenteTest = utentetestDTO;
	}

	public UtenteDTO() {
	}

	public int getIdUtente() {
		return idUtente;
	}

	public void setIdUtente(int idUtente) {
		this.idUtente = idUtente;
	}

	public AziendaDTO getAzienda() {
		return azienda;
	}

	public void setAzienda(AziendaDTO azienda) {
		this.azienda = azienda;
	}

	public String getProfilo() {
		return profilo;
	}

	public void setProfilo(String profilo) {
		this.profilo = profilo;
	}

	public Timestamp getdDataInser() {
		return dDataInser;
	}

	public void setdDataInser(Timestamp dDataInser) {
		this.dDataInser = dDataInser;
	}

	public Date getdDataNascita() {
		return dDataNascita;
	}

	public void setdDataNascita(Date dDataNascita) {
		this.dDataNascita = dDataNascita;
	}

	public Timestamp getdDataUpdate() {
		return dDataUpdate;
	}

	public void setdDataUpdate(Timestamp dDataUpdate) {
		this.dDataUpdate = dDataUpdate;
	}

	public boolean isfDeleted() {
		return fDeleted;
	}

	public void setfDeleted(boolean fDeleted) {
		this.fDeleted = fDeleted;
	}

	public String getpPassword() {
		return pPassword;
	}

	public void setpPassword(String pPassword) {
		this.pPassword = pPassword;
	}

	public String gettCapResidenza() {
		return tCapResidenza;
	}

	public void settCapResidenza(String tCapResidenza) {
		this.tCapResidenza = tCapResidenza;
	}

	public String gettCellulare() {
		return tCellulare;
	}

	public void settCellulare(String tCellulare) {
		this.tCellulare = tCellulare;
	}

	public String gettCittaResidenza() {
		return tCittaResidenza;
	}

	public void settCittaResidenza(String tCittaResidenza) {
		this.tCittaResidenza = tCittaResidenza;
	}

	public String gettCivicoResidenza() {
		return tCivicoResidenza;
	}

	public void settCivicoResidenza(String tCivicoResidenza) {
		this.tCivicoResidenza = tCivicoResidenza;
	}

	public String gettCodiceFiscale() {
		return tCodiceFiscale;
	}

	public void settCodiceFiscale(String tCodiceFiscale) {
		this.tCodiceFiscale = tCodiceFiscale;
	}

	public String gettCognome() {
		return tCognome;
	}

	public void settCognome(String tCognome) {
		this.tCognome = tCognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String gettIndirizzoResidenza() {
		return tIndirizzoResidenza;
	}

	public void settIndirizzoResidenza(String tIndirizzoResidenza) {
		this.tIndirizzoResidenza = tIndirizzoResidenza;
	}

	public String gettLuogoNascita() {
		return tLuogoNascita;
	}

	public void settLuogoNascita(String tLuogoNascita) {
		this.tLuogoNascita = tLuogoNascita;
	}

	public String gettNome() {
		return tNome;
	}

	public void settNome(String tNome) {
		this.tNome = tNome;
	}

	public String gettProvinciaNascita() {
		return tProvinciaNascita;
	}

	public void settProvinciaNascita(String tProvinciaNascita) {
		this.tProvinciaNascita = tProvinciaNascita;
	}

	public String gettProvinciaResidenza() {
		return tProvinciaResidenza;
	}

	public void settProvinciaResidenza(String tProvinciaResidenza) {
		this.tProvinciaResidenza = tProvinciaResidenza;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.tNome + ' ' + this.tCognome + ' ' + this.email);
		return sb.toString();
	}
}
