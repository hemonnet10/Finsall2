package com.sapient.test.service.impl;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.function.Consumer;

import com.sapient.test.dao.AverageCountryIncome;
import com.sapient.test.service.Writer;

public class FileWriterImpl implements Writer {

	private static final String NEW_LINE = "\n";
	private static final String SEPRATOR = ",";

	@Override
	public void writer(List<AverageCountryIncome> list, String path) throws RuntimeException, IOException {

		if (path == null || path.trim().equalsIgnoreCase("") || list == null || list.size() == 0) {
			throw new RuntimeException("Path/map cannot be null or balnk");
		}

		BufferedWriter buffer = new BufferedWriter(new FileWriter(path));

		buffer.append("Country/City,Gender,Average Salary" + NEW_LINE);

		list.forEach(new Consumer<AverageCountryIncome>() {

			@Override
			public void accept(AverageCountryIncome value) {
				try {
					buffer.append(value.getCountry());
					buffer.append(SEPRATOR);
					buffer.append(value.getGender().name());
					buffer.append(SEPRATOR);
					buffer.append(String.valueOf(value.getAverageSalary()));
					buffer.append(NEW_LINE);
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		});

		buffer.close();

	}

}
