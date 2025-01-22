package com.advancia.qitest.mapping;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.advancia.qitest.dtos.AziendaDTO;
import com.advancia.qitest.dtos.DomandaDTO;
import com.advancia.qitest.dtos.EsameDTO;
import com.advancia.qitest.dtos.EsecuzioneEsameDTO;
import com.advancia.qitest.dtos.EsecuzioneTestDTO;
import com.advancia.qitest.dtos.QuizDTO;
import com.advancia.qitest.dtos.RispostaDTO;
import com.advancia.qitest.dtos.RispostaUtenteDTO;
import com.advancia.qitest.dtos.TestDTO;
import com.advancia.qitest.dtos.TipoDomandaDTO;
import com.advancia.qitest.dtos.UtenteDTO;
import com.advancia.qitest.models.Azienda;
import com.advancia.qitest.models.Domanda;
import com.advancia.qitest.models.Esame;
import com.advancia.qitest.models.EsecuzioneEsame;
import com.advancia.qitest.models.EsecuzioneTest;
import com.advancia.qitest.models.Quiz;
import com.advancia.qitest.models.Risposta;
import com.advancia.qitest.models.RispostaUtente;
import com.advancia.qitest.models.Test;
import com.advancia.qitest.models.TipoDomanda;
import com.advancia.qitest.models.Utente;

@Configuration
public class ModelMapperConfig {

	@Bean
	public ModelMapper modelMapper() {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.addMappings(new PropertyMap<Utente, UtenteDTO>() {
			@Override
			protected void configure() {
			}
		});
		modelMapper.addMappings(new PropertyMap<Azienda, AziendaDTO>() {
			@Override
			protected void configure() {
			}
		});
		modelMapper.addMappings(new PropertyMap<Domanda, DomandaDTO>() {
			@Override
			protected void configure() {
			}
		});
		modelMapper.addMappings(new PropertyMap<Esame, EsameDTO>() {
			@Override
			protected void configure() {
			}
		});
		modelMapper.addMappings(new PropertyMap<EsecuzioneEsame, EsecuzioneEsameDTO>() {
			@Override
			protected void configure() {
			}
		});
		modelMapper.addMappings(new PropertyMap<EsecuzioneTest, EsecuzioneTestDTO>() {
			@Override
			protected void configure() {
			}
		});
		modelMapper.addMappings(new PropertyMap<Quiz, QuizDTO>() {
			@Override
			protected void configure() {
			}
		});
		modelMapper.addMappings(new PropertyMap<Risposta, RispostaDTO>() {
			@Override
			protected void configure() {
			}
		});
		modelMapper.addMappings(new PropertyMap<RispostaUtente, RispostaUtenteDTO>() {
			@Override
			protected void configure() {
			}
		});
		modelMapper.addMappings(new PropertyMap<Test, TestDTO>() {
			@Override
			protected void configure() {
			}
		});
		modelMapper.addMappings(new PropertyMap<TipoDomanda, TipoDomandaDTO>() {
			@Override
			protected void configure() {
			}
		});
		
		return modelMapper;
		
	}
}