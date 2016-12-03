package arrayDemo;

public class ArrayDemo1
{

	public static void main(String[] args)
	{
		int[] array1 = new int[3];
		array1[0] = 3;
		array1[1] = 4;
		array1[2] = 5;

		int[] array2 = { 7, 1, 3 };

		System.out.println(
				"+ " + (array1[0] + array2[0]) + " " + (array1[1] + array2[1]) + " " + (array1[2] + array2[2]));
		System.out.println(
				"* " + (array1[0] * array2[0]) + " " + (array1[1] * array2[1]) + " " + (array1[2] * array2[2]));

		System.out.println("Länge von Array1: " + array1.length);
		System.out.println("Länge von Array2: " + array2.length);

	}

}
