package testCases;

import pages.AddOnServices;
import utility.CommonMethods;

public class TC004 {

	public static void tc04() throws Exception {
		AddOnServices AS = new AddOnServices();
		
		AS.loungeMainMenu();
		AS.loungeServices();
		AS.getLoungeServices();
		CommonMethods.closeBrowser();
	}
}
