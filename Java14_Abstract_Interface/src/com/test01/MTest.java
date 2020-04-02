package com.test01;

public class MTest {
	public static void main(String[] args) {
		Animal cat = new Cat();
		Animal dog = new Dog();

		cat.bark();
		dog.bark();

		cat.eat("참치");
		dog.eat("뼈다귀");

		// Animal some = new Animal(); // Animal 클래스는 인스턴스화 할 수 없다.
		// 추상클래스는 객체 생성 불가 = 바디가 없어서

	}
}
