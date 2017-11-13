package by.htp.rentStation.logic;

import by.htp.rentStation.domen.Unit;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.GregorianCalendar;

import by.htp.rentStation.domen.RentUnit;

public class Order {

	private RentUnit rentUnit;
	private BigDecimal totalPrice;
	Calendar timeReturnRent;

	public Order() {
		rentUnit = new RentUnit();
		totalPrice = new BigDecimal(0);
	}

	public void addUnit(Unit unit) {
		if (unit != null) {
			if (rentUnit.add(unit)) {
				totalPrice = totalPrice.add(unit.getPrice());
			} else {
				// TODO
			}
		}
	}

	public void takeOrder(int hour) {
		if (hour > 0 & rentUnit.getCountEquipment() > 0) {
			timeReturnRent = new GregorianCalendar();
			timeReturnRent.add(Calendar.HOUR, hour);
		}
	}

}
