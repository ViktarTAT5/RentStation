package by.htp.rentStation.comand.impl;

import java.util.List;

import by.htp.rentStation.comand.StationAction;
import by.htp.rentStation.domen.Catalog;
import by.htp.rentStation.domen.Unit;
import by.htp.rentStation.util.Print;

public class ViewCatalogActionIpml implements StationAction {
	private Catalog catalog;
	
	public ViewCatalogActionIpml(Catalog catalog){
		this.catalog = catalog;
	}
	
	@Override
	public void performAction() {
		List<Unit> units = catalog.getUnits();
		Print.print("------");
		for(Unit unit : units){
			Print.print(unit);
		}
		Print.print("------");
	}

}
