package com.car;

public class SportsCar extends Car {
	
	public SportsCar() {		// 기본 생성자
		//super(); 부모의 생성자가 굳이 명시하지 않아도 자동으로 생성된다. 
	}
	
	public SportsCar(String color) {
		super(color);			// 부모의 파라미터 1개짜리를 부른다.
	}
	
	// 오버라이딩 됐다. //재정의
	public void accelPedal() {
		// speed += 15; speed가 private라서 쓸 수 없다.
		// getter와 setter를 사용한다.
		setSpeed(getSpeed()+15);
		System.out.println("속도가 빠르게 올라갑니다.");
		
	}
	// 오버라이딩 됐다. //재정의
	public void breakPedal() {
		//speed = speed -15;
		setSpeed(getSpeed() - 15);
		if((getSpeed()) > 0) {
		System.out.println("속도가 빠르게 내려갑니다.");
		} else {
		System.out.println("멈췄습니다.");
		setSpeed(0);
		}
		
	}
	// 오버라이딩 됐다.
	public String toString() {
		return "SportsCar의 현재 속도는" + getSpeed() +"입니다.";
	}
}
