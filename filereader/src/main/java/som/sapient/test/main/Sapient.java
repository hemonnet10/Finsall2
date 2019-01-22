package som.sapient.test.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.sapient.test.dao.AverageCountryIncome;
import com.sapient.test.dao.CountryIncome;
import com.sapient.test.data.FileType;
import com.sapient.test.factory.FileReaderFactory;
import com.sapient.test.factory.FileWriterFactory;
import com.sapient.test.service.Reader;
import com.sapient.test.service.Writer;
import com.sapient.test.util.AverageSalaryCalculator;

public class Sapient {

	public static void main(String[] args) {

		String inputPath = "C:\\Users\\Ashish\\Documents\\workspace-spring-tool-suite-4-4.0.0.RELEASE\\sapient-filereader\\src\\test\\resources\\sampleinput";
		String outputpath = "C:\\Users\\Ashish\\Documents\\workspace-spring-tool-suite-4-4.0.0.RELEASE\\sapient-filereader\\src\\test\\resources\\sampleinput";

		Reader reader = (Reader) FileReaderFactory.getFileReader(FileType.CSV);
		List<CountryIncome> countryIncomeList = new ArrayList<>();
		try {
			countryIncomeList = reader.read(inputPath);
		} catch (IOException e) {
			e.printStackTrace();
		}

		Writer fileWriterImpl = (Writer) FileWriterFactory.getFileWriter(FileType.CSV);
		String path = outputpath + new Date().getTime();

		System.out.println("File generated " + path);

		try {
			List<AverageCountryIncome> sortedAverageIncomeList = AverageSalaryCalculator
					.getSortedAverageIncomeList(countryIncomeList);
			fileWriterImpl.writer(sortedAverageIncomeList, path);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
