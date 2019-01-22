package com.sapient.test.factory;

import com.sapient.test.data.FileType;
import com.sapient.test.service.Reader;
import com.sapient.test.service.impl.FileReaderImpl;
import com.sapient.test.util.BeanUtil;

public class FileReaderFactory {

	public static Object getFileReader(FileType type) {

		switch (type) {
		case CSV:
			return BeanUtil.getBean("csvReader");
		case EXCEL:
			return null;
		case XML:
			return null;

		default:
			return null;
		}
	}

}
