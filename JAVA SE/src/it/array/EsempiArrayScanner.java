package it.array;

import java.util.Scanner;

public class EsempiArrayScanner {

	public static void main(String[] args) {

		// Inserisci 5 numeri interi e stampali

		Scanner scanner = new Scanner(System.in);
		int[] numeri = new int[5];

		for (int i = 0; i < numeri.length; i++) {
			System.out.print("Inserisci un numero: ");
			numeri[i] = scanner.nextInt();
		}

		System.out.println("Numeri inseriti:");
		for (int num : numeri) {
			System.out.println(num);
		}

		// Calcola la somma degli elementi

		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[5];
		int somma = 0;

		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Inserisci un numero: ");
			numbers[i] = sc.nextInt();
			somma += numbers[i];
		}

		System.out.println("Somma: " + somma);

		sc.close();

	}

}
