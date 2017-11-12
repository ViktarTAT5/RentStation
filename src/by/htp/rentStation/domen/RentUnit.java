package by.htp.rentStation.domen;

import java.util.ArrayList;
import java.util.List;

public class RentUnit {
	private static final int MAX_EQUIPMENT_COUNT = 3;

	private List<CaunterEquipment> units;
	private int countEquipment;

	public RentUnit() {
		units = new ArrayList<CaunterEquipment>();
	}


	public boolean addEquipments(CaunterEquipment unit) {
		if(unit != null){
			countEquipment = unit.count(countEquipment);
			if(countEquipment <= MAX_EQUIPMENT_COUNT){
				units.add(unit);
				return true;
			} else {
				countEquipment--;
			}
		}
		return false;
	}
	

	
	
	
}
