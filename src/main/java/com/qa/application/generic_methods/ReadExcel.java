package com.qa.application.generic_methods;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {

	public static String readExcelData(String sheetName,int rownum,int cellnum)
	{
		String value="";
		try{
		FileInputStream fis=new FileInputStream(Constants.EXCEL_PATH);
		Workbook wb= WorkbookFactory.create(fis);
		Cell cell = wb.getSheet(sheetName).getRow(rownum).getCell(cellnum);
		value=cell.toString();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return value;
	}
}
