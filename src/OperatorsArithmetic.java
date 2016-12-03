
public class OperatorsArithmetic
{

	public static void main(String[] args)
	{
		double fahrenheit = 78.0;

		System.out.println("fahrenheit: " + celsius2Fahrenheit(26));
		System.out.println("celsius: " + fahrenheit2Celsius(fahrenheit));

	}

	public static double celsius2Fahrenheit(double celsius)
	{
		double fahrenheit = 9.0 / 5.0 * celsius + 32;
		return fahrenheit;

	}

	public static double fahrenheit2Celsius(double fahrenheit)
	{
		double celsius = (fahrenheit - 32) / (9.0 / 5);
		return celsius;
	}

}
