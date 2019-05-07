package com.test.logic;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateFormatter {
	public static void main(String[] args) {
		String date = "2017-12-26T11:00:00Z";
		System.out.println("Formatted date: " + updateDateFormat(date));
		System.out.println("Formatted date: " + getTimestamp());
	}

	static String updateDateFormat(String date) {
		String formattedDateString = "";
		try {
			DateFormat fromFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
			DateFormat toFormat = new SimpleDateFormat("MM/dd/yyyy");
			Date formattedDate = fromFormat.parse(date);
			formattedDateString = toFormat.format(formattedDate);
		} catch (ParseException e) {
			System.out.println("Exception in parsing date " + date);
		}
		return formattedDateString;
	}

	static String getTimestamp() {
		SimpleDateFormat nzdt = new SimpleDateFormat("H:mm a dd MMM yyyy z");
		nzdt.setTimeZone(TimeZone.getTimeZone("Pacific/Auckland"));
		return nzdt.format(new Date());
	}
}
