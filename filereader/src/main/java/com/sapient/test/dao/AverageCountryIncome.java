package com.sapient.test.dao;

import com.sapient.test.data.Gender;

public class AverageCountryIncome {

	private String country;
	private Gender gender;
	private double salary;
	private int count = 1;

	private void incrementCount() {
		++count;
	}

	public String getCountry() {
		return country;
	}

	public AverageCountryIncome setCountry(String country) {
		this.country = country;
		return this;
	}

	public Gender getGender() {
		return gender;
	}

	public AverageCountryIncome setGender(Gender gender) {
		this.gender = gender;
		return this;
	}

	public double getSalary() {
		return salary;
	}

	public AverageCountryIncome setsalary(double salary) {
		this.salary = salary;
		return this;
	}

	public void addSalary(double salary) {
		incrementCount();
		this.salary = this.salary + salary;
	}

	public double getAverageSalary() {
		if (this.count == 0 || this.salary == 0) {
			return 0;
		}
		return salary / count;
	}

	@Override
	public boolean equals(Object obj) {
		AverageCountryIncome aci = (AverageCountryIncome) obj;
		return this.gender.name().equalsIgnoreCase(aci.getGender().name())
				&& this.country.equalsIgnoreCase(aci.getCountry());
	}

}