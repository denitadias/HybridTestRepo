package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import constantvalues.ConstVariables;
import constantvalues.ConstantLocators;
import utility.CommonMethods;

public class Home_Header {

	public void selectDepartureCity() throws Exception {
		
		for (int i = 0; i < 30; i++) {
		CommonMethods.enterKeys(ConstantLocators.ele_DepartureTextBox_HomeHeaderPage, Keys.BACK_SPACE);
		}
		CommonMethods.enterText(ConstantLocators.ele_DepartureTextBox_HomeHeaderPage, ConstVariables.departureCity);
		CommonMethods.enterKeys(ConstantLocators.ele_DepartureTextBox_HomeHeaderPage, Keys.ENTER);
		Thread.sleep(1000);
	}
	
	public void selectArrivalCity() throws Exception {
		CommonMethods.enterText(ConstantLocators.ele_ArrivalTextBox_HomeHeaderPage, ConstVariables.arrivalCity);
		CommonMethods.enterKeys(ConstantLocators.ele_ArrivalTextBox_HomeHeaderPage, Keys.TAB);
		Thread.sleep(1000);
	}

	public void clickDepartureDate() {
		CommonMethods.click(ConstantLocators.ele_deptDate_HomeHeaderPage);
	}
	
	public void selectDepartureDate() {
		
		List<WebElement> allRows = CommonMethods.allElements(ConstantLocators.ele_DateAllROws_HomeHeaderPage);
		int countofRows = allRows.size();
		System.out.println("No of rows ------ " + countofRows);
		
		for (int i = 0; i < countofRows; i++) {
			if (CommonMethods.bValue == true) {
				break;
			} else {
			List<WebElement> allTableDatas = allRows.get(i).findElements(By.tagName("td"));
			int counttd = allTableDatas.size();
			System.out.println("No of columns is " + counttd);

				for (int j = 0; j < counttd; j++) {
					String tdText = allTableDatas.get(j).getText();
					System.out.println("The text at row number " + i + " and column number " + j + " is " + tdText);
					
						if (tdText.equals(ConstVariables.deptDate)) {
							allTableDatas.get(j).click();
							CommonMethods.bValue = true;
							break;
						}
				}
		}
		}
	}
	
	public void clickPassengersOption() {
		CommonMethods.click(ConstantLocators.ele_Passenger_HomeHeaderPage);
	}
	
	public void editButtonPassengerOption() {
		CommonMethods.click(ConstantLocators.ele_addBtn_HomeHeaderPage);
	}
	
	public void doneBtnPassengerOptions() {
		CommonMethods.click(ConstantLocators.ele_DoneBtn_HomeHeaderPage);
	}
	public void clickSearchFlightButton() {
		CommonMethods.click(ConstantLocators.ele_SearchFlight_HomeHeaderPage);
	}
}
