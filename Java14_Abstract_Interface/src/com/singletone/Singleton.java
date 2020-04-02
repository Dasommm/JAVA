package com.singletone;

// memory(heap)에 객체를 한번만 생성
public class Singleton {

	// 2. 객체의 주소값을 확인할 변수를 static으로 선언
	private static Singleton singleton;

	// 1. 생성자를 외부에서 호출할 수 없도록 private로 선언.
	private Singleton() {
		System.out.println("singleton instance 생성");

	}

	// 3.객체가 heap에 존재하는지 확인한다.
	// 만일 없으면 생성하고, 있으면 만들어져있는 객체의 주소값을 리턴
	public static Singleton getInstance() {

		if (singleton == null) { // 아직 객체가 만들어지지 않았다면
			singleton = new Singleton();
			System.out.println("new!");
		} else {
			System.out.println("exists!");
		}

		return singleton;

	}

}
