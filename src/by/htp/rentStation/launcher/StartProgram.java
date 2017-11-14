package by.htp.rentStation.launcher;

import by.htp.rentStation.domen.Catalog;
import by.htp.rentStation.domen.RentStation;
import by.htp.rentStation.logic.FileStationLogicImpl;
import by.htp.rentStation.logic.StationLogic;

public class StartProgram {
	private static final String FILE_PATH = "C:\\Users\\VIKTAR\\eclipse-workspace\\RentStation\\resourses\\unit.txt";
	private static final String FILE_RENT_PATH = "C:\\Users\\VIKTAR\\eclipse-workspace\\RentStation\\resourses\\unitRent.txt";
	private StationLogic logic;
	
	public  RentStation start(){
		RentStation station = new RentStation();
		logic = new FileStationLogicImpl(FILE_PATH);
		Catalog catalog = new Catalog();
		catalog = logic.readCatalog();
		station.setCatalog(catalog);
		
		logic = new FileStationLogicImpl(FILE_RENT_PATH);
		catalog = new Catalog();
		station.setRentCatalog(catalog);
		
		return station;
	}
}
