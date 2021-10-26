package pages;

import java.util.List;
import org.openqa.selenium.WebElement;
import constantvalues.ConstantLocators;
import utility.CommonMethods;

public class AddOnServices {
	
	public void loungeMainMenu() throws Exception {
		Thread.sleep(2000);
		CommonMethods.mouseHoveringWithOutClick(ConstantLocators.ele_loungeMainMenu);
	}
	
	public void loungeServices() throws Exception {
		Thread.sleep(2000);
		CommonMethods.mouseHoveringWithClick(ConstantLocators.ele_Loungeservices);
		}
	
	public void getLoungeServices() {
		List<WebElement> allservices = CommonMethods.allElements(ConstantLocators.allservices);
		for (int i = 0; i < allservices.size(); i++) {
			String serviceNames = allservices.get(i).getText();
			System.out.println(serviceNames);
		}
	}

}
