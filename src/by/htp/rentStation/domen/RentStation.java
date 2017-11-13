package by.htp.rentStation.domen;

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

	public void setCatalog(Catalog catalog) {
		this.catalog = catalog;
	}

	public Catalog getRentCatalog() {
		return rentCatalog;
	}

	public Unit searchUnitById(int unitId) {
		for (Unit i : catalog.getUnits()) {
			if (i.getUnitId() == unitId) {
				return i;
			}
		}
		return null;
	}

}
