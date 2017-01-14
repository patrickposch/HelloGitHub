
public class wordUpperCase
{
	public static void main(String[] args)
	{
		String test = "Ich teste meinen String!";
		System.out.println(convert(test));
	}

	private static String convert(String s)
	{
		String ret = "";
		char c;

		for (int i = 0; i < s.length(); i++)
		{
			c = s.charAt(i);

			if (i == 0 || s.charAt(i - 1) == ' ')
			{
				c = Character.toUpperCase(c);
			}
			ret += c;

		}

		return ret;
	}

}
