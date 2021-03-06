package com.franklin.juhesdk;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class MyNumberFormat {
	public static String numberPrecise(double number) {
		BigDecimal bigDecimal = new BigDecimal(number); 
		double num = bigDecimal.setScale(6,BigDecimal.ROUND_HALF_UP ).doubleValue();
		String formatString = String.valueOf(num);
		return formatString;
	}
	
	public static String numberPrecise(double number,int precise) {
		BigDecimal bigDecimal = new BigDecimal(number); 
		double num = bigDecimal.setScale(precise,BigDecimal.ROUND_HALF_UP ).doubleValue();
		String formatString = String.valueOf(num);
		return formatString;
	}
}
