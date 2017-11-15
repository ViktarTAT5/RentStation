package by.htp.rentStation.comand.impl;

import java.util.List;

import by.htp.rentStation.comand.StationAction;
import by.htp.rentStation.dao.CatalogDAO;
import by.htp.rentStation.dao.FileCatalogDAOImpl;
import by.htp.rentStation.domen.Catalog;
import by.htp.rentStation.domen.Unit;
import by.htp.rentStation.util.Print;

public class ViewCatalogActionIpml implements StationAction {
	private CatalogDAO dao;
	
	public ViewCatalogActionIpml(){
		dao = new FileCatalogDAOImpl();
	}
	
	@Override
	public void performAction() {
		Catalog catalog = dao.readCatalogUnit();
		List<Unit> units = catalog.getUnits();
		Print.print("------");
		for(Unit unit : units){
			Print.print(unit);
		}
		Print.print("------");
	}

}
