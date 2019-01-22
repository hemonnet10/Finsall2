package com.sapient.test.service;

import java.io.IOException;
import java.util.List;

import com.sapient.test.dao.AverageCountryIncome;

public interface Writer {

	void writer(List<AverageCountryIncome> list, String path) throws IOException;

}
