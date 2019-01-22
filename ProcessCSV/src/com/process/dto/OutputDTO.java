package com.process.dto;

import java.util.Comparator;

public class OutputDTO implements Comparator<String>{

	
    private String countryOrCity;

    private String gender;

    private double income;

    private int count;

	public String getCountryOrCity() {
		return countryOrCity;
	}
	public void setCountryOrCity(String countryOrCity) {
		this.countryOrCity = countryOrCity;
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

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public void addAndIncrementCount(double income) {
		this.income+=income;
		count++;
	}

	@Override
	public String toString() {
		return "Employee Output DTO [CountryOrcity="  + countryOrCity + ", gender=" + gender + ", income=" + income
				+ ", count=" + count + "]";
	}

	public OutputDTO(String countryOrCity, String gender, double income, int count) {
		this.countryOrCity = countryOrCity;
		this.gender = gender;
		this.income = income;
		this.count = count;
	}

	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2);
	}
    
	
}
