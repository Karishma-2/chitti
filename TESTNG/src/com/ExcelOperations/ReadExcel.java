package com.ExcelOperations;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//locate the file
		FileInputStream file=new FileInputStream("./src/com/Excel/Excel Worksheet.xlsx");
		
		//Workbook in the file 
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		
		//Sheet in the workbook
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		
		//Row in the Sheet
		Row row=sheet.getRow(0);
		
		
		//cell in the row
		Cell cell=row.getCell(0);
		
		//Data in the cell
		String data=cell.getStringCellValue();
		
		System.out.println(data);

	}

}
