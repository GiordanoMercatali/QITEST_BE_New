package com.advancia.qitest.dtos;

public class UtenteTestDTO {
    private int idUtenteQuiz;
    private int idUtente;
    private int[] idTest;
    private String tipoQuiz;
    private int mostraRisultati;
    private int ord;
    private boolean flagStudio;
    
    public UtenteTestDTO() {
    }

    public int getIdUtenteQuiz() {
        return idUtenteQuiz;
    }

    public void setIdUtenteQuiz(int idUtenteQuiz) {
        this.idUtenteQuiz = idUtenteQuiz;
    }

	public String getTipoQuiz() {
        return tipoQuiz;
    }

    public void setTipoQuiz(String tipoQuiz) {
        this.tipoQuiz = tipoQuiz;
    }

    public int getMostraRisultati() {
        return mostraRisultati;
    }

    public void setMostraRisultati(int mostraRisultati) {
        this.mostraRisultati = mostraRisultati;
    }

    public int getOrd() {
        return ord;
    }

    public void setOrd(int ord) {
        this.ord = ord;
    }

    public boolean isFlagStudio() {
        return flagStudio;
    }

    public void setFlagStudio(boolean flagStudio) {
        this.flagStudio = flagStudio;
    }

	public int getIdUtente() {
		return idUtente;
	}

	public void setIdUtente(int idUtente) {
		this.idUtente = idUtente;
	}

	public int[] getIdTest() {
		return idTest;
	}

	public void setIdTest(int[] idTest) {
		this.idTest = idTest;
	}   
}
