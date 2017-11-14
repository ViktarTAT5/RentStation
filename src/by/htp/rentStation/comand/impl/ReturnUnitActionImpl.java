package by.htp.rentStation.comand.impl;

import by.htp.rentStation.comand.StationAction;
import by.htp.rentStation.domen.RentStation;
import by.htp.rentStation.domen.Unit;
import by.htp.rentStation.logic.Order;
import by.htp.rentStation.util.Menu;
import by.htp.rentStation.util.Print;

public class ReturnUnitActionImpl implements StationAction {
	private RentStation station;
	
	public ReturnUnitActionImpl(RentStation station){
		this.station = station;
	}

	@Override
	public void performAction() {
		Print.print("Enter id unit");
		int orderId = Menu.readConsole();
		Order order = station.searchOrderById(orderId);
		
	}

}
