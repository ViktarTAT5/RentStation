package by.htp.rentStation.domen;

import java.util.ArrayList;
import java.util.List;

public class RentStation {
	private List<Equipment> equipments;
	private List<Accessory> accessories;

	public RentStation(){
		equipments = new ArrayList();
		accessories = new ArrayList();
	}

	public List<Equipment> getEquipments() {
		return equipments;
	}

	public void setEquipments(List<Equipment> equipments) {
		this.equipments = equipments;
	}

	public List<Accessory> getAccessories() {
		return accessories;
	}

	public void setAccessories(List<Accessory> accessories) {
		this.accessories = accessories;
	}

}
