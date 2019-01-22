package com.process.writer;

import com.process.factory.ProcessorAbstractFactory;
import com.process.reader.Reader;

public class WriterFactory  extends ProcessorAbstractFactory {

	

	@Override
	public Reader getReader(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Writer getWriter(String writerType) {
		if (writerType.equals("CSV")) {
			return new CSVWriter();
		}
		return null;
	}
}
