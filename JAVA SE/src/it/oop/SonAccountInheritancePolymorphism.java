package it.oop;

public class SonAccountInheritancePolymorphism extends FatherAccountModel {

	private int canoneAnnuo;

	public void setCanoneAnnuo(int canoneAnnuo) {
		this.canoneAnnuo = canoneAnnuo;
	}

	@Override
	public int getFirstDeposit() {

		return super.getFirstDeposit();

	}

	@Override
	public int getFirstDraw() {

		return super.getFirstDraw();
	}

	@Override
	public int getSecondDeposit() {

		return super.getSecondDeposit();
	}

	@Override
	public int getSecondDraw() {

		return super.getSecondDeposit() - super.getSecondDraw();

	}

	public int getCanoneAnnuo() {

		return getSecondDraw() * canoneAnnuo / 100;
	}

	@Override
	public int getTotalAccount() {

		return getSecondDraw() - getCanoneAnnuo();
	}

}
