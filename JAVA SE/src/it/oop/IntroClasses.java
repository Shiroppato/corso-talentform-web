package it.oop;


//MODELLO SOFTWARE O ENTITA' SOFTWARE DI ALTO LIVELLO
public class IntroClasses {
	
	// MODEL

	// ATTRIBUTI DELLA CLASSE

	String nome;
	int age;
	String surname;
	String nation;

	// COSTRUTTORE DELLA CLASSE

	public IntroClasses(String nome, int age, String surname, String nation) { // DICHIARAZIONE DEL COSTRUTTORE DELLA CLASSE
																			// CON I PARAMETRI PASSATI IN INGRESSO

		this.nome = nome; // DICHIARAZIONE ED INIZIALIZZAZIONE DEGLI ATTRIBUTI DELLA CLASSE
		this.age = age;
		this.surname = surname;
		this.nation = nation;
	}

	// METODI DELLA CLASSE

	public String getNome() {   // METODO DI LETTURA DI TIPO GET
		return nome;
	}

	public void setNome(String nome) { // METODO DI SCRITTURA DI TIPO SET
		this.nome = nome;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}
	
	
	

	public static void main(String[] args) {
		
		IntroClasses oggetto = new IntroClasses("FABIO", 39, "DI GLORIA", "ITALIA"); // INIZIALIZZO IL COSTRUTTORE E ARGOMENTI
		// DELLA CLASSE

System.out.println(oggetto.nome);
System.out.println(oggetto.surname);


oggetto.setNome("Teacher");

System.out.println("IL MIO NUOVO NOME E' " +oggetto.getNome());

	}

}
