package arrayDemo;

public class CharArray
{
	private char[] c;

	public CharArray(char[] c)
	{
		this.c = c;
	}

	public void print(int start, int end) throws Exception
	{
		for (int i = start; i <= end; i++)
		{
			System.out.print(c[i]);
		}
	}

	public void print()
	{
		System.out.println(c);
	}

	public int length()
	{
		return c.length;
	}

	public char[] getC()
	{
		return c;
	}

	public void setC(char[] c)
	{
		this.c = c;
	}
}
