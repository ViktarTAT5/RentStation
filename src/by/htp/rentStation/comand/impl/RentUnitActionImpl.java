package by.htp.rentStation.comand.impl;

import by.htp.rentStation.comand.StationAction;
import by.htp.rentStation.domen.RentStation;
import by.htp.rentStation.domen.Unit;
import by.htp.rentStation.logic.Order;
import by.htp.rentStation.util.Menu;
import by.htp.rentStation.util.Print;

public class RentUnitActionImpl implements StationAction {
	private RentStation station;
	private Order order;

	public RentUnitActionImpl(RentStation station) {
		this.station = station;
		order = new Order();
	}

	@Override
	public void performAction() {
		Print.print("Enter id unit");
		int unitId = Menu.readConsole();
		Unit unit = station.searchUnitById(unitId);
		moveUnit(unit);
		do {
			Menu.printMenuOder();
		} while ((unitId = Menu.readConsole()) != 9);
		Print.print("Enter rental time");
		int hour = Menu.readConsole();
		order.takeOrder(hour);
		station.addOrder(order);
		Print.print("order id= " + order.getOrderId());
	}

	private void moveUnit(Unit unit) {
		if (unit != null) {
			order.addUnit(unit);
			station.getCatalog().remove(unit);
			station.getRentCatalog().add(unit);
		}
	}
}
