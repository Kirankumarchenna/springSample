package com.nc.demos.model;

public class Apple {
	
	private final long weight;
	
	public Apple() {
		this.weight = Math.round(Math.random() * 150);
	}
	
	@Override
	public String toString() {
		return "Apple (" + weight + ") gm";
	}
	
}

