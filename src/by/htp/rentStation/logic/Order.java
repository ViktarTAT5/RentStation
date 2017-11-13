package by.htp.rentStation.logic;

import by.htp.rentStation.domen.Unit;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.GregorianCalendar;

import by.htp.rentStation.domen.RentUnit;

public class Order {

	private RentUnit rentUnit;
	private BigDecimal totalPriceHour;
	private Calendar timeReturnRent;

	public Order() {
		rentUnit = new RentUnit();
		totalPriceHour = new BigDecimal(0);
	}
	
	public RentUnit getRentUnit() {
		return rentUnit;
	}

	public void setRentUnit(RentUnit rentUnit) {
		this.rentUnit = rentUnit;
	}

	public BigDecimal getTotalPrice() {
		return totalPriceHour;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPriceHour = totalPrice;
	}

	public Calendar getTimeReturnRent() {
		return timeReturnRent;
	}

	public void setTimeReturnRent(Calendar timeReturnRent) {
		this.timeReturnRent = timeReturnRent;
	}

	public boolean addUnit(Unit unit) {
		if (unit != null) {
			if (rentUnit.add(unit)) {
				totalPriceHour = totalPriceHour.add(unit.getPrice());
				return true;
			}
		}
		return false;
	}

	public void takeOrder(int hour) {
		if (hour > 0 ) { //
			timeReturnRent = GregorianCalendar.getInstance();
			timeReturnRent.add(Calendar.HOUR, hour);
		}
	}

}
