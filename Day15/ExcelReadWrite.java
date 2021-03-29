package day15;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.*;

public class ExcelReadWrite {
	public static void main(String[] args) throws Exception {
		
		String path  = "D:\\workspace\\java-ecllipse\\basicFromDay4\\testFile.xlsx";
		FileInputStream fis = new FileInputStream(path);
		
		//workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		//sheets
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		//reading -- for loop
		int numOfRows = sheet.getLastRowNum();
		int numOfCol = sheet.getRow(1).getLastCellNum();
		
		for(int r = 0; r < numOfRows; r++)
		{
			XSSFRow row = sheet.getRow(r);
			for(int c = 0; c < numOfCol; c++)
			{
				XSSFCell cell = row.getCell(c);
				switch(cell.getCellType())
				{
					case STRING:
					{
						System.out.println(cell.getStringCellValue());
						break;
					}
					case NUMERIC:
					{
						System.out.println(cell.getNumericCellValue());
						break;
					}
				}
			}
		}
	}
}
