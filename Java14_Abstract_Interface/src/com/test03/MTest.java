package com.test03;

public class MTest {

	public static void main(String[] args) {
		Animal cat = new Cat();
		cat.bark();
		cat.eat("참치");

		Animal dog = new Dog();
		dog.bark();
		dog.eat("뼈다귀");

	}
}
