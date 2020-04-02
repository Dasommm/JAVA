package com.test01;

public class Type02 {

	//정수형 리터럴 : byte(1)   short(2)     int(4)     long(8) 
	// long의 경우 접미사 l/L을 붙여서 나타내줄 수 있다.
	public static void main(String[] args) {
		//Type 변수 = 값;
		
		byte b01 = 126;
		System.out.println(b01);
		byte b02 = (byte) 128;					//casting(형 변환) -> 정수형의 기본 타입은 int
		System.out.println(b02);
		byte sumB = (byte) (b01 + b02);			//연산의 기본도 int
		
		System.out.println(sumB);
		System.out.println("--------------------");
		
		short s01 = 32767;
		System.out.println(s01);
		short s02 = 2;
		System.out.println(s02);
		short sumS = (short) (s01 + s02);
		System.out.println(sumS);
		System.out.println("-------------------");
		
		int i = 10;
		int j = 20;
		System.out.println(i);
		System.out.println(j);
		int sum = i + j;
		System.out.println(sum);
		System.out.println("-------------------");
		
		long l01 = 3000000000L;
		long l02 = 4000000000l;
		long sumL = l01 + l02;
		System.out.println(sumL);				//int의 범위를 벗어나는 것은 Long이
		System.out.println("-------------------");
		
		
		//0b : 2진수
		System.out.println(0b10);
		//00 : 8진수
		System.out.println(0010);
		//0x : 16진수 
		System.out.println(0x10);
		
		
		
		
		
	}
}

















