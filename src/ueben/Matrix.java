package ueben;

public class Matrix
{

	public static void main(String[] args)
	{
		double[][] test = generateIdentityMatrix(5);
		// System.out.println(test.length);

		double[][] test2 = new double[7][3];
		// System.out.println(test2[0].length);

		printMatrix(test2);

	}

	public static double[][] generateIdentityMatrix(int size)
	{
		double[][] matrix = new double[size][size];

		for (int i = 0; i < size; i++)
		{
			for (int j = 0; j < size; j++)
			{
				if (i == j)
				{
					matrix[i][j] = 1.0;
					// System.out.print("1.0 ");
				} else
				{
					matrix[i][j] = 0.0;
					// System.out.print("0.0 ");
				}
			}
			// System.out.println();
		}

		return matrix;

	}

	public static void printMatrix(double[][] matrix)
	{
		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; j < matrix[i].length; j++)
			{
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
