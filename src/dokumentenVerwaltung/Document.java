package dokumentenVerwaltung;

public class Document
{
	protected String fileName;

	public Document(String fileName)
	{
		this.fileName = fileName;
	}

	public void printDocument()
	{
		System.out.println("Generic Document: " + fileName);
		System.out.println();
	}
}
