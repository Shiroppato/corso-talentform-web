package it.methods;


public class MainMetodoOverload {

	public static void main(String[] args) {

		MetodoOverload aritmetica = new MetodoOverload();

		int a = 6;
		int b = 5;
		float c = 3.10f;
		float d = 6.10f;
		double e = 4.50;
		double f = 3.10;

		System.out.println("SOMMA DI INT: " + aritmetica.getAritmetica(a, b));
		System.out.println("SOTTRAZIONE DI FLOAT :" + aritmetica.getAritmetica(c, d));
		System.out.println("DIVISIONE DI DOUBLE: " + aritmetica.getAritmetica(e, f));

	}

}
