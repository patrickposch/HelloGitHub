package hasenVermehrung;

public class Hase
{
	protected String name;

	public Hase(String name)
	{
		this.name = name;
	}

	public void sleep()
	{
		System.out.println(name + " schläft.");
	}

	public void eat()
	{
		System.out.println(name + " frisst.");
	}

	public void jump()
	{
		System.out.println(name + " springt.");
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}
