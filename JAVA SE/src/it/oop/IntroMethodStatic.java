package it.oop;

public class IntroMethodStatic {

	// INCAPSULAMENTO
	private static int balance;
	private static int firstDeposit;
	private static int firstDraw;
	private static int secondDeposit;
	private static int secondDraw;
	private static int canoneAnnuo;

	// INCAPSULAMENTO

	public static void setBalance(int balance) {
		IntroMethodStatic.balance = balance;
	}

	public static int getFirstDeposit() {
		return IntroMethodStatic.balance + IntroMethodStatic.firstDeposit;
	}

	public static void setFirstDeposit(int firstDeposit) {
		IntroMethodStatic.firstDeposit = firstDeposit;
	}

	public static int getFirstDraw() {
		return getFirstDeposit() - secondDraw;
	}

	public static void setFirstDraw(int firstDraw) {
		IntroMethodStatic.firstDraw = firstDraw;
	}

	public static int getSecondDeposit() {
		return getFirstDraw() + secondDeposit;
	}

	public static void setSecondDeposit(int secondDeposit) {
		IntroMethodStatic.secondDeposit = secondDeposit;
	}

	public static int getSecondDraw() {
		return getSecondDeposit() - secondDraw;
	}

	public static void setSecondDraw(int secondDraw) {
		IntroMethodStatic.secondDraw = secondDraw;
	}

	public static int getCanoneAnnuo() {
		return getSecondDraw() * canoneAnnuo / 100;
	}

	public static void setCanoneAnnuo(int canoneAnnuo) {
		IntroMethodStatic.canoneAnnuo = canoneAnnuo;
	}

	public static int getTotalAccount() {
		return getSecondDraw() - getCanoneAnnuo();
	}

	public static void main(String[] args) {

		IntroMethodStatic.setBalance(0);
		IntroMethodStatic.setFirstDeposit(500);
		IntroMethodStatic.setFirstDraw(100);
		IntroMethodStatic.setSecondDeposit(200);
		IntroMethodStatic.setSecondDraw(50);
		IntroMethodStatic.setCanoneAnnuo(10);

		System.out.println("Saldo Attuale : €" + IntroMethodStatic.getTotalAccount());

	}

}
