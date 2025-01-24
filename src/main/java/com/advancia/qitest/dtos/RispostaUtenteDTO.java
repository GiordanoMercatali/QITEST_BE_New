package com.advancia.qitest.dtos;

public class RispostaUtenteDTO {
    private int idRispostaUtente;
    private TestDTO test;
    private RispostaDTO risposta;
    private DomandaDTO domanda;
    private UtenteDTO utente;
    private String note;
    private String testoRisposta;
    private UtenteTestDTO quizUtente;

    public RispostaUtenteDTO() {
    }

    public int getIdRispostaUtente() {
        return idRispostaUtente;
    }

    public void setIdRispostaUtente(int idRispostaUtente) {
        this.idRispostaUtente = idRispostaUtente;
    }

    public TestDTO getTest() {
        return test;
    }

    public void setTest(TestDTO test) {
        this.test = test;
    }

    public RispostaDTO getRisposta() {
        return risposta;
    }

    public void setRisposta(RispostaDTO risposta) {
        this.risposta = risposta;
    }

    public DomandaDTO getDomanda() {
        return domanda;
    }

    public void setDomanda(DomandaDTO domanda) {
        this.domanda = domanda;
    }

    public UtenteDTO getUtente() {
        return utente;
    }

    public void setUtente(UtenteDTO utente) {
        this.utente = utente;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getTestoRisposta() {
        return testoRisposta;
    }

    public void setTestoRisposta(String testoRisposta) {
        this.testoRisposta = testoRisposta;
    }

    public UtenteTestDTO getQuizUtente() {
        return quizUtente;
    }

    public void setQuizUtente(UtenteTestDTO quizUtente) {
        this.quizUtente = quizUtente;
    }

    
}
