package ueben;

public class Turmrechner
{

	public static void main(String[] args)
	{
		int zahl = 2;
		int multi;
		int divi;

		for (multi = 2; multi < 10; multi++)
		{
			System.out.println(zahl + " x " + multi);
			zahl *= multi;
		}

		for (divi = 2; divi < 10; divi++)
		{
			System.out.println(zahl + " / " + divi);
			zahl /= divi;

			if (divi == 9)
			{
				System.out.println(zahl);
			}
		}

	}

}
