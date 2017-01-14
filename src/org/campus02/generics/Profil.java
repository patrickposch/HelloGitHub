package org.campus02.generics;

import java.util.Date;

public class Profil
{
	private String vorname;
	private String nachname;
	private String email;
	private MayBe<Integer> alter;
	private MayBe<String> pw;
	private MayBe<Date> gebDat;

	public Profil(String vorname, String nachname, String email, MayBe<Integer> alter, MayBe<String> pw,
			MayBe<Date> gebDat)
	{
		super();
		this.vorname = vorname;
		this.nachname = nachname;
		this.email = email;
		this.alter = alter;
		this.pw = pw;
		this.gebDat = gebDat;
	}

	public void printProfile()
	{
		System.out.println(vorname + " " + nachname);
		System.out.println(email);
		System.out.print("Alter: ");
		alter.showValue();
		System.out.print("Passwort: ");
		pw.showValue();
		gebDat.showValue();
	}

	public String getVorname()
	{
		return vorname;
	}

	public void setVorname(String vorname)
	{
		this.vorname = vorname;
	}

	public String getNachname()
	{
		return nachname;
	}

	public void setNachname(String nachname)
	{
		this.nachname = nachname;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

}
