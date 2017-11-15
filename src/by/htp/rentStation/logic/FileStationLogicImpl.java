package by.htp.rentStation.logic;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import by.htp.rentStation.dao.CatalogDAO;
import by.htp.rentStation.dao.FactoryRentUnit;
import by.htp.rentStation.dao.FileCatalogDAOImpl;
import by.htp.rentStation.dao.ReaderFile;
import by.htp.rentStation.domen.Catalog;
import by.htp.rentStation.domen.Unit;

public class FileStationLogicImpl implements StationLogic {
	CatalogDAO dao;

	public FileStationLogicImpl() {
		dao = new FileCatalogDAOImpl();
	}

	@Override
	public void searchUnitById(int unitId) {
		Catalog catalog = dao.readCatalogUnit();
		Unit unit = null;
		for (Unit i : catalog.getUnits()) {
			if (i.getUnitId() == unitId) {
				unit = i;
				break;
			}
		}

		if (unit != null) {
			// order.addUnit(unit);
			dao.writeUnitInCatalogRentUnit(unit);
			catalog.remove(unit);
			dao.writeCatalogUnit(catalog);
			

		}
	}

}
