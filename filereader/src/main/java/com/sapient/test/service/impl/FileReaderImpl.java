package com.sapient.test.service.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.sapient.test.dao.CountryIncome;
import com.sapient.test.data.Currency;
import com.sapient.test.data.Gender;
import com.sapient.test.service.Reader;

public class FileReaderImpl implements Reader {

	@Override
	public List<CountryIncome> read(String path) throws IOException {

		if (path == null || path.trim().equalsIgnoreCase("")) {
			throw new RuntimeException("File Path cannot be null or blank");
		}

		BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(path)));

		String line;

		List<CountryIncome> list = new ArrayList<>();

		boolean flag = false;

		while ((line = bufferedReader.readLine()) != null) {
			if (!flag) {
				flag = true;
				continue;
			}
			String[] values = line.split(",");
			Double salary = Double.valueOf(values[4]);
			Currency currency = Currency.valueOf(values[3]);
			list.add(new CountryIncome().setCity(values[0]).setCountry(values[1]).setGender(Gender.valueOf(values[2]))
					.setCurrency(currency).setSalary(salary * currency.getCCRate()));
		}

		return list;
	}

}
