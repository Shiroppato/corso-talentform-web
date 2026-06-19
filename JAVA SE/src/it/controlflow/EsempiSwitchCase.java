package it.controlflow;

public class EsempiSwitchCase {

	public static void main(String[] args) {

		int searchNumber = 10;

		switch (searchNumber) {

		case 4:
			System.out.println("Numero trovato 4");

			break;

		case 6:
			System.out.println("Numero trovato 6");
			break;

		case 8:
			System.out.println("Numero trovato 8");
			break;

		default:

			System.out.println("Il numero 10 non è stato trovato");

			break;
		}
		
		System.out.println("-------------");

		// Usa uno switch per stampare il giorno della settimana dato un numero da 1 a
		// 7.

		int giorno = 3;

		switch (giorno) {
		case 1:
			System.out.println("Lunedì");
			break;
		case 2:
			System.out.println("Martedì");
			break;
		case 3:
			System.out.println("Mercoledì");
			break;
		case 4:
			System.out.println("Giovedì");
			break;
		case 5:
			System.out.println("Venerdì");
			break;
		case 6:
			System.out.println("Sabato");
			break;
		case 7:
			System.out.println("Domenica");
			break;
		default:
			System.out.println("Numero non valido");
		}

	}

}
