package it.controlflow;

public class EsempiFor {

	public static void main(String[] args) {
		
		
		//Scrivi un programma che stampa i numeri da 1 a 10 usando un ciclo for.
		
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

		
		
		
		for (int i = 0; i <= 10; i = i + 2) { // INCREMENTO

			if (i == 6) {
				continue;

			}

			System.out.println("i =" + i);
		}

		System.out.println(" -------------------------  ");

		for (int i = 20; i >= 10; i = i - 2) {

			// DECREMENTO
			if (i == 16) {
				continue;

			}

			System.out.println("i =" + "  " + i);
		}

	}

}
