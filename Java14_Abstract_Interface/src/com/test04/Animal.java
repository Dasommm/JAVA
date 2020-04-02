package com.test04;

public abstract class Animal {
	// 둘 다 인터페이스인 경우에는 다중(여러개) 상속 가능
	// 그러나 클래스인 경우에는 다중 상속 불가

	public abstract void bark();
	public void eat(String feed) {
		System.out.println(feed + "먹는다.");
		
	}
}
