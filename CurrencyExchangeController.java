package com.currency.conversion.controller;

import java.math.BigDecimal;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.currency.conversion.model.ExchangeValue;
import com.currency.conversion.service.ConverterWrapper;

@SpringBootApplication
@RestController
public class CurrencyExchangeController {

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {
		ExchangeValue exchangeValue = new ExchangeValue(1000L, from, to, BigDecimal.valueOf(65));
		double convertedValue = ConverterWrapper.convert(from, to, 200);
		exchangeValue.setConversionMultiple(new BigDecimal(convertedValue));
		return exchangeValue;
	}
}
