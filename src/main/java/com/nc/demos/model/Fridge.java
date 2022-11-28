package com.nc.demos.model;

public class Fridge {
	
	private Apple apple;
	
	public void setApple(Apple apple) {
		this.apple = apple;
	}
	
	public Apple getApple() {
		return apple;
		
	}

	public void init() {
		System.out.println("Power on " + this);
	}
	
	public String toString() {
		return "Fridge #1";
	}

}
