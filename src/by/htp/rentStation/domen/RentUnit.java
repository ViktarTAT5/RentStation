package by.htp.rentStation.domen;

import java.util.ArrayList;
import java.util.List;

public class RentUnit {
	private static final int MAX_EQUIPMENT_COUNT = 3;

	private List<Unit> units;
	private int countEquipment;

	public RentUnit() {
		units = new ArrayList<>();
	}

	public boolean add(Unit unit) {
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

	public boolean remove(Unit unit) {
		if (unit != null) {
			if (units.remove(unit)) {
				countEquipment = unit.decreaseCounter(countEquipment);
				return true;
			}
		}
		return false;
	}

	public int getCountEquipment() {
		return countEquipment;
	}

	public List<Unit> getUnits() {
		return units;
	}

}
