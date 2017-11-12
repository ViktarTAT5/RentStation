package by.htp.rentStation.domen;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
	private List<Equipment> equipments;
	private List<Accessory> accessories;

	public Catalog() {
		equipments = new ArrayList<Equipment>();
		accessories = new ArrayList<Accessory>();
	}
	
	public void add(Equipment equipment){
		equipments.add(equipment);
	}
	
	public void add(Accessory accessory){
		accessories.add(accessory);
	}
	
}
