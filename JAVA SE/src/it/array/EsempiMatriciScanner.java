package it.array;

import java.util.Scanner;

public class EsempiMatriciScanner {

	public static void main(String[] args) {

		// Chiedi all'utente di inserire i valori di una matrice 2x2 e stampala.

		Scanner sc = new Scanner(System.in);
		int[][] matrice = new int[2][2];

		System.out.println("Inserisci i valori della matrice 2x2:");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print("Elemento [" + i + "][" + j + "]: ");
				matrice[i][j] = sc.nextInt();
			}
		}

		System.out.println("Matrice inserita:");
		for (int[] riga : matrice) {
			for (int val : riga) {
				System.out.print(val + " ");
			}
			System.out.println();
		}

		System.out.println("--------");

		// Somma di tutti gli elementi di una matrice 3x3

		Scanner scanner = new Scanner(System.in);
		int[][] mat = new int[3][3];
		int somma = 0;

		System.out.println("Inserisci valori matrice 3x3:");
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++) {
				System.out.print("[" + i + "][" + j + "]: ");
				mat[i][j] = scanner.nextInt();
				somma += mat[i][j];
			}

		System.out.println("Somma degli elementi: " + somma);

		scanner.close();

	}

}
