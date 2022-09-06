package javaExample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;


public class FileReadingExp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

//		FileReader();
		
		DocFileReader();
		
//		CSVFileReder();
		
//		XlSXFileReader();
	}

	private static void DocFileReader() throws FileNotFoundException, IOException {
		
		File file = new File("C:\\eclipse_workspace\\ContentFile\\HWPFDocument.doc");
		HWPFDocument document = new HWPFDocument(new FileInputStream(file));
		
//		document.write(arg0);
//		WordExtractor extractor = new WordExtractor(document);
//		System.out.println(extractor.getText());
		
		System.out.println(document.getText());
	}

	private static void XlSXFileReader() throws FileNotFoundException, IOException {
		
		String xlsxFile = "C:\\eclipse_workspace\\Interview\\ContentFile\\XlsxFileReader.xlsx";
		XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(xlsxFile));
		XSSFSheet sheet = workbook.getSheetAt(0);
		
	    Iterator<Row> row = sheet.iterator();
	    while(row.hasNext())
	    {
	    	Row r = row.next();
	    	Iterator<Cell> cell = r.iterator();
	    	while(cell.hasNext())
	    	{
	    		Cell c= cell.next();
	    		switch(c.getCellType())
	    		{
	    		case Cell.CELL_TYPE_STRING:
	    			System.out.print(c.getStringCellValue());
	    		case Cell.CELL_TYPE_NUMERIC:
	    			System.out.print(c.getStringCellValue());
	    		}
	    	}
	    	System.out.println();
	    }
	    
//	    workbook.write(arg0);
	}

	private static void CSVFileReder() throws Exception {
		String csvFile = "C:\\eclipse_workspace\\Interview\\ContentFile\\CSVReader.csv";
		
		CSVReader reader = new CSVReader(new FileReader(csvFile));
		CSVReader Csvreader = new CSVReader(new FileReader(csvFile));;
		String[] str;
		while((str=reader.readNext()) != null)
		{
			for(String s:str)
			{
				System.out.print(s+"\t");
			}
			System.out.println();
		}
		
		String str2[];
		CSVWriter writer = new CSVWriter(new FileWriter("C:\\eclipse_workspace\\Interview\\ContentFile\\CSVReader_test.csv"));
		while((str2=Csvreader.readNext()) != null)
		{
			System.out.println(str2[0]);
			writer.writeNext(str2);
		}
	}

	private static void FileReader() throws Exception {
		String sCurrentLine;
		File fl = new File("D:\\win10.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(fl));
		List<String> lines = new ArrayList<String>();
		while ((sCurrentLine = br.readLine()) != null) {
			lines.add(sCurrentLine);
		}
		
		System.out.println(lines.size());
		br.close();
		
		
		File fl1 = new File("D:\\win10 - Copy.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter(fl1));
		
		for(String s : lines)
		{
			bw.write(s+"\n\n");
		}
		bw.flush();
		bw.close();
		
	}

}
