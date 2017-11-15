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

	@Override
	public String toString() {
		return "Helmet " + super.toString();
	}
	
	@Override
	public String toStringFile() {
		return "Helmet, " + getUnitId() + ", " + getTitle() + ", " + getCategory() + ", " + getPrice() + "/n";
	}

}
