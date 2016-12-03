
public class Bank
{

	public static void main(String[] args)
	{
		Gehaltskonto k1 = new Gehaltskonto("Patrick", "1234", "BANK1");
		Gehaltskonto k2 = new Gehaltskonto("Patty", "1359", "BANK2");
		Gehaltskonto k3 = new Gehaltskonto("Rick", "1497", "BANK3");

		Gehaltskonto[] konten = { k1, k2, k3 };
		k1.aufbuchen(10);
		k2.aufbuchen(20);
		k3.aufbuchen(30);

		for (Gehaltskonto i : konten)
		{
			System.out.println(i.getKontostand());
		}

	}

}
