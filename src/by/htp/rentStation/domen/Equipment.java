package by.htp.rentStation.domen;

public abstract class Equipment implements CaunterEquipment{
	private int equipmentId;
	private String title;
	private Category category;
	private double price;

	public Equipment() {

	}

	public Equipment(int productId, String title, Category category, double price) {
		this.equipmentId = productId;
		this.title = title;
		this.category = category;
		this.price = price;
	}

	public int getProductId() {
		return equipmentId;
	}

	public void setProductId(int productId) {
		this.equipmentId = productId;
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
		counter++;
		return counter;
	}

	public int decreaseCounter(int counter){
		counter--;
		return counter;
	}
}
