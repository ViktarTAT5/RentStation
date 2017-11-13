package by.htp.rentStation.domen.accessory;

import java.math.BigDecimal;

import by.htp.rentStation.domen.Accessory;
import by.htp.rentStation.domen.Category;

public class Helmet extends Accessory {

	public Helmet() {

	}

	public Helmet(int equipmentId, String title, Category category, String price) {
		super(equipmentId, title, category, price);
	}

}
