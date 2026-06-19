package it.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class EsempiJdbc {

	public static void main(String[] args) {

		try {
			// Connessione al database PostgreSQL
			Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", // URL del DB
					"postgres", // Utente
					"6586" // Password
			);

			System.out.println("Connesso!");

			try {
				// Crea la tabella studenti
				Statement s = conn.createStatement();
				String query = "CREATE TABLE ctf_studenti (" + "id INTEGER PRIMARY KEY, " + "nome VARCHAR(255), "
						+ "eta INTEGER" + ")";
				s.executeUpdate(query);
				System.out.println("Tabella creata");
				conn.close();
			} catch (Exception e) {
				System.out.println("C'è un errore nella query: " + e.getMessage());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
