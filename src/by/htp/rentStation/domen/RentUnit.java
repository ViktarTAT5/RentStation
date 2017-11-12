package by.htp.rentStation.domen;

import java.util.ArrayList;
import java.util.List;

public class RentUnit {
	private static final int MAX_EQUIPMENT_COUNT = 3;

	
	private Equipment[] equipments;
	private List<Accessory> accessories;
	private int countEquipment;

	public RentUnit() {
		equipments = new Equipment[MAX_EQUIPMENT_COUNT];
		accessories = new ArrayList();
	}

	public Equipment[] getEquipments() {
		return equipments;
	}

	public void addEquipments(Equipment equipment) {
		equipments[countEquipment] = equipment;
		countEquipment++;
	}
	
	public void addAccessory(Accessory accessory) {
		accessories.add(accessory);
	}
	

}
