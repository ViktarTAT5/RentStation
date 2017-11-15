package by.htp.rentStation.dao;

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

	public void writeCatalogUnit(Catalog catalog) {
		writeCatalog(catalog, FILE_PATH);
	}

	public void writeCatalogRentUnit(Catalog catalog) {
		writeCatalog(catalog, FILE_RENT_PATH);
	}

	private void writeCatalog(Catalog catalog, String filePath) {

		List<String> lines = new ArrayList<String>();

		for (Unit unit : catalog.getUnits()) {
			if (unit != null) {
				lines.add(unit.toStringFile());
			}
		}
		WriterFile.writeCatalog(filePath, lines);
	}

	@Override
	public void writeUnitInCatalogUnit(Unit unit) {
		WriterFile.writeLine(FILE_PATH, unit.toStringFile());
		
	}

	@Override
	public void writeUnitInCatalogRentUnit(Unit unit) {
		WriterFile.writeLine(FILE_RENT_PATH, unit.toStringFile());
		
	}

}
