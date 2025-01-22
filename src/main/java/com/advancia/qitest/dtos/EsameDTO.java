package com.advancia.qitest.dtos;

import java.sql.Timestamp;

public class EsameDTO {
    private int idEsame;
    private Timestamp dDataIns;
    private Timestamp dDataUpd;
    private boolean fDeleted;
    private String tDescrizione;
    // private List<Test> tests;
    // private List<EsecuzioneEsame> esecuzioneEsami;

    public EsameDTO() {
    }

    public int getIdEsame() {
        return idEsame;
    }

    public void setIdEsame(int idEsame) {
        this.idEsame = idEsame;
    }

    public Timestamp getdDataIns() {
        return dDataIns;
    }

    public void setdDataIns(Timestamp dDataIns) {
        this.dDataIns = dDataIns;
    }

    public Timestamp getdDataUpd() {
        return dDataUpd;
    }

    public void setdDataUpd(Timestamp dDataUpd) {
        this.dDataUpd = dDataUpd;
    }

    public boolean isfDeleted() {
        return fDeleted;
    }

    public void setfDeleted(boolean fDeleted) {
        this.fDeleted = fDeleted;
    }

    public String gettDescrizione() {
        return tDescrizione;
    }

    public void settDescrizione(String tDescrizione) {
        this.tDescrizione = tDescrizione;
    }

    
}
