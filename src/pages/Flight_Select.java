package pages;

import java.util.List;
import org.openqa.selenium.WebElement;
import constantvalues.ConstantLocators;
import utility.CommonMethods;

public class Flight_Select {

	public void fetchFlightPrice() throws Exception {
		Thread.sleep(10000);
		String flPrice = CommonMethods.fetchValue(ConstantLocators.flightPice_FlightSelectPage);
		System.out.println(flPrice);

	}
	
	public void clickTimeRange() {
		CommonMethods.click(ConstantLocators.ele_TIme1218_FlightSelectPage);
	}
	
	public void clickSecondFlight() {
		List<WebElement> allFlights = CommonMethods.allElements(ConstantLocators.allFlights_FlightSelectPage);
		int countofRows = allFlights.size();
		System.out.println("No of flights ------ " + countofRows);

		for (int i = 0; i < countofRows; i++) {
			String flPrice = allFlights.get(i).getText();
			System.out.println(flPrice);
		}
			allFlights.get(2).click();
	}
	
	public void contatctUsLink() throws Exception {
		CommonMethods.click(ConstantLocators.ele_ContactUs_FlightSelectPage);
		Thread.sleep(2000);
	}
}
