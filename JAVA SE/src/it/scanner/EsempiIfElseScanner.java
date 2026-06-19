package it.scanner;

import java.util.Scanner;

public class EsempiIfElseScanner {
	
	public static void main(String[] args) {
		
		// Chiedi username e password e verifica se sono corretti.
		
	      Scanner sc = new Scanner(System.in);

	        System.out.print("Inserisci username: ");
	        String user = sc.nextLine();

	        System.out.print("Inserisci password: ");
	        String pass = sc.nextLine();

	        if (user.equals("admin") && pass.equals("1234")) {
	            System.out.println("Accesso consentito");
	        } else {
	            System.out.println("Accesso negato");
	        }
	        
	     
	        // Chiedi l’età e verifica se la persona è maggiorenne.
	        
	        Scanner age = new Scanner(System.in);

	        System.out.print("Inserisci la tua età: ");
	        int eta = age.nextInt();

	        if (eta >= 18) {
	            System.out.println("Sei maggiorenne");
	        } else {
	            System.out.println("Sei minorenne");
	        }
	        
		    age.close();
		
	}

}
