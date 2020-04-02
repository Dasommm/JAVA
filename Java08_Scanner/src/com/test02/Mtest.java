package com.test02;

import java.util.Random;

public class Mtest {

	public static void main(String[] args) {
		
		random01();
		random02();
		random03();
		
	}	
	
	public static void random01() {
		double d = Math.random();	// 0.0 <= math.random() <= 1.0
		System.out.println(d);
		
	}	
	
	public static void random02() {
		// (int)(math.random() * (max - min +1)) + min;	 // min을 넣어주는 이유는 10도 포함시켜주고 싶어서
		// (int)(math.random() * 갯수) + 시작값;
		
		int max = 10;
		int min = 5;
		int r = (int)(Math.random() * (max - min + 1)) + min;
		System.out.println(r);
		
	}

	public static void random03() {
		Random r = new Random();
		System.out.println(r.nextInt(10));	//1부터 10전까지의 난수 
				
	}
	
}
