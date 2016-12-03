
public class PersonenHauptKlasse
{

	public static void main(String[] args)
	{
		Person p = new Person();
		p.vorname = "Joe";
		p.nachname = "Hammer";
		p.alter = 37;

		System.out.println(p.vorname + " " + p.nachname + ", " + p.alter + " Jahre");

	}

}
