package com.tyss.generics;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GenericLib {
//	Read From Excel
	public static String getExecelData(String sheet,int row,int col)
	{
		String data=null;
		try
		{
			FileInputStream fin = new FileInputStream(IConstants.EfilePath);
			Workbook workbook = WorkbookFactory.create(fin);
			Sheet sht = workbook.getSheet(sheet);
			Cell cl = sht.getRow(row).getCell(col);
			
			data=cl.getStringCellValue();
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return data;	
	}
}

