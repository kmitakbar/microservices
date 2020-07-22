package pdfgen;

import java.io.FileOutputStream;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.pdf.PdfWriter;

public class PdfGenerator{

	public static String generatePdfDocumnet(Map<String, Object> map) {
		System.out.println("map is:::"+map.toString());
		Document document = new Document();
		try {
		PdfWriter.getInstance(document, new FileOutputStream("E:\\iTextHelloWorld.pdf"));
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		JsonParser jp = new JsonParser();
		JsonElement je = jp.parse(map.toString());
		String prettyJsonString = gson.toJson(je); 
		System.out.println("json string::"+prettyJsonString);
		document.open();
		Font font = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);
		Chunk chunk = new Chunk(prettyJsonString,font);
		 
		document.add(chunk);
		document.close();
		}
		catch (Exception  e) {
			e.printStackTrace();
			return "documnet geeration failed!";
		}
		return "documnet generated!";
	}
}
