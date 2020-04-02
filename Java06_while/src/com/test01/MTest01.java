package com.test01;

public class MTest01 {

	
	public static void prn01() {
		int i = 1;
		
		while(true) {
			System.out.println(i++);	// 무한루프
		}
	}
	
	public static void prn02() {
		int i = 1;
		while (i<10) {
			System.out.println(i);
			i++;
				
		}
		
		System.out.println("i :"+i);
	}
		
	public static void prn03() {
		do {
			System.out.println("hi!");
		}while(false);					// do 먼저하고 while(조건)확인!
				
	}
	
	public static void prn04() {
		int i =1;
		
		do {
			System.out.println(i);
			i++;
		}while (i < 10);			// ==와 <>가 헷갈리는 경우가 많으니 주의하기.
		System.out.println("i :" + i);
	}
	
	public static void prn05() {
		
		int i = 1;
		
		while(true) {
			System.out.println(i);
			i++;
			if(i == 10) {
				break;
			}
		}
		System.out.println("i :"+i);
	}
	
	
	
	
	
	public static void main(String[] args) {
		//prn01();
		//prn02();
		//prn03();
		//prn04();
		prn05();
		
		
		
	}	
	
}