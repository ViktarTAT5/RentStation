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
		
		Print.print("" + ren.add(eq1));
		Print.print("" + ren.add(eq2));
		Print.print("" + ren.add(eq3));
		Print.print("" + ren.add(eq4));
		Print.print("" + ren.add(h1));
		Print.print("" + ren.add(h2));
		
		Print.print("" + ren.remove(h1));
		Print.print("" + ren.remove(eq1));
		
	}
}
