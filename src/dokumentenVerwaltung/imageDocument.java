package dokumentenVerwaltung;

public class imageDocument extends Document
{
	private int sizeX;
	private int sizeY;
	private String colour;

	public imageDocument(String fileName, int sizeX, int sizeY, String colour)
	{
		super(fileName);
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		this.colour = colour;
	}

	public void printDocument()
	{
		System.out.println("ImageDocument: " + fileName + " Size: " + sizeX + " x " + sizeY + " => Color: " + colour);
		System.out.println();
	}

}
