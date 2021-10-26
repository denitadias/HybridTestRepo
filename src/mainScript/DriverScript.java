package mainScript;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import constantvalues.ConstVariables;
import testCases.TC001;
import testCases.TC002;
import testCases.TC003;
import testCases.TC004;
import utility.ExcelReadWrite;

public class DriverScript {

	public static boolean statusValue;

	@BeforeClass
	public  static void preRequiste() throws Exception {
		ExcelReadWrite.excelPath(ConstVariables.excelPath);
	}
	
//------------------------------------------TC001------------------------------------------------------		
	@Test(priority=1)
	public static void tc01() throws Exception {
	if (ExcelReadWrite.readValues(ConstVariables.testCaseSheetName, 1, ConstVariables.runMode).equalsIgnoreCase("Y")) {
			statusValue = true;
			TC001.tc01();
			if (statusValue == false) {
				ExcelReadWrite.writeValues(ConstVariables.testCaseSheetName, 1, ConstVariables.status, "FAIL");
			} else {
				ExcelReadWrite.writeValues(ConstVariables.testCaseSheetName, 1, ConstVariables.status, "PASS");
			}
		} else {
			ExcelReadWrite.writeValues(ConstVariables.testCaseSheetName, 1, ConstVariables.status, "SKIP");
		}
	}
//------------------------------------------TC002------------------------------------------------------
	@Test(priority=2)
	public static void tc02() throws Exception {
	if (ExcelReadWrite.readValues(ConstVariables.testCaseSheetName, 2, ConstVariables.runMode).equalsIgnoreCase("Y")) {
			statusValue = true;
			TC002.tc02();
			if (statusValue == false) {
				ExcelReadWrite.writeValues(ConstVariables.testCaseSheetName, 2, ConstVariables.status, "FAIL");
			} else {
				ExcelReadWrite.writeValues(ConstVariables.testCaseSheetName, 2, ConstVariables.status, "PASS");
			}
		} else {
			ExcelReadWrite.writeValues(ConstVariables.testCaseSheetName, 2, ConstVariables.status, "SKIP");
		}
	}	
//------------------------------------------TC003------------------------------------------------------
	@Test(priority=3)
	public static void tc03() throws Exception {
	if (ExcelReadWrite.readValues(ConstVariables.testCaseSheetName, 3, ConstVariables.runMode).equalsIgnoreCase("Y")) {
			statusValue = true;
			TC003.tc03();
			if (statusValue == false) {
				ExcelReadWrite.writeValues(ConstVariables.testCaseSheetName, 3, ConstVariables.status, "FAIL");
			} else {
				ExcelReadWrite.writeValues(ConstVariables.testCaseSheetName, 3, ConstVariables.status, "PASS");
			}
		} else {
			ExcelReadWrite.writeValues(ConstVariables.testCaseSheetName, 3, ConstVariables.status, "SKIP");
		}
	}
//------------------------------------------TC004------------------------------------------------------
	@Test(priority=4)
	public static void tc04() throws Exception {	
	if (ExcelReadWrite.readValues(ConstVariables.testCaseSheetName, 4, ConstVariables.runMode).equalsIgnoreCase("Y")) {
			statusValue = true;
			TC004.tc04();
			if (statusValue == false) {
				ExcelReadWrite.writeValues(ConstVariables.testCaseSheetName, 4, ConstVariables.status, "FAIL");
			} else {
				ExcelReadWrite.writeValues(ConstVariables.testCaseSheetName, 4, ConstVariables.status, "PASS");
			}
		} else {
			ExcelReadWrite.writeValues(ConstVariables.testCaseSheetName, 4, ConstVariables.status, "SKIP");
		}
	}

}
