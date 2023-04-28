package keyWordDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	
	//generic reusable method

    //generic reusable method to read the data from excel sheet
	public String readExcelData(String excelPath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);//provide the path of file.
		Workbook wb = WorkbookFactory.create(fis);// make the file ready for read
		Sheet sheet = wb.getSheet(sheetName);// get into the sheet
		Row row = sheet.getRow(rowCount);//get the desired row
		Cell cell = row.getCell(cellCount);//get the desired col/cell
		String data = cell.getStringCellValue();// read the data from cell 
		return data;
	}
	
	//To get last row count
		public int rowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
		
		{
			FileInputStream fis = new FileInputStream(excelPath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet(sheetName);
			int rc =sheet.getLastRowNum();
			return rc;
			
		}
		
		//to write data in excel sheet
		public void writeExcelData(String excelPath,String sheetName,int rowCount,int cellCount,String data) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis = new FileInputStream(excelPath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet(sheetName);
			Row row = sheet.getRow(rowCount);
			Cell cell = row.createCell(cellCount);
			cell.setCellValue(data);
			
			FileOutputStream fos = new FileOutputStream(excelPath);
			wb.write(fos);
		}
		
	
		
		//to read data from property file 
		
		
		
			public String readPropertyData(String propPath,String key) throws IOException
			{
				FileInputStream fis = new FileInputStream(propPath);
				Properties prop = new Properties();
				prop.load(fis);
				String value = prop.getProperty(key);
				return value;
			}
			
			
		
		
		
		
}
	