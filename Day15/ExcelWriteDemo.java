package day15;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteDemo {
	public static void main(String[] args) throws Exception {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Emp data");
		Object arr[][] = {
				{"Emp ID", "Name", "salary"},
				{1, "Yashu", 30000},
				{2, "VK", 40000},
				{3, "AB", 50000}
		};
		for(int i = 0; i < arr.length; i++)
		{
			XSSFRow row = sheet.createRow(i);
			for(int j = 0; j < arr[0].length; j++)
			{
				XSSFCell cell = row.createCell(j);
				Object val = arr[i][j];
				if(val instanceof String)
					cell.setCellValue((String)val);
				else if(val instanceof Integer)
					cell.setCellValue((Integer)val);
			}
		}
		
		FileOutputStream file = new FileOutputStream("empdata.xlsx");
		workbook.write(file);
	}
}
