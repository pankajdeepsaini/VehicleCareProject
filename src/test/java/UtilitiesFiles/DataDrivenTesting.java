package UtilitiesFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenTesting {

	public static XSSFWorkbook wb;
	public static XSSFSheet sh;
	public static XSSFRow ro;
	public static XSSFCell cell;
	public static FileInputStream fis;
	
	
	public static int getrow(String filename, String Sheet) throws Exception {
		
		fis = new FileInputStream(filename);
		wb = new XSSFWorkbook(fis);
		sh = wb.getSheet(Sheet);
	  int  ro = sh.getLastRowNum()+1;
	  return ro;
	
	}

	public static int getcol(String filename, String Sheet) throws Exception {
		fis = new FileInputStream(filename);
		wb = new XSSFWorkbook(fis);
		sh = wb.getSheet(Sheet);
		int col = sh.getRow(0).getLastCellNum();
		return col;
	}
	
	public static Object getcellvalue(String filename, String Sheet, int r , int j) throws Exception {
		
		fis = new FileInputStream(filename);
		wb = new XSSFWorkbook(fis);
		sh = wb.getSheet(Sheet);
	 	cell = wb.getSheet(Sheet).getRow(r).getCell(j);
		return cell.getStringCellValue();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
