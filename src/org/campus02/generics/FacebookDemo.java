package org.campus02.generics;

import java.util.Date;

public class FacebookDemo
{
	public static void main(String[] args)
	{
		Date g = new Date();
		Profil p = new Profil("Farid", "A.", "faa@noob.com", new MayBe<Integer>(1, 25), new MayBe<String>(1, "pw1234"),
				new MayBe<Date>(1, g));
		// Profil p1 = new Profil("Patrick", "P.", "papo@glorious.com", new
		// MayBeInt(1, 25));

		p.printProfile();
		// p1.printProfile();
	}
}
