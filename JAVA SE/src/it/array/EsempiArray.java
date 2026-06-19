package it.array;

public class EsempiArray {

	public static void main(String[] args) {
		
		
		int[] array = new int[5];

		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;

		String[] stringhe = new String[3];
		stringhe[0] = "fragole";
		stringhe[1] = "arance";
		stringhe[2] = "kiwi";

		System.out.println(stringhe.length); // DETERMINO LA LUNGHEZZA DELL'ARRAY
		System.out.println(stringhe[0]); // ESTRAZIONE DEL PRIMO ELEMENTO ALL'INTERNO DELL'ARRAY

		System.out.println("------------------");

		for (String in : stringhe) { // FOREACH SCORRE GLI ELEMENTI DELL'ARRAY

			System.out.println(in);

			System.out.println("------------------");

			String[] colori = { "rosso", "giallo", "verde", "viola" };

			System.out.println(colori.length);
			System.out.println(colori[2]);

			System.out.println("------------------");

			for (String frutta : colori) {

				System.out.println(frutta);
			}

			System.out.println("------------------");

			for (int i = 0; i < colori.length; i++) { // ITERA LA LUNGHEZZA DELL'ARRAY

				System.out.println(i);

			}

		}
		

	}

}
