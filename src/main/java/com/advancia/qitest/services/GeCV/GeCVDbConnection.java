package com.advancia.qitest.services.GeCV;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.naming.NamingException;

public class GeCVDbConnection {
    String url = "jdbc:mysql://localhost:3306/gecv";
    String username = "root";
    String password = "passwordSQL";
	private Connection conn = null;

	public void gestisciConnessione() throws NamingException, SQLException {
		if (conn == null) {
			conn = DriverManager.getConnection(url, username, password);
		}
	}

    public Connection getConn() {
        return conn;
    }
}