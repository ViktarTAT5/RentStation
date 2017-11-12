package by.htp.rentStation.domen;

import java.math.BigDecimal;

public abstract class Accessory extends Unit {

	public Accessory() {

	}

	public Accessory(int equipmentId, String title, Category category, BigDecimal price) {
		super(equipmentId, title, category, price);
	}

	public int incrementCounter(int counter) {
		return counter;
	}

	public int decreaseCounter(int counter) {
		return counter;
	}

}
