package com.test01;

public class MTest {
	
	// final = 상수 , 변하지 않는 수 /항상 일정한 수
	public static final int TEN = 10;
	

	public static void main(String[] args) {
		opr01(3);
		System.out.println(opr02()); 	//리턴되는 값(문자열)이 있다.
		opr03(TEN,1);
		opr04();
		opr05();		//리턴되는 값이 없을 경우
		opr06();
		opr07();
		
	}
	
	// 지역변수끼리는 겹칠 수 없고 , 전역변수는 같아도 가능하다. 지역변수가 우선
	//사칙연산
	public static void opr01(int i) {

		System.out.printf("%d + %d = %d \n", TEN, i, TEN + i);
		System.out.printf("%d - %d = %d \n", TEN, i, TEN - i);
		System.out.printf("%d * %d = %d \n", TEN, i, TEN * i);
		System.out.printf("%d / %d = 몫  : %d  나머지 : %d", TEN, i, TEN / i, TEN % i);
		// double형은 소수점으로 나온다. int는 몫 따로 나머지 따로
		
	}
	// 대입연산 ( +=, -=, *=, /=, %=)
	public static String opr02() {
		int i = 0;
		System.out.println(i);
		i = i + TEN;
		System.out.println(i);
		i += TEN; // i = i + TEN;
		System.out.println(i);
		i -= 5;
		System.out.println(i);
		
		return "대입연산 끝!";
				
	}
	// 증감연산
	// 전위연산자 : 변수 앞에 연산자를 붙여서, 연산을 먼저하고 값을 나중에 리턴한다.
	// 후위연산자 : 변수 뒤에 연산자를 붙여서, 값을 먼저 리턴하고 연산을 나중에 한다.	
	public static void opr03(int a, int b) {
		System.out.println(a);
		System.out.println(a--);	// 10으로 출력은 되지만 9로 되어있다.
		System.out.println(--a);	// 8로 출력되고 8로 되어있다.
		int res = a++ + ++a + --a + --b;
		//        8(9) + 10(10) +9(9) + 0(0);
		System.out.println(res);
			
	}
	
	// 논리연산
	public static boolean opr04() {
		// AND연산자 '&' : 둘 다 참(true)이어야 참
		System.out.println(true & true); 	// true
		System.out.println(true & false);	// false
		System.out.println(false & true);	// false
		System.out.println(false & false);	// false
		
		// OR 연산자 '|' : 둘 중 하나만 참이면 참
		System.out.println(true | true);	// true
		System.out.println(true | false);	// true
		System.out.println(false | true);	// true
		System.out.println(false | false);	// false
					
		// && 
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		// ||
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		int i = 8;
		boolean res = (TEN > i)&&(5 < i);
		
		return res;
				
	}
	
	// 비교연산
	public static void opr05() {
		System.out.println("-----------------------");
		System.out.println(true == false);
		System.out.println(5 != 6);
		
	}
	// 삼항 연산
	// (조건)? 참 : 거짓;
	public static boolean opr06() {
		
		int a = 2;
		int b = 3;
		int i = (a > b) ? a + b : a - b;
		System.out.println(i);
		
		boolean res = false;
		res = (a < b) ? false : true;
		System.out.println(res);
		
		String s = (a > b)? "a가 b보다 크다": ((a < b) ? "a가 b보다 작다" : "a와 b가 같다.");	// 중첩연산
		System.out.println(s);
		// 조건과 참, 거짓의 타입은 같아야 한다.
				return res;
				
	}
	// 비트 연산 : &, |, ^, ~, <<, >>
	public static void opr07() {
		
		int a = 10 ;
//		0000 0000 0000 0000 0000 0000 0000 1010;     32비트 
		int b = 2;
//		0000 0000 0000 0000 0000 0000 0000 0010;
		System.out.println(a & b);
//		0000 0000 0000 0000 0000 0000 0000 1010;		
//	  &	0000 0000 0000 0000 0000 0000 0000 0010;		
//		0000 0000 0000 0000 0000 0000 0000 0010;    출력된 결과가 십진수로 나옴
		System.out.println(a | b);
//		0000 0000 0000 0000 0000 0000 0000 1010;		
//	  |	0000 0000 0000 0000 0000 0000 0000 0010;		
//      0000 0000 0000 0000 0000 0000 0000 1010;
		System.out.println("---------------------");
		
		int c = TEN;
//		0000 0000 0000 0000 0000 0000 0000 1010;
		System.out.println(c >> 2);
//	    00 0000 0000 0000 0000 0000 0000 0000 10;		
//	    0000 0000 0000 0000 0000 0000 0000 0010;
		System.out.println(Integer.toBinaryString(c >> 2));
//	    0000 0000 0000 0000 0000 0000 0000 0010;
		System.out.println(Integer.toBinaryString(c << 4));
//	    0000 0000 0000 0000 0000 0000 1010 0000;		
		System.out.println(c << 4);
		
		
	}
	
	
	
}
