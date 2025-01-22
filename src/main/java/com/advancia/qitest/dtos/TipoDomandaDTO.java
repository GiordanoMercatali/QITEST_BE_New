package com.advancia.qitest.dtos;

public class TipoDomandaDTO {
    private int idTipoDomanda;
    private String tTipoDomanda;
    private boolean fDeleted;

    public TipoDomandaDTO() {
    }

    public int getIdTipoDomanda() {
        return idTipoDomanda;
    }

    public void setIdTipoDomanda(int idTipoDomanda) {
        this.idTipoDomanda = idTipoDomanda;
    }

    public boolean isfDeleted() {
        return fDeleted;
    }

    public void setfDeleted(boolean fDeleted) {
        this.fDeleted = fDeleted;
    }

    public String gettTipoDomanda() {
        return tTipoDomanda;
    }

    public void settTipoDomanda(String tTipoDomanda) {
        this.tTipoDomanda = tTipoDomanda;
    }
    
    @Override
    public String toString() {
        return "TipoDomandaDTO{" + '\n' +
               "idTipoDomanda=" + idTipoDomanda +'\n' +
               ", fDeleted=" + fDeleted +'\n' +
               ", tTipoDomanda='" + tTipoDomanda + '\'' +
               '}';
    }

}
