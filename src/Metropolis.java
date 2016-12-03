
public class Metropolis
{

	public static void main(String[] args)
	{
		boolean isCapital = false;
		int inhabitants = 201000;
		double taxPerPersonAndMonth = 10;

		System.out.println(isMetropolis(isCapital, inhabitants, taxPerPersonAndMonth));
		System.out.println(isMetropolis2(isCapital, inhabitants, taxPerPersonAndMonth));

	}

	public static boolean isMetropolis(boolean isCapital, int inhabitants, double taxPerPersonAndMonth)
	{
		if (isCapital == true && inhabitants > 100000)
			return true;
		else if (inhabitants > 200000 && (taxPerPersonAndMonth * inhabitants * 12) > 720000000)
			return true;

		return false;
	}

	public static boolean isMetropolis2(boolean isCapital, int inhabitants, double taxPerPersonAndMonth)
	{
		boolean result = (isCapital && (inhabitants > 100000))
				|| (inhabitants > 200000 && ((taxPerPersonAndMonth * inhabitants * 12) > 720000000));
		return result;
	}

}
