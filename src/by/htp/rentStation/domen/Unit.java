package by.htp.rentStation.domen;

import java.math.BigDecimal;

public abstract class Unit {
	private int unitId;
	private String title;
	private Category category;
	private BigDecimal price;

	public Unit() {

	}

	public Unit(int equipmentId, String title, Category category, String price) {
		super();
		this.unitId = equipmentId;
		this.title = title;
		this.category = category;
		this.price = new BigDecimal(price);
	}

	public int getUnitId() {
		return unitId;
	}

	public String getTitle() {
		return title;
	}

	public Category getCategory() {
		return category;
	}

	public BigDecimal getPrice() {
		return price;
	}
	
	public abstract int incrementCounter(int counter);

	public abstract int decreaseCounter(int counter);

	@Override
	public String toString() {
		return " Id=" + unitId + ", title=" + title + ", category=" + category + ", price=" + price;
	}
	
	

}
