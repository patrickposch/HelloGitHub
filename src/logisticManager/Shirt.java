package logisticManager;

public class Shirt extends Product implements Moveable
{
	private String brand;
	private int size;
	private String color;

	public Shirt(int productCode)
	{
		super(productCode);
		// TODO Auto-generated constructor stub
	}

	public String getBrand()
	{
		return brand;
	}

	public void setBrand(String brand)
	{
		this.brand = brand;
	}

	public int getSize()
	{
		return size;
	}

	public void setSize(int size)
	{
		this.size = size;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	@Override
	public void move(String destination)
	{
		System.out.println("Blue Shirt will be moved to " + destination);

	}

}
