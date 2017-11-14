package by.htp.rentStation.comand;

import by.htp.rentStation.comand.impl.DefoultActionImpl;
import by.htp.rentStation.comand.impl.RentUnitActionImpl;
import by.htp.rentStation.comand.impl.ViewCatalogActionIpml;
import by.htp.rentStation.comand.impl.ViewOrdersActionImpl;
import by.htp.rentStation.domen.RentStation;

public class CommandHendler {
	private RentStation station;

	public CommandHendler(RentStation station) {
		super();
		this.station = station;
	}

	public StationAction defineAction(int input) {
		StationAction action = new DefoultActionImpl();

		switch (input) {
		case 1:
			action = new ViewCatalogActionIpml(station.getCatalog());
			break;
		case 2:
			action = new ViewCatalogActionIpml(station.getRentCatalog());
			break;	
		case 3:
			action = new RentUnitActionImpl(station);
			break;
		case 4:
			action = new ViewOrdersActionImpl(station.getOrders());
			break;
		case 9:
			System.exit(0);
			break;	
		}
		return action;
	}
}
