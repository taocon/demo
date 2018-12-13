package com.qa.Garage;

public class SportsCar extends Vehicle {

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

	private String spoilerWidth;

	public SportsCar(String name,int id, String spoilerWidth, int noOfWheels, String colour) {
		super(noOfWheels, colour, name,id);
		this.spoilerWidth = spoilerWidth;
		

	}

}
