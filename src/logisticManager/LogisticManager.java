package logisticManager;

import java.util.ArrayList;

public class LogisticManager
{
	ArrayList<Moveable> list = new ArrayList<>();

	public void add(Moveable m)
	{
		list.add(m);
	}

	public void moveAll(String destination)
	{
		for (Moveable m : list)
		{
			m.move(destination);
		}
	}
}
