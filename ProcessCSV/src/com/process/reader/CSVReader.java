package com.process.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.process.dto.Employee;

public class CSVReader implements Reader {

	private static final int CITY_IDX = 0;
	private static final int COUNTRY_IDX = 1;
	private static final int GENDER_IDX = 2;
	private static final int CURRENCY_IDX = 3;
	private static final int INCOME_IDX = 4;

	@Override
	public List<Employee> readEmployee() {
		List<Employee> employeeList = new ArrayList<>();

		try (BufferedReader reader = new BufferedReader(new FileReader("./input/sampleinputH.csv"))) {

			String line = reader.readLine();
			while ((line = reader.readLine()) != null) {

				String[] headers = line.split(",");
				if (headers.length > 1) {
					Employee employee = new Employee(headers[CITY_IDX], headers[COUNTRY_IDX], headers[GENDER_IDX],
							Double.valueOf(headers[INCOME_IDX]), headers[CURRENCY_IDX]);
					employeeList.add(employee);
				}
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return employeeList;
	}
}
