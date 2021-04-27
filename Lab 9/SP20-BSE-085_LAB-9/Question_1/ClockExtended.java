package lab9;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ClockExtended extends Clock {

	void display() {
		Date currentDate = new Date();

		SimpleDateFormat formatter = new SimpleDateFormat("kk:mm:ss");
		String timeIn24Hours = formatter.format(currentDate);

		SimpleDateFormat formatterAmPm = new SimpleDateFormat("kk:mm:ss a");
		String timeInAmPm = formatterAmPm.format(currentDate);

		System.out.println("Current time in AM/PM format: " + timeInAmPm);
		System.out.println("Current time in 24 hours format : " + timeIn24Hours);
	}

}
