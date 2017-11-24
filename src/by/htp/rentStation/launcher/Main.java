package by.htp.rentStation.launcher;

import by.htp.rentStation.comand.CommandHendler;
import by.htp.rentStation.comand.StationAction;
import by.htp.rentStation.entity.RentStation;
import by.htp.rentStation.util.Menu;

public class Main {
	public static void main(String[] args) {

//		StartProgram start = new StartProgram();
//		RentStation station = start.start();
		RentStation station = new RentStation();
		work(station);

	}

	private static void work(RentStation station) {
		CommandHendler hendler = new CommandHendler(station);
		StationAction action;
		while (true) {
			Menu.printMenu();
			action = hendler.defineAction(Menu.readConsole());
			action.performAction();
		}
	}
}
