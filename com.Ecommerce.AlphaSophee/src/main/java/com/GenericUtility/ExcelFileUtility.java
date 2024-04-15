package com.GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtility {
	/**
	 * 
	 * @author Soumya
	 * @param SheetName
	 * @param RowNum
	 * @param cellNum
	 * @param cellvalue
	 * @throws Throwable
	 */

	public void writeDataIntoExcelFile(String SheetName, int RowNum, int cellNum, String cellvalue) throws Throwable {
		FileInputStream fis = new FileInputStream(IpathConstant.ExcelFilepath);

		Workbook wb = WorkbookFactory.create(fis);

		Sheet sheet = wb.createSheet(SheetName);
		sheet.createRow(RowNum).createCell(cellNum).setCellValue(cellvalue);
		FileOutputStream fout = new FileOutputStream(IpathConstant.ExcelFilepath);
		
		wb.write(fout);
	}
	public int getTotalRowcount(String SheetName) throws Throwable
	{
		FileInputStream fis = new FileInputStream(IpathConstant.ExcelFilepath);

		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(SheetName);
		int rowcount=sheet.getLastRowNum();
		return rowcount;
	}

	public String ReadDataFromExcelFile(String Sheetname, int RowNum, int cellNum) throws Throwable
	{
		FileInputStream fis = new FileInputStream(IpathConstant.ExcelFilepath);

		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(Sheetname);
		
	return	sheet.getRow(RowNum).getCell(cellNum).toString();
		
	}
	public HashMap<String, String> readmulipleData(String sheetName,int cellNo) throws Throwable
	{

		FileInputStream fis = new FileInputStream(IpathConstant.ExcelFilepath);

		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		int rowcount=sheet.getLastRowNum();
		HashMap<String, String> map = new HashMap<String ,String>();
		for(int i=0;i<=rowcount;i++)
		{
			String Key= sheet.getRow(i).getCell(cellNo).getStringCellValue();
			String Value= sheet.getRow(i).getCell(cellNo+1).getStringCellValue();
			map.put(Key, Value);
		}
		return map;
	}

}
