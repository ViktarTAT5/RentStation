package by.htp.rentStation.domen;

import java.math.BigDecimal;

public abstract class Equipment extends Unit {

	public Equipment() {

	}

	public Equipment(int equipmentId, String title, Category category, String price) {
		super(equipmentId, title, category, price);
	}

	public int incrementCounter(int counter) {
		counter++;
		return counter;
	}

	public int decreaseCounter(int counter) {
		counter--;
		return counter;
	}
}
