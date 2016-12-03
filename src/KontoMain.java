
public class KontoMain
{

	public static void main(String[] args)
	{
		Konto k1 = new Konto();
		k1.setInhaber("Patrick");
		k1.aufbuchen(1337);
		k1.abbuchen(1338);

	}

}
