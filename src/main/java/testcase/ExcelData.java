package testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelData {
	
	
	@Test
	
	public String[][] readExcel() throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook("./Book1.xlsx");
		XSSFSheet sheet = wb.getSheet("Sheet1");
		int rowno = sheet.getLastRowNum();   //2
		int columnno = sheet.getRow(0).getLastCellNum();//2
		String data[][]=new String[rowno][columnno];
		for(int i =1;i<=rowno;i++){
			for(int j=0;j<columnno;j++){
				String value = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(value);
				data[i-1][j]=value;
				
				}
			System.out.println();
			
			}
		wb.close();
		return data;
	
}
	
}
