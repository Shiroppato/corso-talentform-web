package it.controlflow;

public class EsempiIfElse {

	public static void main(String[] args) {
		
		// OPERATORI
		
		/*
		 +
		 -
		 *
		 /
		 %
	
		*/
		
		
		// OPERATORI RELAZIONALI
		
		/*
		 < MINORE
		 > MAGGIORE
		 <= MINORE UGUALE
		 >= MAGGIORE UGUALE
		 == UGUALE A
		 != DIVERSO DA
	
		*/
		
	// OPERATORI LOGICI
		
		/*
		 && AND
		 || OR
		  ! NEGATO
	
		*/
		
		
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		
		
		if (a>b) {
			System.out.println(true);
			
		} else if (c>d) {
            System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		System.out.println("------------");
		
		
		if (a < b && c< d) {
			System.out.println(true);
			
		} else {
           System.out.println(false);
		}
		
		
		if (a > b && c< d) {
			System.out.println(true);
			
		} else {
           System.out.println(false);
		}
		
		if (a > b && c> d) {
			System.out.println(true);
			
		} else {
           System.out.println(false);
		}
		
		System.out.println("------------");
		
		if (a < b || c< d) {
			System.out.println(true);
			
		} else {
           System.out.println(false);
		}
		
		
		if (a > b || c< d) {
			System.out.println(true);
			
		} else {
           System.out.println(false);
		}
		
		if (a > b || c> d) {
			System.out.println(true);
			
		} else {
           System.out.println(false);
		}
		
		System.out.println("------------");
		
		
		boolean value = true;

		System.out.println(!value); 
		
		boolean on = false;
		
		if (!on) {
		    System.out.println("Off");
		}
		
		
		System.out.println("------------");
		
		
		

		// SCRIVI UN PROGRAMMA CHE CONTROLLA SE UN NUMERO E POSITIVO O NEGATIVO

		int numero = -5;

		if (numero >= 0) {
			System.out.println("SONO UN NUMERO POSITIVO");

		} else {
			System.out.println("SONO UN NUMERO NEGATIVO");

		}
		
		System.out.println("------------");
		

		// VERIFICA SE UN NUMERO E POSITIVO O NENGATIVO OPPURE E ZERO

		int number = -1;

		if (number > 0) {
			System.out.println("NUMERO POSITIVO");

		} else if (number < 0) {

			System.out.println("NUMERO NEGATIVO");

		}

		else {

			System.out.println("NUMBER E ZERO");
		}

	}

}
