package com.car;

public class Truck extends Car{

	public Truck() {
		
	}
	
	public Truck(String color) {
	
	}
	
	public void accelPedal() {
		setSpeed(getSpeed()+5);
		System.out.println("속도가 올라갑니다.");
	}
	
	public void breakPedal() {
		 
	}
	
	public String toString() {
		return "dd";
	}
	
}
