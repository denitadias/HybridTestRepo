package constantvalues;

import utility.ExcelReadWrite;

public class ConstVariables {

	public static final String excelPath = "C:\\Users\\varikd\\eclipse-workspace\\HybridFramework_WithTESTNG\\Indigo Test Cases.xlsx";
	public static final String browserName = ExcelReadWrite.readValues("TestCases", 1, 4);
	public static final String websiteURL = ExcelReadWrite.readValues("TestCases", 2, 4);
	public static final String departureCity = ExcelReadWrite.readValues("TestCases", 3, 4);
	public static final String arrivalCity = ExcelReadWrite.readValues("TestCases", 4, 4);
	public static final String deptDate = ExcelReadWrite.readValues("TestCases", 5, 4);
	public static final String testCaseSheetName = "Test Scenarios";
	public static final int runMode = 3;
	public static final int status = 2;
	public String name;
}
