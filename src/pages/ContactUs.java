package pages;

import constantvalues.ConstantLocators;
import utility.CommonMethods;

public class ContactUs {


	public void allWindows() throws Exception {
		Thread.sleep(2000);
		CommonMethods.windowSwitching(1);
	}
	
	public void corpOfficeaddress() throws Exception {
		Thread.sleep(2000);
		String add = CommonMethods.fetchValue(ConstantLocators.ele_Address_ContactUs);
		System.out.println(add);
	}

}
