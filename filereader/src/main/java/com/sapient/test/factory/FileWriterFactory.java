package com.sapient.test.factory;

import com.sapient.test.data.FileType;
import com.sapient.test.service.Writer;
import com.sapient.test.service.impl.FileWriterImpl;
import com.sapient.test.util.BeanUtil;

public class FileWriterFactory {

	public static Object getFileWriter(FileType type) {
		switch (type) {
		case CSV:
			return BeanUtil.getBean("csvWriter");

		default:
			return null;
		}
	}

}
