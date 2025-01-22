package com.advancia.qitest.dtos;

import java.sql.Timestamp;

public class RispostaDTO {
    private int idRisposta;
    private Timestamp dDataInser;
    private Timestamp dDataUpdate;
    private boolean fDeleted;
    private int fFlagCorretta;
    private String tImagePath;
    private String tTestoRisposta;
    private DomandaDTO domanda;

    public RispostaDTO() {

    }

    public int getIdRisposta() {
        return idRisposta;
    }

    public void setIdRisposta(int idRisposta) {
        this.idRisposta = idRisposta;
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

    public int getfFlagCorretta() {
        return fFlagCorretta;
    }

    public void setfFlagCorretta(int fFlagCorretta) {
        this.fFlagCorretta = fFlagCorretta;
    }

    public String gettImagePath() {
        return tImagePath;
    }

    public void settImagePath(String tImagePath) {
        this.tImagePath = tImagePath;
    }

    public String gettTestoRisposta() {
        return tTestoRisposta;
    }

    public void settTestoRisposta(String tTestoRisposta) {
        this.tTestoRisposta = tTestoRisposta;
    }

    public DomandaDTO getDomanda() {
        return domanda;
    }

    public void setDomanda(DomandaDTO domanda) {
        this.domanda = domanda;
    }

    
}
