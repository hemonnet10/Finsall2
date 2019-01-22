package com.process.factory;

import com.process.reader.ReaderFactory;
import com.process.writer.WriterFactory;

public class FactoryProducer {

	public static ProcessorAbstractFactory getFactory(String factoryName) {
		if (factoryName.equals("READER_FACTORY")) {
			return new ReaderFactory();
		} else if (factoryName.equals("WRITER_FACTORY")){
			return new WriterFactory();
		}
		return null;

	}
}
