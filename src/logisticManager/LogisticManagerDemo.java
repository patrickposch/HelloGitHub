package logisticManager;

public class LogisticManagerDemo
{

	public static void main(String[] args)
	{
		Car c = new Car(3);
		Shirt s = new Shirt(7);

		LogisticManager lm = new LogisticManager();

		lm.add(c);
		lm.add(s);

		lm.moveAll("Test");

	}

}
