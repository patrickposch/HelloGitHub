package org.campus02.zinsen.biz;

public class Konto
{
	private double zinsen;
	private double kapital;

	public Konto(double kapital)
	{
		super();
		this.kapital = kapital;

	}

	public double getZinsen(double zinssatz, int tage)
	{
		zinsen = kapital * tage * zinssatz / 36000;
		return zinsen;
	}

	public double getKapital()
	{
		return kapital;
	}

	public void setKapital(double kapital)
	{
		this.kapital = kapital;
	}

}
