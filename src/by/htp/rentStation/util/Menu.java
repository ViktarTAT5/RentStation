package by.htp.rentStation.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {

	public static void printMenu(){
		Print.print("1. viev catalog");
		Print.print("2. to rent");
		Print.print("3. viev orders");
		Print.print("9. do smth");
	}
	
	public static void printMenuOder(){
		Print.print("Enter id unit:");
		Print.print(" OR 9 validate order");
	}
	
	public static int readConsole() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp = br.readLine();
		return convertInt(temp);
	}
	
	private static int convertInt(String temp){
		int x = Integer.parseInt(temp);
		return x;
	}
}
