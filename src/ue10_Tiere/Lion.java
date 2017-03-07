package ue10_Tiere;

public class Lion extends Animal
{

	public Lion(String color, int countEyes)
	{
		super(color, countEyes);
	}

	public void walk()
	{
		System.out.println("Katze läuft.");
	}

	public void roar()
	{
		System.out.println("Hear my roar!");
	}

	public void makeNoise()
	{
		System.out.println("Löwengeräusch!");
	}

}
