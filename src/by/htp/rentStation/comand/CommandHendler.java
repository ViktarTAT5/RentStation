package by.htp.rentStation.comand;

import by.htp.rentStation.comand.impl.DefoultActionImpl;
import by.htp.rentStation.comand.impl.RentUnitActionImpl;
import by.htp.rentStation.domen.RentStation;

public class CommandHendler {
	private RentStation station;

	public CommandHendler(RentStation station) {
		super();
		this.station = station;
	}

	public StationAction defineAction(int input) {
		StationAction sa = new DefoultActionImpl();

		switch (input) {
		case 1:
			// sa = new ViewCatalogActionImpl();
			break;
		case 2:
			sa = new RentUnitActionImpl(station);

		}
		return sa;
	}
}
