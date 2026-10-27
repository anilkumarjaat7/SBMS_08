package com.p1.entity;

public class PatrolEngine implements Engine{
	
	public PatrolEngine() {
		super();
		System.out.println("patrol Engine obj Created");
	}

	public int Start() {
		System.out.println("Patrol  Engine Statr");
		return 1;
	}

}
