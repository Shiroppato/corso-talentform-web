package it.oop;

public class MainAccount {

	public static void main(String[] args) {

		FatherAccountModel father = new FatherAccountModel();

		father.setBalance(0);
		father.setFirstDeposit(500);
		father.setFirstDraw(100);
		father.setSecondDeposit(200);
		father.setSecondDraw(50);

		System.out.println("SALDO -- FATHER :" + father.getTotalAccount() + "€");

		SonAccountInheritancePolymorphism son = new SonAccountInheritancePolymorphism();

		son.setBalance(0);
		son.setFirstDeposit(500);
		son.setFirstDraw(100);
		son.setSecondDeposit(200);
		son.setSecondDraw(50);
		son.setCanoneAnnuo(15);

		System.out.println("SALDO -- SON :" + son.getTotalAccount() + "€");

	}

}
