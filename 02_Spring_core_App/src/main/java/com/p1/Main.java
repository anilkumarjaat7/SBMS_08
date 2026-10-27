package com.p1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.p1.model.Car;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext context =   new ClassPathXmlApplicationContext("Beans.xml");
		
		
		Car c = context.getBean(Car.class);
		c.drive();
	}

}
