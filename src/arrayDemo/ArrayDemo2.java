package arrayDemo;

public class ArrayDemo2
{

	public static void main(String[] args)
	{
		String[] arr1 = { "Jänner", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober",
				"November", "Dezember" };

		for (int i = 0; i < arr1.length; i++)
		{
			System.out.println(arr1[i] + " [" + (i + 1) + "]");
		}

		System.out.println("");
		System.out.println(" --- Beispiel Einheitsmatrix --- ");
		System.out.println("");

		double[][] ausgabe = generateIdentitiyMatrix(7);
	}

	public static double[][] generateIdentitiyMatrix(int size)
	{
		double[][] dd = new double[size][size];

		for (int i = 0; i < size; i++)
		{
			for (int j = 0; j < size; j++)
			{
				if (i == j)
				{
					dd[i][j] = 1.0;
					System.out.print("1.0 ");
				} else
				{
					dd[i][j] = 0.0;
					System.out.print("0.0 ");
				}
			}
			System.out.print("\n");
		}

		return dd;
	}

}
