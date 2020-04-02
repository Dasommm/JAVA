package com.bbb;

import com.aaa.AAA;

public class MTest {

	public static void main(String[] args) {
		BBB b1 = new BBB();		// BBB클래스의 새로운 객체를 BBB타입의 b1변수에 대입
		// 부모의 주소값이 불러와진다.
		b1.setAbc(1);
		b1.setB(2);
		System.out.println(b1.getAbc()+"+"+b1.getB()+"="+b1.getSum());
		
		BBB b2 = new BBB(3);
		System.out.println(b2.getAbc()+"+"+b2.getB()+"="+b2.getSum());
		
		BBB b3 = new BBB(4,5);
		System.out.println(b3.getAbc()+"+"+b3.getB()+"="+b3.getSum());
		
		System.out.println("--------------------------");
		
		AAA a1 = new AAA();
		AAA a2 = new BBB();
		//BBB b4 = (BBB) new AAA();
		a1.prn();
		a2.prn();
		//b4.getSum();		부모는 자식을 받을 수 있지만, 자식은 부모를 받을 수 없다. 		
		
	}
}
