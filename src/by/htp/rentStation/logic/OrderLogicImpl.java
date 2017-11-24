package by.htp.rentStation.logic;

import by.htp.rentStation.dao.UnitDAO;
import by.htp.rentStation.dao.UnitDAOImpl;
import by.htp.rentStation.entity.Order;
import by.htp.rentStation.entity.RentUnit;
import by.htp.rentStation.entity.Unit;
import static by.htp.rentStation.util.Constant.*;

public class OrderLogicImpl implements OrderLogic {
	private Order order;

	public void createOrder() {
		order = new Order();
	}

	@Override
	public void rentUnit(int unitId) {
		UnitDAO udao = new UnitDAOImpl();
		Unit unit = udao.searchUnitById(unitId);
		addUnitOrder(unit);
		// udao.removeUnitCatalog(unit);
	}

	private boolean addUnitOrder(Unit unit) {
		if (addUnitInRentUnit(unit, order.getRentUnit())) {
			order.setTotalPrice(order.getTotalPrice().add(unit.getPrice()));
			return true;
		}
		return false;
	}

	private static boolean addUnitInRentUnit(Unit unit, RentUnit rentUnit) {
		if (unit != null) {
			int countEquipment = rentUnit.getCountEquipment();
			countEquipment = unit.incrementCounter(countEquipment);
			if (countEquipment <= MAX_EQUIPMENT_COUNT) {
				rentUnit.getUnits().add(unit);
				return true;
			}
		}
		return false;
	}
	
	public void 
}
