package ue10_Tiere;

public class Cat extends Animal
{
	private String name;

	public Cat(String color, int countEyes, String name)
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
		System.out.println("Katze läuft.");
	}

	public void makeNoise()
	{
		System.out.println("Miaaaaauuuu!");
	}

}
