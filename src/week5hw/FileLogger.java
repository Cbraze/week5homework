package week5hw;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Date;

public class FileLogger implements logger{
	
	private BufferedWriter writer;
	
	public FileLogger() {
		
	}

	@Override
	public void log(String log) {
		Date date = new Date();
		try {
			writer.write("log: " + date.toString() + " - " + log);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void error(String error) {
		Date date = new Date();
		try {
			writer.write("Error: " + date.toString() + " - " + error);
			writer.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void close() {
		try {
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	

}
