package logisticManager;

public class Car extends Product implements Moveable
{
	private String type;
	private String color;
	private double weight;

	public Car(int productCode)
	{
		super(productCode);
		// TODO Auto-generated constructor stub
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	public double getWeight()
	{
		return weight;
	}

	public void setWeight(double weight)
	{
		this.weight = weight;
	}

	@Override
	public void move(String destination)
	{
		System.out.println("Blue VW Golf will be moved to " + destination);

	}

}
