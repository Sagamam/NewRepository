package com.abc.testcases;

import java.awt.image.BandedSampleModel;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula;
import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SampleClassForExcel {

	public static void main(String[] args) {
		
		FileInputStream fiS;
		XSSFWorkbook workbook=null;
		try {
			fiS=new FileInputStream("src/main/resources/testdata.xlsx");
			workbook=new XSSFWorkbook(fiS);
		} catch (IOException e) {
			// TODO: handle exception
		e.printStackTrace();
		}
		
		XSSFSheet sheet=workbook.getSheetAt(2);
		System.out.println(sheet.getRow(0).getCell(2).getStringCellValue() );
	 
		Iterator<Row> rows=sheet.rowIterator();
		while(rows.hasNext()) {
			//It will give access row by row
			Row row =rows.next();
			//XSSFROW Is haveing method	
			//GetCell -specific column
			//GetCellIterator -All column
			Iterator<Cell> cells= row.cellIterator();
			//row o and column 0
			//row 0 and column 1
			while(cells.hasNext()) {
				Cell cell=cells.next();
				System.out.println(cells.next());
				switch (cell.getCellType()) {
				case STRING :
					System.out.println(cell.getStringCellValue());
					break;
				case NUMERIC:
					System.out.println(cell.getNumericCellValue());
					break;
				case FORMULA:
					System.out.println(cell.getCellFormula());
					break;
				}
 			}
			
		}
		
	}

}
