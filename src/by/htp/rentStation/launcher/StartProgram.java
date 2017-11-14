package by.htp.rentStation.launcher;

import by.htp.rentStation.domen.Catalog;
import by.htp.rentStation.domen.RentStation;
import by.htp.rentStation.logic.FileStationLogicImpl;
import by.htp.rentStation.logic.StationLogic;

public class StartProgram {
	private static final String FILE_PATH = "C:\\Users\\VIKTAR\\eclipse-workspace\\RentStation\\source\\unit.txt";
	private static final String FILE_RENT_PATH = "C:\\Users\\VIKTAR\\eclipse-workspace\\RentStation\\source\\unitRent.txt";
	private StationLogic logic;
	
	public  RentStation start(){
		Catalog catalog;
		RentStation station = new RentStation();
		
		logic = new FileStationLogicImpl(FILE_PATH);
		catalog = logic.readCatalog();
		station.setCatalog(catalog);
		
		logic = new FileStationLogicImpl(FILE_RENT_PATH);
		catalog = logic.readCatalog();
		station.setRentCatalog(catalog);
		
		return station;
	}
}
