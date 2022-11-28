package com.nc.demos.model.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("cook")
public class Cook {
	
	public Fridge fridge;
	public String name;
	
	public Fridge getFridge() {
		return fridge;
	}
	
	@Autowired
	public void setFridge(Fridge fridge) {
		this.fridge = fridge;
	}
	
	public String getName() {
		return name;
	}
	
	@Value("#{prop.cookName}")
	public void setName(String name) {
		this.name = name;
	}
	
	public void greet() {
		Apple apple = fridge.getApple();
		System.out.println("Hello my name is "+name+" i took an "+apple+" from the "+ fridge +" please serve me this");
	}
	
	public void sayGoodBye() {
		System.out.println("Good Bye!!");
	}
}
