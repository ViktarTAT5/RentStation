package by.htp.rentStation.logic;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import by.htp.rentStation.domen.Catalog;
import by.htp.rentStation.util.ReaderFile;

public class FileStationLogicImpl implements StationLogic {

	private String filePath; // = "C:\\Users\\VIKTAR\\eclipse-workspace\\RentStation\\resourses\\unit.txt";
	private static final String DELIMETER = ",";

	public FileStationLogicImpl(String filePath){
		this.filePath = filePath;
	}
	
	@Override
	public Catalog readCatalog() {
		Catalog catalog = new Catalog();
		List<String> lines = ReaderFile.readerList(filePath);

		for (String line : lines) {
			if (line != null) {
				catalog.add(FactoryRentUnit.createUnit(line, DELIMETER));
			}
		}

		return catalog;
	}

}
