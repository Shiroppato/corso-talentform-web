package it.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IntroIterator {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();

		names.add("luca");
		names.add("paolo");
		names.add("marco");
		names.add("anna");
		names.remove("luca");

		Iterator<String> it = names.iterator();

		while (it.hasNext()) {

			String students = it.next();

			System.out.println(students);

		}

	}

}
