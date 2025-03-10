package com.advancia.qitest.services;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.advancia.qitest.dtos.TestDTO;
import com.advancia.qitest.models.EsecuzioneTest;
import com.advancia.qitest.models.Test;
import com.advancia.qitest.repositories.EsecuzioneTestRepository;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EsecuzioneTestService {
    @Autowired
    private EsecuzioneTestRepository esecuzioneTestRepository;

    public List<TestDTO> findAllTestDTONonEseguitiByIdUtente(String idUtente) {
        List<Test> list = esecuzioneTestRepository.findAllListaTestUtenteById(idUtente);
        List<TestDTO> listDto = new ArrayList<>();
        for (Test t : list) {
            TestDTO tDto = new TestDTO();
            tDto.setIdTest(t.getIdTest());
            tDto.settDescrizioneTest(t.getTDescrizioneTest());
            tDto.settDurata(t.getTDurata());
            tDto.setdDataInser(t.getDDataInser());
            listDto.add(tDto);
        }
        return listDto;
    }

    public void updateFineEsecuzioneTest(String idTest, String idUtente) {
        EsecuzioneTest et = esecuzioneTestRepository.findByIdUtenteAndIdTest(Integer.parseInt(idUtente), Integer.parseInt(idTest));
        Calendar calendar = Calendar.getInstance();
        Timestamp currentTimestamp = new Timestamp(calendar.getTime().getTime());
        et.setDDataEndTest(currentTimestamp);
    }

    public void updateInizioEsecuzioneTest(String idTest, String idUtente) {
        EsecuzioneTest et = esecuzioneTestRepository.findByIdUtenteAndIdTest(Integer.parseInt(idUtente),
                Integer.parseInt(idTest));
        Calendar calendar = Calendar.getInstance();
        Timestamp currentTimestamp = new Timestamp(calendar.getTime().getTime());
        et.setDDataIniTest(currentTimestamp);
    }
}
