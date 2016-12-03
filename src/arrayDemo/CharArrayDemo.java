package arrayDemo;

public class CharArrayDemo
{
	public static void main(String[] Args)
	{
		char[] c = { 'B', 'L', 'U', 'B', 'B' };

		try
		{
			CharArray ch = new CharArray(c);
			ch.print();
			System.out.println("");
			ch.print(1, 3);

		} catch (Exception e)
		{
			System.out.println("");
			System.out.println("Fehler bei der Array Länge!!");
		}

	}
}
