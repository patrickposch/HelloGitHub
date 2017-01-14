package org.campus02.generics;

public class MayBe<T>
{
	private T data;
	private int status;

	public MayBe(int status, T data)
	{
		this.status = status;
		this.data = data;
	}

	public void showValue()
	{
		switch (status)
		{
		case 1:
			System.out.println("Zugriff gestattet: " + data);
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
