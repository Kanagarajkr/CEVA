package selenium;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		XSSFWorkbook wb = new XSSFWorkbook("./Book1.xlsx");
		XSSFSheet sheet = wb.getSheet("Sheet1");
		sheet.getRow(1).createCell(2).setCellValue("Kanagaraj");
		FileOutputStream fout = new FileOutputStream("./Book1.xlsx");
		wb.write(fout);
		wb.close();

	}

}
