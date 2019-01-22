package com.process;

public enum Currency {

	INR("INR", 0.0140815), USD("USD", 1), HKD("HKD", 0.127508), SGP("SGP", 0.738452), GBP("GBP", 1.28084);

	private double currency;

	private Currency(String value, double curr) {
		this.currency = curr;
	}

	public double getCCRate() {
		return this.currency;
	}

}
