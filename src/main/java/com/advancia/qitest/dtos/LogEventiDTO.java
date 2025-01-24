package com.advancia.qitest.dtos;

import java.util.Date;

public class LogEventiDTO {
    private int idLogEventi;
    private UtenteTestDTO quiz;
    private String messaggio;
    private Date dataInserimento;
    
    public LogEventiDTO() {
    }

    public int getIdLogEventi() {
        return idLogEventi;
    }

    public void setIdLogEventi(int idLogEventi) {
        this.idLogEventi = idLogEventi;
    }

    public UtenteTestDTO getQuiz() {
        return quiz;
    }

    public void setQuiz(UtenteTestDTO quiz) {
        this.quiz = quiz;
    }

    public String getMessaggio() {
        return messaggio;
    }

    public void setMessaggio(String messaggio) {
        this.messaggio = messaggio;
    }

    public Date getDataInserimento() {
        return dataInserimento;
    }

    public void setDataInserimento(Date dataInserimento) {
        this.dataInserimento = dataInserimento;
    }
}
