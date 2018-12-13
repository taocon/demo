package com.qa.Garage;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Garage {

	public List<Vehicle> carRegistry = new ArrayList<>();

	public void listVehicles() {

		carRegistry.stream().forEach(System.out::println);

	}

	public void carAdding(Vehicle vehicle) {
		carRegistry.add(vehicle);
	}

	// public void carRemoving(Vehicle vehicle) {
	// carRegistry.remove(vehicle);
	// }

	// public void carAddName(ArrayList<Vehicle> carRegistry, String name) {
	// carRegistry.stream().filter(n -> n.getName().equals(name)).forEach(vehicle ->
	// carRegistry.add(vehicle));
	// }

	public void carSearchName(String name) {
		carRegistry.stream().filter(n -> n.getName().equals(name)).forEach(System.out::println);

	}

	public void carRemoveName(List<Vehicle> carRegistry, String name) {
		List<Vehicle> list = carRegistry.stream().filter(n -> n.getName().equals(name)).collect(Collectors.toList());// .forEach(vehicle
																														// ->
																														// carRegistry.remove(vehicle));
		carRegistry.removeAll(list);
	}

	public void carRemoveByType(List<Vehicle> carRegistry, String name) {
		for (Vehicle v : carRegistry) {
			if (v instanceof SportsCar) {
				carRegistry.remove(v);

			}
			if (v instanceof Motorbike) {
				carRegistry.remove(v);

			}
			if (v instanceof Plane) {
				carRegistry.remove(v);

			}

		}

	}

	public void carRemovebyId(List<Vehicle> carRegistry, int id) {

		List<Vehicle> list = carRegistry.stream().filter(n -> n.getId() == (id)).collect(Collectors.toList());
		carRegistry.removeAll(list);

	}

	public void EmptyGarage() {
		carRegistry.clear();
	}

	public void Billcalculator() {
		int totalCost = 0;
		
		for (Vehicle vehicle : carRegistry) {

			if (vehicle instanceof SportsCar) {
				totalCost += 20000;
			}

			if (vehicle instanceof Motorbike) {
				totalCost += 12000;
			}
			if (vehicle instanceof Plane) {
				totalCost += 100000;
			}
			
		}

		System.out.println("The total bill is: " + totalCost );
		
	}

}
