package by.htp.rentStation.logic;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import by.htp.rentStation.domen.Catalog;


public class FileStationLogicImpl implements StationLogic {

	private static final String FILE_PATH = "C:\\Users\\VIKTAR\\eclipse-workspace\\praktika\\resourses\\equipment.txt";
	private static final String DELIMETER = ",";

	@Override
	public Catalog readCatalog() {
		
		//TODO
		return new Catalog();
	}	

	

}
