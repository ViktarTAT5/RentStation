package by.htp.rentStation.comand.impl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Formatter;
import java.util.List;

import by.htp.rentStation.comand.StationAction;
import by.htp.rentStation.logic.Order;
import by.htp.rentStation.util.Print;

public class ViewOrdersActionImpl implements StationAction {
	private List<Order> orders;

	public ViewOrdersActionImpl(List<Order> orders) {
		this.orders = orders;
	}

	@Override
	public void performAction() throws FileNotFoundException, IOException {
		Formatter f = new Formatter();
		for (Order i : orders) {
			if (i != null) {

				Print.print("-----------");
				f.format("%tl:%tM", i.getTimeReturnRent(), i.getTimeReturnRent());
				Print.print("time return: " + f);
				Print.print("total price per hour: " + i.getTotalPrice());
			}
		}
	}

}
