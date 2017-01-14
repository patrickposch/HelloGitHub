
public class Palindrome
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String pal = "re ntnER!!";
		System.out.println(isPali(pal));

	}

	public static boolean isPali(String palu)
	{
		int l = palu.length();
		String pal = palu.toLowerCase();

		if (l <= 1)
			return true;

		char first = pal.charAt(0);
		char last = pal.charAt(l - 1);

		if (!Character.isLetter(first))
			return isPali(pal.substring(1));

		if (!Character.isLetter(last))
			return isPali(pal.substring(0, l - 1));

		if (first == last)
			return isPali(pal.substring(1, l - 1));

		return false;

	}

}
