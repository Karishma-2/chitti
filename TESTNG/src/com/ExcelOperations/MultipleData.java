package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MultipleData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		//locate the file
		FileInputStream fileinput=new FileInputStream("./src/com/Excel/Excel.xlsx");
		
		//workbook in the file
		XSSFWorkbook Workbook=new XSSFWorkbook(fileinput);
		

		//Sheet in the workbook
		XSSFSheet sheet=Workbook.getSheet("Sheet1");
		
		System.out.println(sheet.getLastRowNum());
		//go to every row and get cells
		
		for(int row=0;row<sheet.getLastRowNum();row++)
		{
			//Row row1=sheet.getRow(row);
			Row row1=sheet.getRow(0);
			//System.out.println(row1.getLastCellNum());
			//for(int cell=0;cell<row1.getLastCellNum();cell++)
		//	{
				//String data=row1.getCell(0).getStringCellValue();
			String data=row1.getCell(0).getStringCellValue();

				System.out.print(data+" ");
			//}
			System.out.println();
		}
	}

}
