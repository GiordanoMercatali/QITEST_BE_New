package com.advancia.qitest.services;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.advancia.qitest.dtos.UtenteDTO;
import com.advancia.qitest.models.Utente;
import com.advancia.qitest.repositories.utente.UtenteRepository;

@Service
@Transactional
public class UtenteService {

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private UtenteRepository utenteRepository;

	public List<UtenteDTO> findAllUtenti() {
		List<UtenteDTO> result = utenteRepository.findAllCruscotto();
		return result;
	}
	
	public List<Utente> findAll() {
		List<Utente> result = utenteRepository.findAll();
		return result;
	}

	public List<UtenteDTO> searchUtenti(String tNome, String tCognome, String email) {
		return utenteRepository.searchByFilter(tNome, tCognome, email);
	}

	public boolean eliminaUtente(int idUtente) {
		Utente utente = utenteRepository.findById(idUtente).orElse(null);
		if (utente != null) {
			utenteRepository.delete(utente);
			return true;
		}
		return false;
	}

	public UtenteDTO getUtenteById(int idUtente) {
		return convertToDto(utenteRepository.findUtenteById(idUtente));
	}

	public UtenteDTO convertToDto(Utente u) {
		return modelMapper.map(u, UtenteDTO.class);
	}

    public UtenteDTO patchUtente(Integer idUtente, UtenteDTO utente) {
		Optional<Utente> utenteDaModificareOptional = utenteRepository.findById(idUtente);
		if(utenteDaModificareOptional.isEmpty()) {
			return null;
		}
		Utente utenteDaModificare = utenteDaModificareOptional.get();
		if(utente.getEmail() != null) { utenteDaModificare.setEmail(utente.getEmail()); }
		if(utente.getpPassword() != null) { utenteDaModificare.setPPassword(utente.getpPassword()); }
		if(utente.gettNome() != null) { utenteDaModificare.setTNome(utente.gettNome()); }
		if(utente.gettCognome() != null) { utenteDaModificare.setTCognome(utente.gettCognome()); }
		if(utente.gettCellulare() != null) { utenteDaModificare.setTCellulare(utente.gettCellulare()); }
		if(utente.gettProvinciaNascita() != null) { utenteDaModificare.setTProvinciaNascita(utente.gettProvinciaNascita()); }
		if(utente.gettLuogoNascita() != null) { utenteDaModificare.setTLuogoNascita(utente.gettLuogoNascita()); }
		if(utente.gettCittaResidenza() != null) { utenteDaModificare.setTCittaResidenza(utente.gettCittaResidenza()); }
		if(utente.gettCivicoResidenza() != null) { utenteDaModificare.setTCivicoResidenza(utente.gettCivicoResidenza()); }
		if(utente.gettIndirizzoResidenza() != null) { utenteDaModificare.setTIndirizzoResidenza(utente.gettIndirizzoResidenza()); }
		if(utente.gettCapResidenza() != null) { utenteDaModificare.setTCapResidenza(utente.gettCapResidenza()); }
		if(utente.gettProvinciaResidenza() != null) { utenteDaModificare.setTProvinciaResidenza(utente.gettProvinciaResidenza()); }
		if(utente.gettCodiceFiscale() != null) { utenteDaModificare.setTCodiceFiscale(utente.gettCodiceFiscale()); }
		if(utente.getdDataNascita() != null) { utenteDaModificare.setDDataNascita(utente.getdDataNascita()); }
		utenteRepository.save(utenteDaModificare);
		return utente;
    }
}
