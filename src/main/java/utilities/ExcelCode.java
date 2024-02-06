package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode {
	public static FileInputStream f;
	public static XSSFWorkbook wb;
	public static XSSFSheet sh;

	public static String readStringData(int i, int j) throws IOException {
		f = new FileInputStream(System.getProperty("user.dir") + "//src//main//resources//Excelread.xlsx");
		wb = new XSSFWorkbook(f);
		sh = wb.getSheet("Sheet1");
		Row r = sh.getRow(i);
		Cell c = r.getCell(j);
		return c.getStringCellValue();
	}
	/*
	 * public static double readNumericData(int i,int j) throws IOException{ f= new
	 * FileInputStream(null); wb=new XSSFWorkbook(f); sh= wb.getSheet("new Sheet");
	 * Row r = sh.getRow(i); Cell c = r.getCell(j); return c.getNumericCellValue();
	 */

}
