package by.htp.rentStation.launcher;

import java.io.IOException;


import by.htp.rentStation.comand.CommandHendler;
import by.htp.rentStation.comand.StationAction;
import by.htp.rentStation.domen.Accessory;
import by.htp.rentStation.domen.Catalog;
import by.htp.rentStation.domen.Category;
import by.htp.rentStation.domen.Equipment;
import by.htp.rentStation.domen.RentStation;
import by.htp.rentStation.domen.accessory.Helmet;
import by.htp.rentStation.domen.equipment.Bike;
import by.htp.rentStation.util.Menu;



public class Main {
	public static void main(String[] args) throws IOException{
//		Equipment eq1 = new Bike(111, "aist", Category.SUMMER, "5");
//		Equipment eq2 = new Bike(112, "aist2", Category.SUMMER, "5");
//		Equipment eq3 = new Bike(113, "orlik", Category.SUMMER, "3.5");
//		Equipment eq4 = new Bike(114, "orlik", Category.SUMMER, "3.5");
//		Accessory h1 = new Helmet(211, "h1", Category.SUMMER, "2");
//		Accessory h2 = new Helmet(212, "h2", Category.SUMMER, "1.5");
//		Accessory h3 = new Helmet(213, "h3", Category.SUMMER, "2");
//		
//		Catalog catalog = new Catalog();
//		catalog.add(eq1);
//		catalog.add(eq2);
//		catalog.add(eq3);
//		catalog.add(eq4);
//		catalog.add(h1);
//		catalog.add(h2);
//		catalog.add(h3);
		StartProgram start = new StartProgram();
		RentStation station = start.start();
		
			
		Menu.printMenu();
		CommandHendler hendler = new CommandHendler(station);
		StationAction action = hendler.defineAction(Menu.readConsole());
		action.performAction();
		
		Menu.printMenu();
		hendler = new CommandHendler(station);
		action = hendler.defineAction(Menu.readConsole());
		action.performAction();
		
	}
}
