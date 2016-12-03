package Bruch;

public class BruchDemo
{

	public static void main(String[] args)
	{
		Bruch b = new Bruch(1, 2);
		System.out.println("Anz Obj.:" + b.anzahlObjekte);

		Bruch b2 = new Bruch(1, 4);
		System.out.println("Anz Obj.:" + b2.anzahlObjekte);

		Bruch b3 = b.multiplicate(b, b2);
		b3.print();

		System.out.println(b3.toDecimal());

	}

}
