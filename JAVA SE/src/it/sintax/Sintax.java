package it.sintax;

public class Sintax {

	public static void main(String[] args) {
	
		int numero = 5;
		String nome = "fabio!!";

		System.out.println("HelloWORLD" + " ");

		nome = "antonio";

		System.out.println(nome);

		String colore = "rosso"; // INIZIALIZZAZIONE PER VALORE
		String maglione = colore;
		// INIZIALIZZAZIONE PER RIFERIMENTO

		System.out.println(colore);
		System.out.println(maglione);

		boolean logIn = true;

		logIn = false;
		System.out.println(logIn);
		System.out.println("--------------------------");

		String brand = "Nike";

		int age = 39;
		char voto = 'c';
		double numbers = 100.50;
		float number = 98.40f;

		System.out.println(brand);
		System.out.println(age);
		System.out.println(voto);
		System.out.println(numbers);
		System.out.println(number);


	}

}
