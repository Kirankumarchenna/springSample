package com.nc.demos.model.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("fridge")
public class Fridge {
	
	public Apple apple;
	
	@Autowired
	public void setApple(Apple apple) {
		this.apple = apple;
	}
	
	public Apple getApple() {
		return apple;
	}
	
	public String toString() {
		return "Fridge";
	}

}
