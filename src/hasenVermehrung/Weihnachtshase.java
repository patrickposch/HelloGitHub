package hasenVermehrung;

public class Weihnachtshase extends Hase
{

	public Weihnachtshase(String name)
	{
		super(name);
	}

	public void geschenke_verteilen()
	{

	}

	public void jump()
	{
		System.out.println(name + " springt mit Geschenken.");
	}

	public void eat()
	{
		System.out.println(name + " isst Kekse.");
	}

	public void sleep()
	{
		System.out.println(name + " schläft, no ho ho ho.");
	}
}
