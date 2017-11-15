package by.htp.rentStation.domen.dao;

import java.util.List;

import by.htp.rentStation.domen.Catalog;

public class FileCatalogDAOImpl implements CatalogDAO {
	private static final String FILE_PATH = "C:\\Users\\VIKTAR\\eclipse-workspace\\RentStation\\source\\unit.txt";
	private static final String DELIMETER = ",";

	@Override
	public Catalog readCatalog() {
		Catalog catalog = new Catalog();
		List<String> lines = ReaderFile.readerList(FILE_PATH);

		for (String line : lines) {
			if (line != null) {
				catalog.add(FactoryRentUnit.createUnit(line, DELIMETER));
			}
		}
		return catalog;
	}
	
	public void writeCatalog(Catalog catalog) {
		
		List<String> lines = ReaderFile.readerList(FILE_PATH);

		for (String line : lines) {
			if (line != null) {
				catalog.add(FactoryRentUnit.createUnit(line, DELIMETER));
			}
		}
		
	}

}
