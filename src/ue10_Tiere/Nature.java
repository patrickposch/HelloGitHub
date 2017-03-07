package ue10_Tiere;

import java.util.ArrayList;
import java.util.HashMap;

public class Nature
{
	ArrayList<Animal> list = new ArrayList<Animal>();

	public Nature()
	{
		// TODO Auto-generated constructor stub
	}

	public void addAnimal(Animal a)
	{
		list.add(a);
	}

	public int countColor(String color)
	{
		int counter = 0;

		for (Animal a : list)
		{
			if (color.equals(a.getColor()))
				counter++;
		}

		return counter;
	}

	public HashMap<String, Integer> getCountByColor()
	{
		HashMap<String, Integer> hash = new HashMap<String, Integer>();

		for (Animal a : list)
		{
			if (!hash.containsKey(a.getColor()))
				hash.put(a.getColor(), 1);
			else
				hash.put(a.getColor(), hash.get(a.getColor()) + 1);
		}

		return hash;
	}

}
