package com.demo.hackerrank;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
 * Input: 07:05:45PM, Output: 19:05:45
 * 
 * @author GautamV
 *
 */
public class TimeConversion {

	public static void main(String[] args) {
		String time = "07:05:45PM";
		/**
		 * HH:(00-23) will look like 00, 01..23
		 * hh:(01-12 in AM/PM) will look like 01, 02..12
		 */
		DateFormat inFormat = new SimpleDateFormat("hh:mm:ssa");
		DateFormat outFormat = new SimpleDateFormat("HH:mm:ss");
		try {
			Date date = inFormat.parse(time);
			String outDateString = outFormat.format(date);
			System.out.println(outDateString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
