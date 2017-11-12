package by.htp.rentStation.domen;

import java.util.ArrayList;
import java.util.List;

public class RentStation {
	private Catalog catalog;
	private Catalog rentCatalog;

	public RentStation() {
		catalog = new Catalog();
		rentCatalog = new Catalog();
	}

	public Catalog getCatalog() {
		return catalog;
	}

	public Catalog getRentCatalog() {
		return rentCatalog;
	}

}
