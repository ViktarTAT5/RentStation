package by.htp.rentStation.launcher;

import by.htp.rentStation.domen.Accessory;
import by.htp.rentStation.domen.Equipment;
import by.htp.rentStation.domen.RentUnit;
import by.htp.rentStation.domen.accessory.Helmet;
import by.htp.rentStation.domen.equipment.Bike;
import by.htp.rentStation.util.Print;

public class Main {
	public static void main(String[] args){
		Equipment eq1 = new Bike();
		Equipment eq2 = new Bike();
		Equipment eq3 = new Bike();
		Equipment eq4 = new Bike();
		
		Accessory h1 = new Helmet();
		Accessory h2 = new Helmet();
		Accessory h3 = new Helmet();
		
		RentUnit ren = new RentUnit();
		
		Print.print("" + ren.addEquipments(eq1));
		Print.print("" + ren.addEquipments(eq2));
		Print.print("" + ren.addEquipments(eq3));
		Print.print("" + ren.addEquipments(eq4));
		Print.print("" + ren.addEquipments(h1));
		Print.print("" + ren.addEquipments(h2));
		
	}
}
