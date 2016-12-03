
public class Konto
{
	private String kontoinhaber;
	private double kontostand;

	public void setInhaber(String kontoinhaber)
	{
		this.kontoinhaber = kontoinhaber;
		kontostand = 0;
	}

	public void aufbuchen(double betrag)
	{
		kontostand += betrag;
		System.out.println("neuer Kontostand: " + kontostand);
	}

	public void abbuchen(double betrag)
	{
		if (kontostand >= betrag)
		{
			kontostand -= betrag;
			System.out.println("neuer Kontostand: " + kontostand);
		}

		else
			System.out.println("Kontostand darf nicht unterschritten werden.");
	}
}
