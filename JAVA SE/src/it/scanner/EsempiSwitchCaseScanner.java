package it.scanner;

import java.util.Scanner;

public class EsempiSwitchCaseScanner {
	
	public static void main(String[] args) {
		
		// Chiedi all’utente un numero da 1 a 7 e stampa il giorno della settimana corrispondente.
		
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Inserisci un numero da 1 a 7: ");
	        int giorno = sc.nextInt();

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
	        
	        

	        Scanner word = new Scanner(System.in);

	        System.out.print("Inserisci una lettera: ");
	        String lettera = word.nextLine();

	        switch (lettera) {
	            case "a":
	                System.out.println("Hai scelto A");
	                break;

	            case "b":
	                System.out.println("Hai scelto B");
	                break;

	            default:
	                System.out.println("Scelta non valida");
	        }
		
	        
	        word.close();
		
	}

}
