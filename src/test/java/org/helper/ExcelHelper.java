
package org.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHelper extends LibGlobal {

	public static String readDataFromExcel(String sheetname, int rowno, int cellno) throws IOException {
		File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Framework11\\Data Maintainances\\Book1.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook b = new XSSFWorkbook(fin);
		Sheet sheet = b.getSheet(sheetname);
		Row r = sheet.getRow(rowno);
		Cell c = r.getCell(cellno);
		int type = c.getCellType();

		String input = "";

		if (type == 1) {
			input = c.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(c)) {
			Date da = c.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("dd/MMM/YYYY");
			input = sim.format(da);
		} else {
			double d = c.getNumericCellValue();
			long l = (long) d;
			input = String.valueOf(l);

		}
		return input;

	}

	public static void AllRowandAllData(String name) throws IOException {
		File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Framework11\\Data Maintainances\\Book1.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook b = new XSSFWorkbook(fin);
		Sheet sheet = b.getSheet(name);
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row r = sheet.getRow(i);

//			int count = 0;
//			
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
//				Cell c = r.getCell(j);
//				count++;
//				System.out.println(count);
			}
		}

	}

	public static void writeNewExcelSheet(String input, String Name, int rowno, int rown1, int cellno, int celln1,
			int celln2, int celln3, String value, String value1, String value2, String value3) throws IOException {
		File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Framework11\\Data Maintainances\\" + input + ".xlsx");
		Workbook bk = new XSSFWorkbook();
		Sheet sh1 = bk.createSheet(Name);
		Row r0 = sh1.createRow(rowno);
		Row r2 = sh1.createRow(rown1);
		Cell c01 = r0.createCell(cellno);
		Cell c03 = r0.createCell(celln1);
		Cell c12 = r2.createCell(celln2);
		Cell c44 = r2.createCell(celln3);
		c01.setCellValue(value);
		c03.setCellValue(value1);
		
		c12.setCellValue(value2);
		c44.setCellValue(value3);
		FileOutputStream fout = new FileOutputStream(f);
		bk.write(fout);
	}

	public static void Exsistingsheet(int rowno, int cellno, int cellno1, String value, String value1)
			throws IOException {
		File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Framework11\\Data Maintainances\\Book1.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook bk = new XSSFWorkbook(fin);
		Sheet sh = bk.getSheet("Details");
		Row r = sh.getRow(2);
		Row r9 = sh.createRow(rowno);
		Cell c26 = r.createCell(cellno);
		Cell c98 = r9.createCell(cellno1);
		c26.setCellValue(value);
		c98.setCellValue(value1);
		FileOutputStream fout = new FileOutputStream(f);
		bk.write(fout);
	}

	public static void fileupdating(int rowno, int cellno, String value) throws IOException {
		File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Framework11\\Data Maintainances\\Book1.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook bk = new XSSFWorkbook(fin);
		Sheet sh = bk.getSheet("Details");
		Row r1 = sh.getRow(rowno);
		Cell c39 = r1.getCell(cellno);
		String input = c39.getStringCellValue();
		c39.setCellValue(value);
		FileOutputStream fout = new FileOutputStream(f);
		bk.write(fout);

	}

}
