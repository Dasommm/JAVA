package com.bbb;

import com.aaa.AAA;

public class BBB extends AAA{	// extends + 상속받을 클래스

	// field
	private int b;
	
	public BBB() {
		// super(); // 부모의 생성자를 명시하지 않는경우, 부모의 기본생성자를 자동호출
		// -> public AAA()가 호출이 되었다.
		System.out.println("BBB() 생성");
		
	}
	public BBB(int b) {
		super(b);	// 부모의 파라미터 받는 부모의 생성자 => public AAA(int abc)를 호출하고 있다.
		this.b = b;
		System.out.println("BBB(int b) 생성");
	}
	public BBB(int abc, int b) {
		super(abc);	// 부모의 생성자 => public AAA(int abc)를 호출하고 있다.
		this.b = b;
		System.out.println("BBB(int abc, int b) 생성");
		
	}
	//getter & setter
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
		
	}
	
	public int getSum() {
		// super : 부모 객체
		// this : 나 객체
		int sum = super.getAbc() + this.getB();	// 부모가 가진 것(super)을 명시하지 않아도 가져다 쓸 수 있다.
												// 부모가 가진 것(super)을 내 것처럼(this) 명시해서 쓸 수 있다.
												// 상속 받은 경우 super/ this 사용하지 않고 그냥 쓸 수 있다. 
		return sum;
		
	}
	
	public void prn() {
		System.out.println("BB의 prn 메서드");
		
	}
}
