package it.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDB {

	public static void main(String[] args) {

		try {
			// Connessione al database PostgreSQL
			Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", // URL del DB
					"postgres", // Utente
					"6586" // Password
			);

			System.out.println("Connesso!");
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
