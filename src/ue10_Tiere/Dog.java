package ue10_Tiere;

public class Dog extends Animal
{

	private String name;

	public Dog(String color, int countEyes, String name)
	{
		super(color, countEyes);
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void walk()
	{
		System.out.println("Hund läuft.");
	}

	public void makeNoise()
	{
		System.out.println("Wufff Wufff !");
	}

}
