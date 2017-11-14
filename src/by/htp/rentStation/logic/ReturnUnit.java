package by.htp.rentStation.logic;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ReturnUnit {
	
	public void closseOrder(Order order){
		BigDecimal price;// = new BigDecimal("0");
		Calendar realTime = (GregorianCalendar) GregorianCalendar.getInstance();
		
		if(realTime.get(Calendar.HOUR) > order.getTimeReturnRent().get(Calendar.HOUR)){
			
		} else {
			price = order.getTotalPrice().multiply(order.getTimeRent());
		}
	}
}
