package com.test01;

// 추상클래스 : 추상 메서드를 하나 이상 가진 클래스
public abstract class Animal {

	// 선언만 하고 끝낸다. / 추상 메서드 : 상속받는 자식 class에서 반드시 구현하도록 강제!
	// body {}가 없다.	// 추상메서드를 받고 싶지 않은 경우엔 본인도 추상클래스가 되면 된다. 
	// new 연산자;로 할 수 없다.
	public abstract void bark();
	
	public void eat (String feed) {
		System.out.println(feed+ "먹는다.");
		
	}
	
}
