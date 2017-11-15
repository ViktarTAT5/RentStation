package by.htp.rentStation.domen.dao;

import java.util.ArrayList;
import java.util.List;

import by.htp.rentStation.domen.Catalog;
import by.htp.rentStation.domen.Unit;

public class FileCatalogDAOImpl implements CatalogDAO {
	private static final String FILE_PATH = "C:\\Users\\VIKTAR\\eclipse-workspace\\RentStation\\source\\unit.txt";
	private static final String FILE_RENT_PATH = "C:\\Users\\VIKTAR\\eclipse-workspace\\RentStation\\source\\unitRent.txt";
	private static final String DELIMETER = ",";

	@Override
	public Catalog readCatalogUnit() {
		return readCatalog(FILE_PATH);
	}

	@Override
	public Catalog readCatalogRentUnit() {
		return readCatalog(FILE_RENT_PATH);
	}
	
	private Catalog readCatalog(String filePath) {
		Catalog catalog = new Catalog();
		List<String> lines = ReaderFile.readerList(filePath);

		for (String line : lines) {
			if (line != null) {
				catalog.add(FactoryRentUnit.createUnit(line, DELIMETER));
			}
		}
		return catalog;
	}

	private void writeCatalog(Catalog catalog, String filePath) {

		List<String> lines = new ArrayList<String>();

		for (Unit unit : catalog.getUnits()) {
			if (unit != null) {
				lines.add(unit.toStringFile());
			}
		}
		WriterFile.writeList(filePath, lines);
	}

	
}
