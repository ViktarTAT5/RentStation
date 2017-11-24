package by.htp.rentStation.comand.impl;

import by.htp.rentStation.comand.StationAction;
import by.htp.rentStation.entity.Order;
import by.htp.rentStation.entity.Unit;
import by.htp.rentStation.logic.OrderLogicImpl;
import by.htp.rentStation.util.Menu;
import by.htp.rentStation.util.Print;

public class RentUnitActionImpl implements StationAction {
	private Order order;

	public RentUnitActionImpl() {
		
		order = new Order();
	}

	@Override
	public void performAction() {
		Print.print("Enter id unit");
		int unitId = Menu.readConsole();
		OrderLogicImpl logic = new OrderLogicImpl();
		
		do{
			logic.rentUnit(unitId);
			//order.addUnit(unit);
			Menu.printMenuOder();
		} while ((unitId = Menu.readConsole()) != 9);
		Print.print("Enter rental time");
		//int hour = Menu.readConsole();
		//order.takeOrder(hour);
		//station.addOrder(order);
		//Print.print("order id= " + order.getOrderId());
	}

//	private void moveUnit(Unit unit) {
//		if (unit != null) {
//			order.addUnit(unit);
//			station.getCatalog().remove(unit);
//			station.getRentCatalog().add(unit);
//		}
//	}
}
