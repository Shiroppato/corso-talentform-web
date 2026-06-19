package it.string;

public class EsempiString {

	public static void main(String[] args) {

		// LENGTH

		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(txt.length()); // CALCOLA LA LUNGHEZZA DEI CARATTERI DI UNA STRINGA

		// CONCAT

		String name = "fabio ";
		String surname = "di gloria";
		String nameSurname = name.concat(surname);

		System.out.println(nameSurname);

		String hello = "Hello";
		String world = "World";
		String output = hello.concat(world);
		System.out.println(output);

		// REPLACE

		String myStr = "Javascript";
		System.out.println(myStr.replace("J", "j"));

		// TRIM

		String javascript = "       Javascript        ";
		System.out.println(javascript.trim());
		
		
		// CONFRONTA DUE STRINGHE
		
		String a = "Java";
        String b = "java";
        System.out.println(a.equals(b));
        
        // ESTRAI IL TERZO CARATTERE DELLA PAROLA "COMPUTER"
        String parola = "Computer";
        char terzo = parola.charAt(2);
        System.out.println(terzo);
        
        // CONVERTI UN NUMERO IN STRINGA
        
 
        int numero = 42;
        String testo = String.valueOf(numero);
        System.out.println(testo + " è una stringa");


        
        
        
        

		
		
		
		

	}

}
