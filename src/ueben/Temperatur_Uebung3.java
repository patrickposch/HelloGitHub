package ueben;

public class Temperatur_Uebung3
{

	public static void main(String[] args)
	{
		double fahrenheit = celsius2Fahrenheit(30);
		System.out.println(fahrenheit);

		String test1 = "bla";
		String test2 = "bla2";

		boolean sameObject = test1.equals(test2);
		// System.out.println(sameObject);

		boolean a = true;
		boolean b = false;

	}

	public static double celsius2Fahrenheit(double celsius)
	{
		return 9 / 5 * celsius + 32;

	}

}
