package com.p1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.p1.config.AppConfig;
import com.p1.model.Car;

public class Main {
	public static void main(String[] args) {
		
//		ApplicationContext context =   new ClassPathXmlApplicationContext("Beans.xml");
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		Car c1 = context.getBean(Car.class);
		Car c2 = context.getBean(Car.class);
		
		System.out.println(c1 == c2);
//		c.drive();
		
		
		
//		bean Scope (sigleton)
//		prototype
//		request
//		session
	}

}
