package com.ctech.complexDataTypes;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class App {
	
	public static String[] vehicles = { "ambulance", "helicopter", "lifeboat" };

	public static String[][] drivers = { { "fred", "sue", "pete" }, { "sue", "richard", "bob", "fred" },
			{ "pete", "mary", "bob" } };

	public static void main(String[] args) {
		
		Map<String, Set<String>> personnel = new HashMap<>();
		
		for(int i=0; i<vehicles.length; i++) {
			String vehicle = vehicles[i];
			
			String[] driversList = drivers[i];
			
			Set<String> driverSet = new LinkedHashSet<>();
			
			for(String driver : driversList) {
				driverSet.add(driver);
			}
			personnel.put(vehicle, driverSet);
		}

		{
			Set<String> driversList = personnel.get("helicopter");

			for (String driver : driversList) {
				System.out.println(driver);
			}
		}
		
		for(String vehicle : personnel.keySet()) {
			System.out.print(vehicle + ": ");
			Set<String> driversList = personnel.get(vehicle);

			for (String driver : driversList) {
				System.out.print(driver + " ");
			}
			System.out.println();
		}
	}

}
