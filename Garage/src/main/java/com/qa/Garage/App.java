package com.qa.Garage;

public class App {
	public static void main(String[] args) {

		Garage jim = new Garage();

		SportsCar ferrari = new SportsCar("Ferrari",11, "wide", 4, "red");
		Motorbike harley = new Motorbike("Harley",21, "black", 2, "black");
		Plane boeing = new Plane("Boeing",31, "white", 2, 10);
		
		jim.carAdding(ferrari);
		jim.carAdding(harley);
		jim.carAdding(boeing);

		System.out.println("Remove by name:");
		jim.listVehicles();
		jim.carRemoveName(jim.carRegistry, "Ferrari");
		jim.listVehicles();
		System.out.println("Remove by ID:");
		jim.carRemovebyId(jim.carRegistry,21);
		jim.listVehicles();
		System.out.println("Removing all remaining vehicles:");
		jim.EmptyGarage();
		jim.listVehicles();
		
		System.out.println();
		
		System.out.println("Adding vehicles back:");
		jim.carAdding(boeing);
		jim.carAdding(harley);
		jim.carAdding(ferrari);
		
		jim.listVehicles();
		
		
		jim.Billcalculator();
		
		
		
		
		

		
		
		
		
	}
	
	
	
	
}
