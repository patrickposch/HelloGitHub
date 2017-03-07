package ue13_Figures;

public class Rectangle extends Figure
{
	public Rectangle(double length, double width)
	{
		super();
		this.length = length;
		this.width = width;
	}

	private double length;
	private double width;

	@Override
	public double getPerimeter()
	{
		return (2 * length) + (2 * width);
	}

	@Override
	public double getArea()
	{
		return length * width;
	}

	public double getLength()
	{
		return length;
	}

	public void setLength(double length)
	{
		this.length = length;
	}

	public double getWidth()
	{
		return width;
	}

	public void setWidth(double width)
	{
		this.width = width;
	}

}
