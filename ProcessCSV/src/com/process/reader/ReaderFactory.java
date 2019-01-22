package com.process.reader;

import com.process.factory.ProcessorAbstractFactory;
import com.process.writer.Writer;

public class ReaderFactory extends ProcessorAbstractFactory {


	public  Reader getReader(String readerType) {
		if (readerType.equals("CSV")) {
			return new CSVReader();
		}
		return null;

	}

	@Override
	public Writer getWriter(String string) {
		return null;
	}

}
