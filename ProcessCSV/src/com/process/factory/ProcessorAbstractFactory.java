package com.process.factory;

import com.process.reader.Reader;
import com.process.writer.Writer;

public abstract class ProcessorAbstractFactory {

	public abstract Reader getReader(String readerType);
	
	public abstract Writer getWriter(String writerType);
	
}
