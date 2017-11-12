package by.htp.rentStation.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {

	public static void printMenu(){
		System.out.println("1. viev catalog");
		System.out.println("2. do smth");
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
