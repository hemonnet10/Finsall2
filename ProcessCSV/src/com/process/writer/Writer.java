package com.process.writer;

import java.util.List;

import com.process.dto.OutputDTO;

public interface Writer {

	public void writeEmployee(List<OutputDTO> map);
}
