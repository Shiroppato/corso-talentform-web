package it.methods;

public class OverloadStudente {
	
	public String getAnagraficaStudente(String nome, String cognome) {

		return nome + "  " + cognome;
	}

	public float getAnagraficaStudente(float età) {

		return età;
	}

	public int getAnagraficaStudente(int telefono) {

		return telefono;
	}


}
