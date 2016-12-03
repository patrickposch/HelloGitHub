
public class Gehaltskonto
{

	private String kontoinhaber;
	private String iban;
	private String bic;
	private double kontostand;

	public Gehaltskonto(String kontoinhaber, String iban, String bic)
	{
		this.kontoinhaber = kontoinhaber;
		this.iban = iban;
		this.bic = bic;
		kontostand = 0.0;
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

	public double getKontostand()
	{
		return kontostand;
	}

	/*
	 * public String getKontoinhaber() { return kontoinhaber; } public void
	 * setKontoinhaber(String kontoinhaber) { this.kontoinhaber = kontoinhaber;
	 * } public String getIban() { return iban; } public void setIban(String
	 * iban) { this.iban = iban; } public String getBic() { return bic; } public
	 * void setBic(String bic) { this.bic = bic; } public void
	 * setKontostand(double kontostand) { this.kontostand = kontostand; }
	 */

}
