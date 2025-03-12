package com.advancia.qitest.services.GeCV;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.advancia.qitest.models.Utente;

public class UtentiDAO extends GeCVDbConnection {
    private static final Logger logger = LoggerFactory.getLogger(GeCVDbConnection.class);

    public void updateVotoTestLogica(Utente utente, Integer risultato) {
        try {
            super.gestisciConnessione();
            String sql = "UPDATE utenti SET test_logica = ? WHERE nome = ? AND cognome = ? AND email = ?";
            PreparedStatement ps = super.getConn().prepareStatement(sql);
            ps.setString(1, risultato.toString());
            ps.setString(2, utente.getTNome());
            ps.setString(3, utente.getTCognome());
            ps.setString(4, utente.getEmail());
            int nRows = ps.executeUpdate();
            if (nRows != 1) {
                logger.warn("Update failed: expected 1 row to be updated, but got {}", nRows);
            }
        } catch (SQLException e) {
            logger.error("SQL error while updating test_logico for user: {}", utente.getEmail(), e);
        } catch (Exception e) {
            logger.error("Unexpected error while updating test_logico for user: {}", utente.getEmail(), e);
        }
    }

    public void updateVotoTestAnalitico(Utente utente, Integer risultato) {
        try {
            String sql = "UPDATE utenti SET test_analitico = ? WHERE nome = ? AND cognome = ? AND email = ?";
            super.gestisciConnessione();
            PreparedStatement ps = super.getConn().prepareStatement(sql);
            ps.setString(1, risultato.toString());
            ps.setString(2, utente.getTNome());
            ps.setString(3, utente.getTCognome());
            ps.setString(4, utente.getEmail());
            int nRows = ps.executeUpdate();
            if (nRows != 1) {
                logger.warn("Update failed: expected 1 row to be updated, but got {}", nRows);
            }
        } catch (SQLException e) {
            logger.error("SQL error while updating test_analitico for user: {}", utente.getEmail(), e);
        } catch (Exception e) {
            logger.error("Unexpected error while updating test_analitico for user: {}", utente.getEmail(), e);
        }
    }
}
