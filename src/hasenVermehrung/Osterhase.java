package hasenVermehrung;

public class Osterhase extends Hase
{

	public Osterhase(String name)
	{
		super(name);
	}

	public void ostereier_verstecken()
	{

	}

	public void jump()
	{
		System.out.println(name + "springt mit Eiern.");
	}

	public void eat()
	{
		System.out.println(name + " isst seine Eier.");
	}

	public void sleep()
	{
		System.out.println(name + " reproduziert Eier im Schlaf.");
	}

}
