package com.nc.demos.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nc.demos.model.anno.Cook;
import com.nc.demos.model.anno.Serve;

public class Application {
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread();
		ApplicationContext context = new ClassPathXmlApplicationContext("appAnno.xml");
		Cook cook = context.getBean("cook", Cook.class);
		Serve serve = context.getBean("serve", Serve.class);
		thread.start();
		cook.greet();
		Thread.sleep(2000);
		String message = serve.message();
		for(char ch: message.toCharArray()) {
			Thread.sleep(200);
			System.out.print(ch);
		}
	}
}
