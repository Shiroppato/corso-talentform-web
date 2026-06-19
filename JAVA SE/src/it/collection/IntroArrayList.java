package it.collection;

import java.util.ArrayList;
import java.util.Collections;

public class IntroArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> codiceProdotto = new ArrayList<Integer>();
		codiceProdotto.add(5);
		codiceProdotto.add(15);
		codiceProdotto.add(25);
		codiceProdotto.add(35);
		codiceProdotto.add(45);
		codiceProdotto.add(55);
		codiceProdotto.add(65);
		
		Collections.reverse(codiceProdotto);

		for (Integer lista : codiceProdotto) {
			System.out.println("Elenco codici :" + lista);

		}

		System.out.println("-----------------------");

		ArrayList<String> nomiStudenti = new ArrayList<String>();

		nomiStudenti.add("Marco");
		nomiStudenti.add("Andrea");
		nomiStudenti.add("Luca");
		nomiStudenti.add("Mirko");
		
		Collections.reverse(nomiStudenti);

		for (String lista : nomiStudenti) {
			System.out.println("Nome studente :" + lista);
			
			

		}
		

		System.out.println(nomiStudenti.size());
		
		nomiStudenti.clear();
		System.out.println(nomiStudenti.isEmpty());

	}

}
