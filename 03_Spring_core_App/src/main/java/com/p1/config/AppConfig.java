package com.p1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.p1.entity.DesigleEngine;
import com.p1.entity.Engine;
import com.p1.entity.PatrolEngine;
import com.p1.model.Car;

@Configuration
public class AppConfig {
	
	@Bean
	public Engine Pat() {
		return new PatrolEngine();
	}
	
	@Bean
	public Engine des() {
		return new DesigleEngine();
	}
	
	@Bean
//   @Scope("singleton")
	@Scope("prototype")
	public Car car() {
//		return new Car(Pat());
		
		Car car = new Car();
		car.setEng(Pat());
		return car;
	}



}
