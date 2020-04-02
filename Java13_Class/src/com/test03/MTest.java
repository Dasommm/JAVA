package com.test03;

public class MTest {

	public static void main(String[] args) {
		MyCalc calc = new MyCalc();

		System.out.println(calc.sum(1, 2));
		System.out.println(calc.sum(3.45, 5.67));
		System.out.println(calc.sum(8, 9, 10));
		// 같은 이름으로 다른 일을 한다. 그러나 하는일(sum)은 같다. 
		// overloading(파라미터의 타입과 갯수가 다르다.) ex)toString(int도 char도 string도 가능)
		// overriding : 재정의. 부모에게 상속받은 메소드을 확장하거나 변형하는 것. 
		
	}
}
