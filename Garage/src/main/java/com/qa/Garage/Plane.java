package com.qa.Garage;

public class Plane extends Vehicle {

	private int wingWidth;

	public Plane(String name,int id, String colour, int noOfWheels, int wingWidth) {
		super(noOfWheels, colour, name,id);
		this.wingWidth = wingWidth;

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
