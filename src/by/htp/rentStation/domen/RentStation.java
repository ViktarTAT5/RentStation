package by.htp.rentStation.domen;

import java.util.ArrayList;
import java.util.List;

import by.htp.rentStation.logic.Order;

public class RentStation {
	private Catalog catalog;
	private Catalog rentCatalog;
	private List<Order> orders;

	public RentStation() {
		catalog = new Catalog();
		rentCatalog = new Catalog();
		orders = new ArrayList<Order>();
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
	
	public void setRentCatalog(Catalog catalog) {
		this.rentCatalog = catalog;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public Unit searchUnitById(int unitId) {
		for (Unit i : catalog.getUnits()) {
			if (i.getUnitId() == unitId) {
				return i;
			}
		}
		return null;
	}

	public void addOrder(Order order) {
		orders.add(order);
	}

}
