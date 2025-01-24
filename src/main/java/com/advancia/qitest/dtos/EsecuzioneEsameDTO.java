package com.advancia.qitest.dtos;

import java.sql.Timestamp;

public class EsecuzioneEsameDTO {
    private int idEsecuzioneEsame;
    private Timestamp dDataEndEsame;
    private Timestamp dDataIniEsame;
    private boolean fDeleted;
    private EsameDTO esame;
    private UtenteDTO utente;
    private UtenteTestDTO quizUtente;

    public EsecuzioneEsameDTO() {
    }

    public int getIdEsecuzioneEsame() {
        return idEsecuzioneEsame;
    }

    public void setIdEsecuzioneEsame(int idEsecuzioneEsame) {
        this.idEsecuzioneEsame = idEsecuzioneEsame;
    }

    public Timestamp getdDataEndEsame() {
        return dDataEndEsame;
    }

    public void setdDataEndEsame(Timestamp dDataEndEsame) {
        this.dDataEndEsame = dDataEndEsame;
    }

    public Timestamp getdDataIniEsame() {
        return dDataIniEsame;
    }

    public void setdDataIniEsame(Timestamp dDataIniEsame) {
        this.dDataIniEsame = dDataIniEsame;
    }

    public boolean isfDeleted() {
        return fDeleted;
    }

    public void setfDeleted(boolean fDeleted) {
        this.fDeleted = fDeleted;
    }

    public EsameDTO getEsame() {
        return esame;
    }

    public void setEsame(EsameDTO esame) {
        this.esame = esame;
    }

    public UtenteDTO getUtente() {
        return utente;
    }

    public void setUtente(UtenteDTO utente) {
        this.utente = utente;
    }

    public UtenteTestDTO getQuizUtente() {
        return quizUtente;
    }

    public void setQuizUtente(UtenteTestDTO quizUtente) {
        this.quizUtente = quizUtente;
    }
    
    @Override
    public String toString() {
        return "EsecuzioneEsameDTO{" +
                "idEsecuzioneEsame=" + idEsecuzioneEsame +
                ", dDataEndEsame=" + dDataEndEsame +
                ", dDataIniEsame=" + dDataIniEsame +
                ", fDeleted=" + fDeleted +
                ", esame=" + (esame != null ? esame.toString() : "null") +
                ", utente=" + (utente != null ? utente.toString() : "null") +
                ", quizUtente=" + (quizUtente != null ? quizUtente.toString() : "null") +
                '}';
    }

}


