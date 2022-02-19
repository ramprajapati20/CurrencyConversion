package com.currency.conversion.service;

public class ConverterWrapper {

	public static double convert(String usd, String eur, double amount) {

		if (usd.equals("USD")) {
			return Converter.conversionUSDToEUR(amount);
		} else if (usd.equals("EUR")) {
			return Converter.conversionEURToUSD(amount);
		}
		return amount;
	}
}
