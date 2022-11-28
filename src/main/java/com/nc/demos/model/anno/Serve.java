package com.nc.demos.model.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("serve")
public class Serve {

	public Cook cook;
	
	public Cook getCook() {
		return cook;
	}
	
	@Autowired
	public void setCook(Cook cook) {
		this.cook= cook;
	}
	
	public String message() {
		Apple apple = cook.fridge.getApple();
		String name = cook.getName();
		return "Your dish of "+ apple + " of weight are ready Mr."+name;
	}
}
