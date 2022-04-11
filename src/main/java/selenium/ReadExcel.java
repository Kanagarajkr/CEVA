package selenium;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Reader;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		XSSFWorkbook wb = new XSSFWorkbook("./Book1.xlsx");
		
		Reader in = null;
		/*
		 * XSSFSheet sheet = wb.getSheet("Sheet1"); int lastRowNum =
		 * sheet.getLastRowNum(); System.out.println(lastRowNum); short lastCellNum =
		 * sheet.getRow(0).getLastCellNum();
		 * 
		 * for(int i=1;i<=lastRowNum;i++) { for(int j=0;j<lastCellNum;j++) { String
		 * value = sheet.getRow(i).getCell(j).getStringCellValue();
		 * System.out.println(value); } }
		 */
		//XSSFWorkbook wb = new XSSFWorkbook("./Book1.xlsx");
		
		XSSFSheet sheet = wb.getSheet("Sheet1");
		int lastRowNum = sheet.getLastRowNum();
	
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		for (int i = 1; i <=lastRowNum; i++) {
			for(int j=0;j<lastCellNum;j++) {
			
			
			String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
			System.out.println(stringCellValue);
		}
		}
		
	}

}
