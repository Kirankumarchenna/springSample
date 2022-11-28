package com.nc.demos.model.anno;

import org.springframework.stereotype.Component;

@Component("apple")
public class Apple {
	public final long weight;
	public Apple() {
		this.weight = Math.round(Math.random() * 150);
	}
	
	public String toString() {
		return "Apple ("+ weight + ") gms";
	}
}
