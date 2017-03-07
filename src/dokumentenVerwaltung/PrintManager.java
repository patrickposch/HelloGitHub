package dokumentenVerwaltung;

import java.util.ArrayList;

public class PrintManager
{
	private ArrayList<Document> list = new ArrayList<Document>();

	public PrintManager(ArrayList<Document> list)
	{
		this.list = list;
	}

	public void addDocument(Document d)
	{
		list.add(d);
	}

	public void printAll()
	{
		for (Document d : list)
			d.printDocument();
	}

	public Document findDocument(String fileName)
	{
		for (Document d : list)
		{
			if (d.fileName.equals(fileName))
				return d;

		}
		return null;
	}
}
