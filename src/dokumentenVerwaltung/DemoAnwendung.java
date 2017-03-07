package dokumentenVerwaltung;

import java.util.ArrayList;

public class DemoAnwendung
{

	public static void main(String[] args)
	{
		ArrayList<String> lines = new ArrayList<String>();
		lines.add("Entry 1");
		lines.add("Entry 2");
		lines.add("Entry 3");

		Document d = new Document("Dokument1");
		TextDocument td = new TextDocument("TxtDoc1", "Bla um et ipsum bla us");
		imageDocument id = new imageDocument("Imagedoc", 800, 600, "green");
		CsvDocument cd = new CsvDocument("CsvDoc", lines);

		// Document cd2 = new CsvDocument("CsvDoc2", lines);

		/*
		 * d.printDocument(); td.printDocument(); id.printDocument();
		 * cd.addLine("Special Add 4"); cd.printDocument();
		 */

		ArrayList<Document> docs = new ArrayList<Document>();
		docs.add(d);
		docs.add(td);
		docs.add(id);
		docs.add(cd);
		PrintManager pm = new PrintManager(docs);

		Document d7 = pm.findDocument("Dokument3");

		pm.printAll();

		// d7.printDocument();

	}

}
