package com.sapient.test.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.sapient.test.dao.AverageCountryIncome;
import com.sapient.test.dao.CountryIncome;

public class AverageSalaryCalculator {

	public static List<AverageCountryIncome> getSortedAverageIncomeList(List<CountryIncome> list) {

		List<AverageCountryIncome> aciList = new ArrayList<>();

		for (CountryIncome ci : list) {
			AverageCountryIncome aci = new AverageCountryIncome()
					.setCountry(ci.getCountry() == null || ci.getCountry().trim().equalsIgnoreCase("") ? ci.getCity()
							: ci.getCountry())
					.setGender(ci.getGender()).setsalary(ci.getSalary());

			if (aciList.contains(aci)) {
				AverageCountryIncome averageCountryIncome = aciList.get(aciList.indexOf(aci));
				averageCountryIncome.addSalary(ci.getSalary());
			} else {
				aciList.add(aci);
			}
		}

		Collections.sort(aciList, new Comparator<AverageCountryIncome>() {
			public int compare(AverageCountryIncome aci, AverageCountryIncome aci2) {
				return (int) (aci.getAverageSalary() - aci2.getAverageSalary());
			};
		});

		return aciList;
	}

}
