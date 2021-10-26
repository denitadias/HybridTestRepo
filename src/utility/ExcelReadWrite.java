package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import constantvalues.ConstVariables;

public class ExcelReadWrite {

	static XSSFWorkbook wb;
	static XSSFSheet ws;
	static XSSFCell xc;
	
	public static void excelPath(String pathName) throws Exception {
		File f = new File(pathName);
		FileInputStream fis = new FileInputStream(f);
		wb = new XSSFWorkbook(fis);
	}
	
	public static String readValues(String sheetName, int rowNum, int colNum) {
		ws = wb.getSheet(sheetName);
		xc = ws.getRow(rowNum).getCell(colNum);
		
		DataFormatter df = new DataFormatter();
		String cellValue = df.formatCellValue(xc);
		return cellValue;
	}
	
	public static double readValuesasfloat(String sheetName, int rowNum, int colNum) {
		ws = wb.getSheet(sheetName);
		xc = ws.getRow(rowNum).getCell(colNum);
		
		double cellValue = xc.getNumericCellValue();
		return cellValue;
	}
	
	public static void writeValues(String sheetName, int rowNum, int colNum, String testData) throws Exception {
		ws = wb.getSheet(sheetName);
		xc = ws.getRow(rowNum).getCell(colNum);

		xc.setCellValue(testData);
		
		FileOutputStream fos = new FileOutputStream(ConstVariables.excelPath);
		wb.write(fos);
		fos.close();
		
		File f = new File(ConstVariables.excelPath);
		FileInputStream fis = new FileInputStream(f);
		wb = new XSSFWorkbook(fis);
	}

}
