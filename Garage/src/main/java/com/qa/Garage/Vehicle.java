package com.qa.Garage;

public abstract class Vehicle {

	private int noOfWheels;
	private String colour;
	private String name;
	private int id;
	
	
	public abstract void accelerate();
	public abstract void reverse();
	public abstract void brake();
	
	public Vehicle(int noOfWheels, String colour, String name,int id) {
		super();
		this.setNoOfWheels(noOfWheels);
		this.setColour(colour);
		this.setName(name);
		this.setId(id);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getNoOfWheels() {
		return noOfWheels;
	}
	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
public String toString() {
	return name +"\tID:" + id +"" + "\tColour:" + colour;
}
	
	
	
	
	
	
}
