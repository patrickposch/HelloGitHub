package ue10_Tiere;

public abstract class Animal
{
	private String color;
	private int countEyes;

	public Animal(String color, int countEyes)
	{
		this.color = color;
		this.countEyes = countEyes;
	}

	public abstract void walk();

	public abstract void makeNoise();

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	public int getCountEyes()
	{
		return countEyes;
	}

	public void setCountEyes(int countEyes)
	{
		this.countEyes = countEyes;
	}
}
