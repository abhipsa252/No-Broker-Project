package com.nobroker.parameters;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	FileInputStream fis;
	XSSFWorkbook workbook;

	public XSSFSheet sheet1;

	public void input(String input, int sheet) {
		File f = new File("C:\\Users\\ABDASH\\eclipse-workspace\\NoBrokerProject\\src\\test\\resource\\ExcelFile\\" + input);

		try {
			// Check if the specified file exists
			if (f.exists()) {
			    fis = new FileInputStream(f);
			    // Create a workbook object to represent the Excel file
			    workbook = new XSSFWorkbook(fis);
			    sheet1 = workbook.getSheetAt(sheet);
			} else {
			    System.out.println("File not found: " + f.getAbsolutePath());
			}


			return;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
