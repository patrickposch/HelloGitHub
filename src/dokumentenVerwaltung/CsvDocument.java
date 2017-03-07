package dokumentenVerwaltung;

import java.util.ArrayList;

public class CsvDocument extends Document
{
	private ArrayList<String> lines;

	public CsvDocument(String fileName, ArrayList<String> lines)
	{
		super(fileName);
		this.lines = lines;
	}

	public void addLine(String line)
	{
		lines.add(line);
	}

	public void printDocument()
	{
		System.out.println("CsvDocument: " + fileName);
		System.out.println("- Content -");
		for (String line : lines)
			System.out.println(line);
		System.out.println();
	}

}
