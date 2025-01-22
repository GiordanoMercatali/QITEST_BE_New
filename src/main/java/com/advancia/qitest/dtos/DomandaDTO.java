package com.advancia.qitest.dtos;

import java.sql.Timestamp;
import java.util.List;

public class DomandaDTO {
    private int idDomanda;
    private Timestamp dDataInser;
    private Timestamp dDataUpdate;
    private boolean fDeleted;
    private String tImagePath;
    private String tTestoDomanda;
    private TipoDomandaDTO tipoDomanda;
    private List<RispostaDTO> risposte;
    private List<TestDTO> tests;

    public DomandaDTO() {
    }

    public int getIdDomanda() {
        return idDomanda;
    }

    public void setIdDomanda(int idDomanda) {
        this.idDomanda = idDomanda;
    }

    public Timestamp getdDataInser() {
        return dDataInser;
    }

    public void setdDataInser(Timestamp dDataInser) {
        this.dDataInser = dDataInser;
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

    public String gettImagePath() {
        return tImagePath;
    }

    public void settImagePath(String tImagePath) {
        this.tImagePath = tImagePath;
    }

    public String gettTestoDomanda() {
        return tTestoDomanda;
    }

    public void settTestoDomanda(String tTestoDomanda) {
        this.tTestoDomanda = tTestoDomanda;
    }

    public TipoDomandaDTO getTipoDomanda() {
        return tipoDomanda;
    }

    public void setTipoDomanda(TipoDomandaDTO tipoDomanda) {
        this.tipoDomanda = tipoDomanda;
    }

    public List<RispostaDTO> getRisposte() {
        return risposte;
    }

    public void setRisposte(List<RispostaDTO> risposte) {
        this.risposte = risposte;
    }

    public List<TestDTO> getTests() {
        return tests;
    }

    public void setTests(List<TestDTO> tests) {
        this.tests = tests;
    }

    @Override
    public String toString() {
        return "DomandaDTO{" +
               "idDomanda=" + idDomanda + '\n' +
               ", dDataInser=" + dDataInser + '\n' +
               ", dDataUpdate=" + dDataUpdate + '\n' +
               ", fDeleted=" + fDeleted + '\n' +
               ", tImagePath='" + tImagePath + '\n' +
               ", tTestoDomanda='" + tTestoDomanda + '\'' +
               ", tipoDomanda=" + (tipoDomanda != null ? tipoDomanda.toString() : "null") +
               ", risposte=" + (risposte != null ? risposte : "null") +
               ", tests=" + (tests != null ? tests : "null") +
               '}';
    }


    
}
