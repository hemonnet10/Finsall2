package com.sapient.test.service.impl;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import org.junit.Test;

import com.sapient.test.dao.CountryIncome;
import com.sapient.test.service.Reader;

public class FileReaderTest {

	private Reader reader = new FileReaderImpl();

	private final String inputPath = "C:\\Users\\Ashish\\Documents\\workspace-spring-tool-suite-4-4.0.0.RELEASE\\sapient-filereader\\src\\test\\resources\\sampleinput";

	@Test(expected = RuntimeException.class)
	public void testBlankFilePath() throws IOException {
		reader.read("");
	}

	@Test
	public void testRecords() throws IOException {
		List<CountryIncome> list = reader.read(inputPath);
		assertNotNull(list);
		assertTrue(list.size() == 21);
	}

}
