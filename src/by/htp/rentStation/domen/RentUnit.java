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

	public boolean add(CaunterEquipment unit) {
		if (unit != null) {
			countEquipment = unit.incrementCounter(countEquipment);
			if (countEquipment <= MAX_EQUIPMENT_COUNT) {
				units.add(unit);
				return true;
			} else {
				countEquipment--;
			}
		}
		return false;
	}
	
	public boolean remove(CaunterEquipment unit){
		if (unit != null) {
			System.out.println(countEquipment);
			if(units.remove(unit)){
				
				countEquipment = unit.decreaseCounter(countEquipment);
				System.out.println(countEquipment);
				return true;
			}
		}
		return false;
	}

}
