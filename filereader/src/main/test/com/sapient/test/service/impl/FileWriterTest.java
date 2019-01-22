package com.sapient.test.service.impl;

import java.io.IOException;
import java.util.List;

import org.junit.Test;

import com.sapient.test.dao.CountryIncome;
import com.sapient.test.service.Reader;
import com.sapient.test.service.Writer;

public class FileWriterTest {

	private Reader reader = new FileReaderImpl();
	private Writer writer = new FileWriterImpl();

	private final String inputPath = "C:\\Users\\Ashish\\Documents\\workspace-spring-tool-suite-4-4.0.0.RELEASE\\sapient-filereader\\src\\test\\resources\\sampleinput";
	private final String outputpath = "C:\\Users\\Ashish\\Documents\\workspace-spring-tool-suite-4-4.0.0.RELEASE\\sapient-filereader\\src\\test\\resources\\sampleinput";

	@Test(expected = RuntimeException.class)
	public void testBlankPath() throws IOException {
		writer.writer(null, null);
	}

	@Test(expected = RuntimeException.class)
	public void testBlankMap() throws IOException {
		writer.writer(null, outputpath);
	}

	@Test(expected = RuntimeException.class)
	public void testWriter() throws IOException {
		List<CountryIncome> list = reader.read(inputPath);
		writer.writer(null, outputpath);
	}

}
