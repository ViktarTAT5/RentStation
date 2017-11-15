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
import by.htp.rentStation.domen.dao.WriterFile;
import by.htp.rentStation.domen.equipment.Bike;
import by.htp.rentStation.util.Menu;



public class Main {
	public static void main(String[] args) throws IOException{

		StartProgram start = new StartProgram();
		RentStation station = start.start();
		
		work(station);
		//TODO del ||
        //         \/		
//		String filePath = "C:\\Users\\VIKTAR\\eclipse-workspace\\RentStation\\source\\unit.txt";
//		String st = "asdfa afafa afafa";
//		WriterFile.write(filePath, st);
		
	}
	
	private static void work(RentStation station){
		CommandHendler hendler = new CommandHendler(station);
		StationAction action;
		while(true){
			Menu.printMenu();
			action = hendler.defineAction(Menu.readConsole());
			action.performAction();
		}
	}
}
