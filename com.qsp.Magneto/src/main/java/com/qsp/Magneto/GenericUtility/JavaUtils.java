package com.qsp.Magneto.GenericUtility;

import java.time.LocalDateTime;
import java.util.Random;

public class JavaUtils {
	
	public int generateRandomNumber() {
		Random r = new Random(500);
		int number = r.nextInt();
		return number;
	}
	
	public String sytemDateAndTime() {
		String dateAndTime = LocalDateTime.now().toString().replace(':', '-');
		return dateAndTime;
	
	}

}
