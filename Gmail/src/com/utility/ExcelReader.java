

package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelReader
{
	public static File p;
	public static String getExcellData(String excelName,int rowNumber,int columnNumber) throws EncryptedDocumentException, IOException
	{
		
				p = new File("C:\\Users\\LENOVO\\eclipse-workspace\\Gmail\\ExcelSheet\\GmailSheet.xlsx");
				FileInputStream fis = new FileInputStream(p);
				Workbook wb = WorkbookFactory.create(fis);
				return wb.getSheet(excelName).getRow(rowNumber).getCell(columnNumber).getStringCellValue();
		
	}
	public static void setExcelData(String excelName,int rowNumber,int cellNumber,String data) throws EncryptedDocumentException, IOException
	{
		try
		{
			p = new File("C:\\Users\\LENOVO\\eclipse-workspace\\Gmail\\ExcelSheet\\GmailOutput.xlsx");
			FileInputStream fis = new FileInputStream(p);
			Workbook wb = WorkbookFactory.create(fis);
			wb.getSheet(excelName).createRow(rowNumber).createCell(cellNumber).setCellValue(data);
			FileOutputStream fos = new FileOutputStream(p);
			wb.write(fos);
			
		}
		catch(Exception e)
		{
			
		}

	}
	

}
