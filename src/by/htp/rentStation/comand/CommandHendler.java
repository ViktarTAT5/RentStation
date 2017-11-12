package by.htp.rentStation.comand;



public class CommandHendler {
	public static StationAction defineAction(int input){
		StationAction sa = new DefoultActionImpl();
		
		switch(input){
		case 1:
			sa = new ViewCatalogActionImpl();
			break;
		
		}
		return sa;
	}
}
