package com.process;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.process.dto.Employee;
import com.process.dto.OutputDTO;
import com.process.factory.FactoryProducer;
import com.process.factory.ProcessorAbstractFactory;
import com.process.reader.Reader;
import com.process.writer.Writer;

public class Processor {

	public static void main(String[] args) {

		ProcessorAbstractFactory pf = FactoryProducer.getFactory("READER_FACTORY");
		Reader reader = pf.getReader("CSV");

		List<Employee> employeeList = reader.readEmployee();

		ProcessorAbstractFactory wf = FactoryProducer.getFactory("WRITER_FACTORY");
		Writer writer = wf.getWriter("CSV");

		List<OutputDTO> groupedData=groupEmp(employeeList);
		writer.writeEmployee(groupedData);
	}

	private static List<OutputDTO> groupEmp(List<Employee> employeeList) {
		Map<String, OutputDTO> map = new TreeMap<>();
		List<OutputDTO> outputList=new ArrayList<>();
		String key = "";
		String countryOrCity = "";
		OutputDTO outDto = null;
		for (Employee employee : employeeList) {
			countryOrCity = employee.getCountry() != null && !employee.getCountry().equals("") ? 
					employee.getCountry() : employee.getCity();
			key = countryOrCity + "|" + employee.getGender();
			if (map.containsKey(key)) {
				map.get(key).addAndIncrementCount(employee.getIncome());
			} else {
				outDto = new OutputDTO(countryOrCity, employee.getGender(), employee.getIncome(), 1);
				map.put(key, outDto);
			}
		}
		 outputList.addAll(map.values());
		 return outputList;
	}

}
