package com.currency.conversion.service;

public class Converter {

	public static double conversionUSDToEUR(double amount) {
		double euro = amount / 1.18;
		return euro;
	}

	public static double conversionEURToUSD(double amount) {
		double usd = amount * 1.18;
		return usd;
	}
}
