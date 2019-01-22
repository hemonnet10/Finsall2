package com.sapient.test.dao;

import com.sapient.test.data.Currency;
import com.sapient.test.data.Gender;

public class CountryIncome {

	private String city;
	private String country;
	private Gender gender;
	private Currency currency;
	private double salary;

	public String getCity() {
		return city;
	}

	public CountryIncome setCity(String city) {
		this.city = city;
		return this;
	}

	public String getCountry() {
		return country;
	}

	public CountryIncome setCountry(String country) {
		this.country = country;
		return this;
	}

	public Gender getGender() {
		return gender;
	}

	public CountryIncome setGender(Gender gender) {
		this.gender = gender;
		return this;
	}

	public Currency getCurrency() {
		return currency;
	}

	public CountryIncome setCurrency(Currency currency) {
		this.currency = currency;
		return this;
	}

	public double getSalary() {
		return salary;
	}

	public CountryIncome setSalary(double salary) {
		this.salary = salary;
		return this;
	}

}