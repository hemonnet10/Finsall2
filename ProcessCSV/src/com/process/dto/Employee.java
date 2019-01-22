package com.process.dto;

import com.process.Currency;

public class Employee {

	private String city;

	private String country;

	private String gender;

	private double income;

	private String currency;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Override
	public String toString() {
		return "Employee [city=" + city + ", country=" + country + ", gender=" + gender + ", income=" + income
				+ ", currency=" + currency + "]";
	}

	public Employee(String city, String country, String gender, double income, String currency) {
		super();
		this.city = city;
		this.country = country;
		this.gender = gender;
		this.income = Currency.valueOf(currency).getCCRate()*income;
		this.currency = currency;
	}

}
