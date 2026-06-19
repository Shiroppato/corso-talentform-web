package it.oop;

public class IntroImplementInterface extends IntroClassAbstract implements IntroInterface {

	private int tariffaGiornaliera;
	private int giornateMockup;
	private int giornateReleaseApp;
	private int giornateResponsiveApp;
	private int giornateTestingApp;

	public IntroImplementInterface(int tariffaGiornaliera, int giornateMockup, int giornateReleaseApp,
			int giornateResponsiveApp, int giornateTestingApp) {
		super();
		this.tariffaGiornaliera = tariffaGiornaliera;
		this.giornateMockup = giornateMockup;
		this.giornateReleaseApp = giornateReleaseApp;
		this.giornateResponsiveApp = giornateResponsiveApp;
		this.giornateTestingApp = giornateTestingApp;
	}

	@Override
	public int getReleaseApp() {

		return tariffaGiornaliera * giornateReleaseApp;
	}

	@Override
	public int getResponsiveApp() {

		return tariffaGiornaliera * giornateResponsiveApp;
	}

	@Override
	int getMockup() {

		return tariffaGiornaliera * giornateMockup;
	}

	@Override
	int getTestingApp() {

		return tariffaGiornaliera * giornateTestingApp;
	}

	int getPreventivoApp() {

		return getReleaseApp() + getResponsiveApp() + getTestingApp() + getMockup();
	}

	public static void main(String[] args) {

		IntroImplementInterface preventivo = new IntroImplementInterface(250, 4, 3, 4, 2);

		System.out.println("TOTALE PREVENTIVO APP :" + preventivo.getPreventivoApp() + " €");

	}

}
