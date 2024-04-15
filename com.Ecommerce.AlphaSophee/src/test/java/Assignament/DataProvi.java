package Assignament;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

import com.GenericUtility.IpathConstant;

public class DataProvi {
	
	@DataProvider
	public Object[][] m1() throws EncryptedDocumentException, IOException
	{
		
		
		FileInputStream fis = new FileInputStream(IpathConstant.ExcelFilepath);
		
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet5");
		int rowcount = sheet.getLastRowNum()+1;
		int cellcount = sheet.getRow(0).getLastCellNum();
		Object[][] obj = new Object[rowcount][cellcount];
		
		for(int i=0;i<rowcount;i++)
		{
			for(int j=0;j<cellcount;j++)
			{
				 obj[i][j]= sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}
		
		
	return obj;
		
	}

}
