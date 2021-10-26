package utility;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import mainScript.DriverScript;

public class CommonMethods {

	public static WebDriver driver;
	public static boolean bValue;
	public static String value;
	public static List<WebElement> elements;
	
	public static WebDriver browserType(String bName) {
		if (bName.equalsIgnoreCase("CHROME")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (bName.equalsIgnoreCase("FIREFOX")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		
		return driver;
	}
	
	public static void openURL(String testData) {
		try {
			driver.get(testData);			
		} catch (Exception e) {
			DriverScript.statusValue = false;
			e.printStackTrace();
		}
	}
	
	public static void enterText(String locatorVariable, String testData) {
		try {
			WebElement element = driver.findElement(LocatorSplitFunction.locatorSplitFunction(locatorVariable));
			element.sendKeys(testData);
		} catch (Exception e) {
			DriverScript.statusValue = false;
			e.printStackTrace();
		}
	}
	
	public static void enterKeys(String locatorVariable, Keys testData) {
		try {
			WebElement element = driver.findElement(LocatorSplitFunction.locatorSplitFunction(locatorVariable));
			element.sendKeys(testData);
		} catch (Exception e) {
			DriverScript.statusValue = false;
			e.printStackTrace();
		}
	}

	public static void click(String locatorVariable) {
		try {
			WebElement element = driver.findElement(LocatorSplitFunction.locatorSplitFunction(locatorVariable));
			element.click();					
		} catch (Exception e) {
			DriverScript.statusValue = false;
			e.printStackTrace();
		}
	}
	
	public static void mouseHoveringWithOutClick(String locatorVariable) {
		try {
			WebElement element = driver.findElement(LocatorSplitFunction.locatorSplitFunction(locatorVariable));
			Actions act = new Actions(driver);
			act.moveToElement(element).perform();			
		} catch (Exception e) {
			DriverScript.statusValue = false;
			e.printStackTrace();
		}
	}
	
	public static void mouseHoveringWithClick(String locatorVariable) {
		try {
			WebElement element = driver.findElement(LocatorSplitFunction.locatorSplitFunction(locatorVariable));
			Actions act = new Actions(driver);
			act.moveToElement(element).click().perform();					
		} catch (Exception e) {
			DriverScript.statusValue = false;
			e.printStackTrace();
		}
	}
	
	public static String fetchValue(String locatorVariable) {
		try {
			WebElement element = driver.findElement(LocatorSplitFunction.locatorSplitFunction(locatorVariable));
			value = element.getText();			
		} catch (Exception e) {
			DriverScript.statusValue = false;
			e.printStackTrace();
		}
		return value;
	}
	
	public static List<WebElement> allElements(String locatorVariable){
		try {
			elements = driver.findElements(LocatorSplitFunction.locatorSplitFunction(locatorVariable));
		} catch (Exception e) {
			DriverScript.statusValue = false;
			e.printStackTrace();
		}
		return elements;
	}
	
	public static void windowSwitching(int windowIndex) {
		try {
			List<String> allwindows = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(allwindows.get(windowIndex));
		} catch (Exception e) {
			DriverScript.statusValue = false;
			e.printStackTrace();
		}
	}

	public static void closeBrowser() {
		try {
			driver.quit();
		} catch (Exception e) {
			DriverScript.statusValue = false;
			e.printStackTrace();
		}
	}
}
