package it.handling.exception;

public class EsempiHandlingException {

	public static void main(String[] args) {
		
//		int divisione = 5 / 0;
//		System.out.println(divisione);

		try {
			int divisione = 5 / 0;
			System.out.println(divisione);
		} catch (Exception e) {

		}

		finally {

			System.out.println("ECCEZIONE GESTITA");

		}

//		int [] array = {1,2,3,4,5};
//		System.out.println(array [10]);

		try {

			int[] array = { 1, 2, 3, 4, 5 };
			System.out.println(array[10]);

		} catch (Exception e) {

		}

		finally {

			System.out.println("Array gestito");
		}

		try {
			String nome = null;
			System.out.println(nome.isEmpty());
			System.out.println(nome.length());

		} catch (Exception e) {

		} finally {

			System.out.println("LA VARIABILE DICHIARATA RISULTA NULL NEL TIPO STRING");
		}

	}

}
