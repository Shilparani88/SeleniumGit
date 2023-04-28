package readExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		//To WRITE data in Excel Sheet
		
				FileInputStream fis = new FileInputStream("./data/Test.xlsx");
				Workbook wb = WorkbookFactory.create(fis);
				Sheet sheet = wb.getSheet("IPL");
				
				//----------------------------------------------------------------
				Row row = sheet.getRow(0);
				Cell cell = row.createCell(2);
				//----------------------------------------------------------------
				 cell.setCellValue("Status");
				//---------------------------------------------
				 
				 FileOutputStream fos = new FileOutputStream("./data/Test.xlsx");
				 wb.write(fos);
		

	}

}
