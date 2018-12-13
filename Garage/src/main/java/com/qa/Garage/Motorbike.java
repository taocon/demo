package com.qa.Garage;

public class Motorbike extends Vehicle {

	private String bikeStandColour;

	public Motorbike(String name,int id, String bikeStandColour, int noOfWheels, String colour) {
		super(noOfWheels, colour, name,id);
		this.bikeStandColour = bikeStandColour;

	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub

	}

	@Override
	public void reverse() {
		// TODO Auto-generated method stub

	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub

	}
	
	
}
