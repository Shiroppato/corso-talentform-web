package it.methods;


public class MainOverloadStudente {

	public static void main(String[] args) {
		
OverloadStudente studente = new OverloadStudente();
		
		String nome = "fabio";
		String cognome = "di gloria";
		float età = 39.0f;
		int telefono = 1234567890;
		
		System.out.println("NOME E COGNOME :" + studente.getAnagraficaStudente(nome, cognome));
		System.out.println("ETA' :" + studente.getAnagraficaStudente(età));
		System.out.println("TELEFONO :" + studente.getAnagraficaStudente(telefono));
		
	

	}

}
