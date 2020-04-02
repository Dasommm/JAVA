package com.test02;

public class Cat extends Animal{

	public Cat() {
		System.out.println("고양이");
		
	}
	// override : 재정의 -> 상속받은 부모의 메서드를 확장하거나 변형할 때.
	@Override
	public void bark() {
		System.out.println("야옹야옹");
		
	}
}


