package org.campus02.generics;

public class MayBeInt
{
	private int status;
	private int value;

	public MayBeInt(int status, int value)
	{
		super();
		this.status = status;
		this.value = value;
	}

	public void showValue()
	{
		switch (status)
		{
		case 1:
			System.out.println("Zugriff gestattet: " + value);
			break;
		case 2:
			System.out.println("Zugriff verweigert");
			break;
		case 3:
			System.out.println("Nicht erfasst");
			break;

		default:
			System.out.println("Ungültiger Status!");
			break;
		}
	}
}
