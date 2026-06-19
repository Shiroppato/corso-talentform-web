package it.oop;

public class FatherAccountModel {

	private int balance;

	private int firstDeposit;
	private int firstDraw;
	private int secondDeposit;
	private int secondDraw;

	public int getBalance() {
		return balance;
	}

	public int getFirstDeposit() {
		return balance + firstDeposit;
	}

	public int getFirstDraw() {
		return getFirstDeposit() - firstDraw;
	}

	public int getSecondDraw() {
		return secondDraw;
	}

	public int getSecondDeposit() {
		return getFirstDraw() + secondDeposit;
	}

	public int getTotalAccount() {
		return getSecondDeposit() - secondDraw;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void setFirstDeposit(int firstDeposit) {
		this.firstDeposit = firstDeposit;
	}

	public void setFirstDraw(int firstDraw) {
		this.firstDraw = firstDraw;
	}

	public void setSecondDeposit(int secondDeposit) {
		this.secondDeposit = secondDeposit;
	}

	public void setSecondDraw(int secondDraw) {
		this.secondDraw = secondDraw;
	}

}
