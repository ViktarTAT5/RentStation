package by.htp.rentStation.domen;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
	private List<Unit> units;
	

	public Catalog() {
		units = new ArrayList<Unit>();
	}
	
	public void add(Unit unit){
		units.add(unit);
	}

	public List<Unit> getUnits() {
		ArrayList<Unit> temp = (ArrayList<Unit>)units;
		temp.trimToSize();
		return temp;
	}
	
	public void remove(Unit unit){
		units.remove(unit);
	}
	
	
	
}
