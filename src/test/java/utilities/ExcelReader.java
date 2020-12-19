package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	public String excelPath = null;
	public FileInputStream fis = null;
	public FileOutputStream fos = null;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
		public ExcelReader(String excelPath) throws IOException,FileNotFoundException {
			
			File src = new File(excelPath);
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
			sheet = wb.getSheetAt(0);
		}
		
		public int getRowCount(int sheetIndex)
		{
			int row = wb.getSheetAt(sheetIndex).getLastRowNum();
			row = row+1;
			return row;
		}
		
		public int getcellCount(int row) {
			int columns = wb.getSheetAt(0).getRow(row).getLastCellNum();
			return columns;
		}
		
		public String getData(int Sheetnumber, int row, int col)
		{
			sheet = wb.getSheetAt(Sheetnumber);
			String data = sheet.getRow(row).getCell(col).getStringCellValue();
			return data;
		}
	}
