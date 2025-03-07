package com.advancia.qitest.utils;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

public class RispostaTestRequest {
    private Map<String, List<String>> mappaDomandaRisposta;
    private Timestamp inizioTestTimestamp;

    public Map<String, List<String>> getMappaDomandaRisposta() {
        return mappaDomandaRisposta;
    }

    public void setMappaDomandaRisposta(Map<String, List<String>> mappaDomandaRisposta) {
        this.mappaDomandaRisposta = mappaDomandaRisposta;
    }

    public Timestamp getInizioTestTimestamp() {
        return inizioTestTimestamp;
    }

    public void setInizioTestTimestamp(Timestamp inizioTestTimestamp) {
        this.inizioTestTimestamp = inizioTestTimestamp;
    }
}
