package com.ExcelOperations;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//locate the file									/src/com/Excel/Excel Worksheet.xlsx
				FileInputStream file=new FileInputStream("./src/com/Excel/Excel Worksheet.xlsx");
				
				//Workbook in the file 
				XSSFWorkbook workbook=new XSSFWorkbook(file);
				
				
				//Sheet in the workbook
				XSSFSheet sheet=workbook.getSheet("Sheet1");
				
				//create row in the sheet1
				Row row=sheet.createRow(2);
				
				//create cell in the row
				Cell cell=row.createCell(1);
				
				//insert data into cell
				cell.setCellValue("WriteExcel");
				
				
				FileOutputStream fileoutput=new FileOutputStream("./src/com/Excel/Excel Worksheet.xlsx");
				workbook.write(fileoutput);
				
				
				
				
	}

}
