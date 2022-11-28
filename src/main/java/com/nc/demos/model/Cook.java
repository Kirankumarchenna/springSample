package com.nc.demos.model;

public class Cook {
	
	private Fridge fridge;
	private String name;
	
	
	public Fridge getFridge() {
		return fridge;
	}
	
	public void setFridge(Fridge fridge) {
		this.fridge = fridge;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void greet() {
		Apple apple = fridge.getApple();
		System.out.println("Hello my name is "+name+", i have taken an apple " + apple + "from the "+ fridge);
	}
	
	public void sayGoodBye() {
		System.out.println("Bye then!");
	}
	
}
