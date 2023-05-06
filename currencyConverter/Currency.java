package currencyConverter;

import java.util.ArrayList;
import java.util.HashMap;

public class Currency {
	private String name;
	private String shortName;
	private HashMap<String, Double> exchangeValues = new HashMap<String, Double>();
	
	// "Currency" Constructor
	public Currency(String nameValue, String shortNameValue) {
		this.name = nameValue;
		this.shortName = shortNameValue;
	}
	
	// Getter for name
	public String getName() {
		return this.name;
	}
	
	// Setter for name
	public void setName(String name) {
		this.name = name;
	}
	
	// Getter for shortName
	public String getShortName() {
		return this.shortName;
	}
	
	// Setter for shortName
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	
	// Getter for exchangeValues
	public HashMap<String, Double> getExchangeValues() {
		return this.exchangeValues;
	}
	
	// Setter for exchangeValues
	public void setExchangeValues(String key, Double value) {
		this.exchangeValues.put(key, value);
	}
	
	// Set default values for a currency
	public void defaultValues() {
		String currency = this.name;
		
		switch (currency) {
			//complete
			case "Rupees":
				this.exchangeValues.put("INR", 1.00);
				this.exchangeValues.put("USD", 0.012);
				this.exchangeValues.put("EUR", 0.011);
				this.exchangeValues.put("GBP", 0.0097);
				this.exchangeValues.put("CHF", 0.011);
				this.exchangeValues.put("CNY", 0.085);
				this.exchangeValues.put("JPY", 1.65);
				break;
			//complete
			case "US Dollar":
				this.exchangeValues.put("INR", 81.77);
				this.exchangeValues.put("USD", 1.00);
				this.exchangeValues.put("EUR", 0.91);
				this.exchangeValues.put("GBP", 0.80);
				this.exchangeValues.put("CHF", 0.90);
				this.exchangeValues.put("CNY", 6.92);
				this.exchangeValues.put("JPY", 134.93);
				break;
			//complete
			case "Euro":
				this.exchangeValues.put("INR", 89.82);
				this.exchangeValues.put("USD", 1.10);
				this.exchangeValues.put("EUR", 1.00);
				this.exchangeValues.put("GBP", 0.87);
				this.exchangeValues.put("CHF", 0.98);
				this.exchangeValues.put("CNY", 7.60);
				this.exchangeValues.put("JPY", 148.34);
				break;
			//complete
			case "British Pound":
				this.exchangeValues.put("INR", 102.94);
				this.exchangeValues.put("USD", 1.26);
				this.exchangeValues.put("EUR", 1.15);
				this.exchangeValues.put("GBP", 1.00);
				this.exchangeValues.put("CHF", 1.13);
				this.exchangeValues.put("CNY", 8.71);
				this.exchangeValues.put("JPY", 169.89);
				break;
			//complete
			case "Swiss Franc":
				this.exchangeValues.put("INR", 91.36);
				this.exchangeValues.put("USD", 1.12);
				this.exchangeValues.put("EUR", 1.02);
				this.exchangeValues.put("GBP", 0.89);
				this.exchangeValues.put("CHF", 1.00);
				this.exchangeValues.put("CNY", 7.73);
				this.exchangeValues.put("JPY", 150.70);
				break;
			//complete
			case "Chinese Yuan Renminbi":
				this.exchangeValues.put("INR", 11.82);
				this.exchangeValues.put("USD", 0.14);
				this.exchangeValues.put("EUR", 0.13);
				this.exchangeValues.put("GBP", 0.11);
				this.exchangeValues.put("CHF", 0.13);
				this.exchangeValues.put("CNY", 1.00);
				this.exchangeValues.put("JPY", 19.50);
				break;
			//complete
			case "Japanese Yen":
				this.exchangeValues.put("INR", 0.61);
				this.exchangeValues.put("USD", 0.0074);
				this.exchangeValues.put("EUR", 0.0067);
				this.exchangeValues.put("GBP", 0.0059);
				this.exchangeValues.put("CHF", 0.0066);
				this.exchangeValues.put("CNY", 0.051);
				this.exchangeValues.put("JPY", 1.000);
				break;
		}
	}
	
	// Initialize currencies
	public static ArrayList<Currency> init() {
		ArrayList<Currency> currencies = new ArrayList<Currency>();
		
		currencies.add( new Currency("Rupees", "INR") );
		currencies.add( new Currency("US Dollar", "USD") );
		currencies.add( new Currency("Euro", "EUR") );
		currencies.add( new Currency("British Pound", "GBP") );
		currencies.add( new Currency("Swiss Franc", "CHF") );
		currencies.add( new Currency("Chinese Yuan Renminbi", "CNY") );
		currencies.add( new Currency("Japanese Yen", "JPY") );
		
		for (Integer i =0; i < currencies.size(); i++) {
			currencies.get(i).defaultValues();
		}		
		
		return currencies;
	}
	
	// Convert a currency to another
	public static Double convert(Double amount, Double exchangeValue) {
		Double price;
		price = amount * exchangeValue;
		price = Math.round(price * 100d) / 100d;
		
		return price;
	}
}