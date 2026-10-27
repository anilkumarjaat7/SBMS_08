package com.p1;

import com.p1.entity.DesigleEngine;
import com.p1.entity.PatrolEngine;
import com.p1.model.Car;

public class Main {
	public static void main(String[] args) {
		
//		Car car = new Car(new PatrolEngine());
		Car car = new Car();
		car.setEng(new DesigleEngine());
		car.drive();
		
		
	}

}
