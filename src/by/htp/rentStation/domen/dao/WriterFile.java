package by.htp.rentStation.domen.dao;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriterFile {

	public static void writeList(String filePath, List<String> lines) {
		FileWriter writer = null;
			try {
				writer = new FileWriter(filePath, false);
				for (String line : lines) {
					writer.write(line);
				}
				writer.flush();
			} catch (IOException ex) {
				ex.printStackTrace();
			} finally {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	

	public static void write(String filePath, String line) {
		FileWriter writer = null;
		try {
			writer = new FileWriter(filePath, true);
			writer.write(line);
			writer.flush();
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
