package org.campus02.zinsen.app;

import org.campus02.zinsen.biz.Konto;

public class ZinsApp
{
	public static void main(String[] args)
	{
		Konto z = new Konto(10000);

		System.out.println(z.getZinsen(2, 365));
	}

}
