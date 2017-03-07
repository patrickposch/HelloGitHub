package dokumentenVerwaltung;

public class TextDocument extends Document
{
	private String content;

	public TextDocument(String fileName, String content)
	{
		super(fileName);
		this.content = content;
	}

	public void printDocument()
	{
		System.out.println("TextDocument: " + fileName + " => " + content);
		System.out.println();
	}
}
