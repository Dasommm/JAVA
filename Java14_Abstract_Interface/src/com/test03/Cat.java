package com.test03;

// Class -> Class : extends
// Class -> interface : implements
// interface -> interface : extends
// interface -> class 는 안된다.

public class Cat implements Animal {

	@Override
	public void bark() {
		System.out.println("야옹");

	}

	@Override
	public void eat(String feed) {
		System.out.println("고양이가" + feed + "먹는다.");

	}

}
