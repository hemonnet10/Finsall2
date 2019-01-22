package com.process.writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

import com.process.dto.OutputDTO;

public class CSVWriter implements Writer {

	@Override
	public void writeEmployee(List<OutputDTO> list) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("./output/sampleoutput4.csv"))) {
			String header = "Country/City,Gender,Average Income";
			writer.write(header);
			writer.newLine();
			for (OutputDTO outputDTO : list) {
				writer.write(outputDTO.getCountryOrCity() + "," + outputDTO.getGender() + ","
						+ (outputDTO.getIncome() / outputDTO.getCount()));
				writer.newLine();
			}
			writer.newLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
