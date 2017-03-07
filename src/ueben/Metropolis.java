package ueben;

public class Metropolis
{
	public static void main(String[] args)
	{
		boolean a = 10 > 7;

		System.out.println(a);

	}

	public static boolean isMetropolis(boolean isCapital, int inhabitants, double taxPerPersonAndMonth)
	{
		return ((isCapital && (inhabitants > 100000))
				|| ((inhabitants > 200000) && (taxPerPersonAndMonth * inhabitants > 720000000)));
	}
}
