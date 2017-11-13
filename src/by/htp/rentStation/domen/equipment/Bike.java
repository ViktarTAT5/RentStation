package by.htp.rentStation.domen.equipment;

import java.math.BigDecimal;

import by.htp.rentStation.domen.Category;
import by.htp.rentStation.domen.Equipment;

public class Bike extends Equipment {

	public Bike() {
	
	}

	public Bike(int equipmentId, String title, Category category, String price) {
		super(equipmentId, title, category, price);
	}
	
}
