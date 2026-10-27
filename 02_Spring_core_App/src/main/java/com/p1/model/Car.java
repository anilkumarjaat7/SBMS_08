package com.p1.model;

import com.p1.entity.Engine;

public class Car {
	
	Engine eng;

	public Car(Engine eng) {
		super();
		this.eng = eng;
		System.out.println("param cont in car");
	}

	public Car() {
		super();
	System.out.println("def constv car class");	
		
	}

	public Engine getEng() {
		return eng;
	}

	public void setEng(Engine eng) {
		this.eng = eng;
	}
	
	
	public void drive() {
	  int a =  eng.Start();
	  if(a >= 1) {
		  System.out.println("You can drive");
	  }else {
		  System.out.println("you can't drive");
	  }
	}
	
	

}
