package it.scanner;

import java.util.Scanner;

public class EsempiForScanner {

	public static void main(String[] args) {
		
		// Chiedi all’utente di inserire 5 numeri e calcola la somma.
	
		 Scanner sc = new Scanner(System.in);
	        int somma = 0;

	        for (int i = 1; i <= 5; i++) {
	            System.out.print("Inserisci numero " + i + ": ");
	            int numero = sc.nextInt();
	            somma += numero;
	        }

	        System.out.println("Somma totale: " + somma);
		
	        
	     
	        
//	        // Chiedi all’utente di inserire 6 numeri e conta quanti sono pari.
	        
	        Scanner count = new Scanner(System.in);
	        int countPari = 0;

	        for (int i = 1; i <= 6; i++) {
	            System.out.print("Inserisci numero " + i + ": ");
	            int numero = count.nextInt();

	            if (numero % 2 == 0) {
	                countPari++;
	            }
	        }

	        System.out.println("Numeri pari inseriti: " + countPari);
	        
	        count.close();
		

	}

}
