package by.htp.rentStation.domen;

public abstract class Accessory implements CaunterEquipment {
	private int equipmentId;
	private String title;
	private Category category;
	private double price;

	public Accessory() {

	}

	public Accessory(int equipmentId, String title, Category category, double price) {
		this.equipmentId = equipmentId;
		this.title = title;
		this.category = category;
		this.price = price;
	}

	public int getEquipmentId() {
		return equipmentId;
	}

	public void setEquipmentId(int equipmentId) {
		this.equipmentId = equipmentId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public int incrementCounter(int counter){
		return counter;
	}
	
	public int decreaseCounter(int counter){
		return counter;
	}

}
