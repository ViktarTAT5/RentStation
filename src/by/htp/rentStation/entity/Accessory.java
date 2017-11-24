package by.htp.rentStation.entity;



public abstract class Accessory extends Unit {

	public Accessory() {

	}

	public Accessory(int equipmentId, String title, Category category, String price) {
		super(equipmentId, title, category, price);
	}

	public int incrementCounter(int counter) {
		return counter;
	}

	public int decreaseCounter(int counter) {
		return counter;
	}

}
