package com.qsp.Magneto.GenericUtility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtils {

	public String readTheDataFromExcelSheet(String sheetName, int rowNum, int cellNum) throws Throwable {
			FileInputStream fis = new FileInputStream("./src/test/resources/testData.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet(sheetName);
			Row row = sheet.getRow(rowNum);
			Cell cell = row.getCell(cellNum);
			String value = cell.getStringCellValue();
			return value;
			
			
	
	}
}
