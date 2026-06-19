package it.string;

public class EsempiStringBuilder {
	
	public static void main(String[] args) {
	
		   StringBuilder word = new StringBuilder("Hello ");
	        word.append("Java");
	        System.out.println(word);
	        
	        
	        StringBuilder color = new StringBuilder("Red");

	        color.insert(1, "Orange");
	        System.out.println(color);
	        
	        StringBuilder car = new StringBuilder("Audi");

	        car.delete(1, 3);
	        System.out.println(car);
	        

	        StringBuilder football = new StringBuilder("Football");

	        football.reverse();

	        System.out.println(football);
     
            
	        // Crea "Java è potente" usando più append.
	        
	        StringBuilder stb = new StringBuilder();
	        stb.append("Java").append(" è ").append("potente");
	        System.out.println(stb);
	        
	        
	        //Rimuovi l’ultimo carattere da "ciao!".
	        
	        StringBuilder parola = new StringBuilder("ciao!");
	        parola.deleteCharAt(parola.length() - 1);
	        System.out.println(parola);
	        
	        
           // Sostituisci "gatto" con "cane".
	        
	        StringBuilder animale = new StringBuilder("Il gatto dorme");
	        animale.replace(3, 8, "cane");
	        System.out.println(animale);
     
	}
}
