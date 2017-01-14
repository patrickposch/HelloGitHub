
public class DemoRec
{

	public static void main(String[] args)
	{
		// System.out.println(recursiveSum(5));
		System.out.println(fibonaccicate(12));

	}

	public static int recursiveSum(int n)
	{
		if (n == 1)
		{
			return 1;
		}

		return recursiveSum(n - 1) * n;

	}

	public static int fibonaccicate(int n)
	{
		if (n <= 2)
			return 1;

		return fibonaccicate(n - 1) + fibonaccicate(n - 2);

	}

}
