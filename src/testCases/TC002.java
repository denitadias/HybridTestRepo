package testCases;

import pages.Flight_Select;

public class TC002 {

	public static void tc02() throws Exception {
		Flight_Select FS = new Flight_Select();
				
		FS.clickTimeRange();
		FS.clickSecondFlight();
		FS.contatctUsLink();
	}
}

