package testCases;

import constantvalues.ConstVariables;
import pages.Flight_Select;
import pages.Home_Header;
import utility.CommonMethods;

public class TC001 {

	public static void tc01() throws Exception {
		Home_Header HH = new Home_Header();
		Flight_Select FS = new Flight_Select();
			
		CommonMethods.browserType(ConstVariables.browserName);
		CommonMethods.openURL(ConstVariables.websiteURL);

		HH.selectDepartureCity();
		HH.selectArrivalCity();
		HH.clickDepartureDate();
		HH.selectDepartureDate();
		HH.clickPassengersOption();
		HH.editButtonPassengerOption();
		HH.doneBtnPassengerOptions();
		HH.clickSearchFlightButton();
		FS.fetchFlightPrice();

	}
}
