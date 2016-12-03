package Bruch;

public class Bruch
{
	private int nenner;
	private int zaehler;

	public static int anzahlObjekte;

	public Bruch(int zaehler, int nenner)
	{
		this.nenner = nenner;
		this.zaehler = zaehler;
		anzahlObjekte++;
	}

	public Bruch multiplicate(Bruch b2)
	{
		return new Bruch(zaehler * b2.getZaehler(), nenner * b2.getNenner());
	}

	public Bruch multiplicate(Bruch b2, Bruch b3)
	{
		return multiplicate(b2.multiplicate(b3));
	}

	public double toDecimal()
	{
		return (double) zaehler / (double) nenner;
	}

	public void print()
	{
		System.out.println(zaehler + " / " + nenner);
	}

	public int getNenner()
	{
		return nenner;
	}

	public void setNenner(int nenner)
	{
		this.nenner = nenner;
	}

	public int getZaehler()
	{
		return zaehler;
	}

	public void setZaehler(int zaehler)
	{
		this.zaehler = zaehler;
	}

}
