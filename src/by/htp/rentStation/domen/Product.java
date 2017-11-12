package by.htp.rentStation.domen;

import java.math.BigDecimal;

public abstract class Product {
	private int equipmentId;
	private String title;
	private Category category;
	private BigDecimal price;

	public Product() {

	}

	public Product(int equipmentId, String title, Category category, BigDecimal price) {
		super();
		this.equipmentId = equipmentId;
		this.title = title;
		this.category = category;
		this.price = price;
	}

	public int getEquipmentId() {
		return equipmentId;
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
	
	

}
