package by.htp.rentStation.logic;


import by.htp.rentStation.dao.UnitDAO;
import by.htp.rentStation.dao.UnitDAOImpl;

import by.htp.rentStation.entity.Unit;

public class FileStationLogicImpl implements StationLogic {

	@Override
	public void rentUnit(int unitId) {
		UnitDAO udao = new UnitDAOImpl();
		Unit unit = udao.searchUnitById(unitId);
		udao.removeUnitCatalog(unit);
	}
}
