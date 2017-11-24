package by.htp.rentStation.logic;

import by.htp.rentStation.dao.CatalogDAO;
import by.htp.rentStation.dao.FileCatalogDAOImpl;
import by.htp.rentStation.entity.Catalog;
import by.htp.rentStation.entity.Unit;

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
			dao.writeUnitInCatalogRentUnit(unit);
			catalog.remove(unit);
			dao.writeCatalogUnit(catalog);

		}
	}

}
