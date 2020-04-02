package com.test03;

public class MTest {

	public static void main(String[]args) {
		
		//아규먼트 : method 외부에서 전달되는 값
		MyCalc.sum(13, 27);
		
		int res = MyCalc.sub(10, 3);
		System.out.println("sub(10,3) 호출하고 리턴된 결과값 : "+ res);
		
		double result = MyCalc.mul(10.3, 3.6);
		System.out.println("10.3 * 3.6 =" + result);
		
		int i = 10;
		int j = 3;
		MyCalc.div(i, j);
		
		
		
	}
}
