package by.htp.rentStation.logic;

import by.htp.rentStation.domen.Unit;

import java.math.BigDecimal;

import by.htp.rentStation.domen.RentUnit;

public class Order {
	
	private RentUnit rentUnit;
	private BigDecimal totalPrice;
	
	public Order(){
		rentUnit = new RentUnit();
		totalPrice = new BigDecimal(0);
	}
	
	public void addUnit(Unit unit){
		if(unit != null){
			if(rentUnit.add(unit)){
				totalPrice = totalPrice.add(unit.getPrice());
			} else {
				//TODO
			}
		}
	}

}
