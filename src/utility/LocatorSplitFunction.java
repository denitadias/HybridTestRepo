package utility;

import org.openqa.selenium.By;

public class LocatorSplitFunction {

	public static By locatorSplitFunction(String locatorVariable) {
		String locType = locatorVariable.split(":")[0];
		String locValue = locatorVariable.split(":")[1];		
		
		if (locType.equalsIgnoreCase("ID")) {
			return By.id(locValue);
		} 
		else if (locType.equalsIgnoreCase("NAME")) {
			return By.name(locValue);
		}
		else if (locType.equalsIgnoreCase("LINKTEXT")) {
			return By.linkText(locValue);
		}
		else if (locType.equalsIgnoreCase("PARTIALLINKTEXT")) {
			return By.partialLinkText(locValue);
		}
		else if (locType.equalsIgnoreCase("CSSSELECTOR")) {
			return By.cssSelector(locValue);
		}
		else if (locType.equalsIgnoreCase("XPATH")) {
			return By.xpath(locValue);
		}
		
		return null;
		}
	}
