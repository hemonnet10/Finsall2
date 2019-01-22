package com.sapient.test.service;

import java.io.IOException;
import java.util.List;

import com.sapient.test.dao.CountryIncome;

public interface Reader {

	List<CountryIncome> read(String path) throws IOException;

}
