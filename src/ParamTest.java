
public class ParamTest
{

	public static void main(String[] args)
	{
		String result = printRectangleArea("Das Rechteck hat eine Fläche von:", 4, 5);
		System.out.println(result);

	}

	public static String printRectangleArea(String text, int a, int b)
	{
		int area = a * b;
		return text + " " + area;
	}

}
