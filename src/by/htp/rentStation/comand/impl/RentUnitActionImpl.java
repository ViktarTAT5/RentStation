package by.htp.rentStation.comand.impl;

import java.io.IOException;

import by.htp.rentStation.comand.StationAction;
import by.htp.rentStation.domen.RentStation;
import by.htp.rentStation.domen.Unit;
import by.htp.rentStation.logic.Order;
import by.htp.rentStation.util.Menu;
import by.htp.rentStation.util.Print;

public class RentUnitActionImpl implements StationAction {
	private RentStation station;

	public RentUnitActionImpl(RentStation station) {
		this.station = station;
	}

	@Override
	public void performAction() throws IOException {
		Order oder = new Order();
		Print.print("Enter id unit");
		int unitId = Menu.readConsole();
		Unit unit = station.searchUnitById(unitId);
		if (unit != null) {
			oder.addUnit(unit);
		}
System.out.println();
	}

}
