package by.htp.rentStation.domen;

public class RentUnit {
	private static final int EQUIPMENT_SIZE = 3;
	
	private Equipment[] equipments;
	private  int countEquipment;
	
	
	{
		equipments = new Equipment[EQUIPMENT_SIZE];
	}


	public Equipment[] getEquipments() {
		return equipments;
	}


	public void setEquipments(Equipment equipment, int index) {
		equipments[index] = equipment;
	}


	public int getCountEquipment() {
		return countEquipment;
	}


	public void setCountEquipment(int countEquipment) {
		this.countEquipment = countEquipment;
	}

	
	
	
}
