package com.test01;

public class Mtest02 {

	
	public static void main(String[] args) {
		/*
		 * 1. 아규먼트가 5의 배수이면 "5의 배수입니다." 라고 출력하는 메서드를 만들자.
		 * 2. 아규먼트가 2의 배수이면서 3의 배수이면 
		 *    "2와 3의 배수입니다."를 출력하고, 아니면
		 *    "2와 3의 배수가 아닙니다."를 출력하는 메서드를 만들자.
		 * 3. 아규먼트가 소문자라면 "소문자 입니다."를 출력하고,
		 *    대문자라면 "대문자 입니다."를 출력하는 메서드를 만들자.
		 *    파라미터는 char로 하자. (java.lang.character 클래스에서 참조)
		 * 4. 메서드 3개를 호출하자.
		 */

		test01(15);
		test02(10);
		test03('S');
		
	}
	public static void test01(int i) { 	// 5의 배수 : 아규먼트를 5로 나누고 그 나머지가 0일 경우
				
		if (i%5 == 0) {
			System.out.println("5의 배수입니다.");
		}
	}
	public static void test02(int i) {	
			
		if((i%2 == 0) && (i%3 == 0) ) {
			System.out.println("2와 3의 배수입니다.");
		}else {
			System.out.println("2와 3의 배수가 아닙니다.");
		}
	}
	
	public static void test03(char c) {
		
		if(Character.isLowerCase(c)) {		// 클래스.메소드()로 부른다.
			System.out.println("소문자 입니다.");
		} else if(Character.isUpperCase(c)) {
			System.out.println("대문자 입니다.");
			// ascii 코드로도 풀 수 있다. 대문자 코드 --~--까지는 '대문자' 출력, 
			// 소문자 코드 --~--까지는 '소문자' 출력으로도 가능.
				
			 if (((int)c >= 97) && ((int)c <= 122)){
			 System.out.println("소문자 입니다.");
			 } else if(((int)c >= 65) && ((int)c <=90)) {
			 System.out.println("대문자 입니다.");
			 }
			 
		// ascii 코드로도 풀 수 있다. 대문자 코드 --~--까지는 '대문자' 출력, 
		// 소문자 코드 --~--까지는 '소문자' 출력으로도 가능.
			
		// if (((int)c >= 97) && ((int)c <= 122)){
		// System.out.println("소문자 입니다.");
		// } else if(((int)c >= 65) && ((int)c <=90)) {
		// System.out.println("대문자 입니다.");
		// }
			
		}
				
	}
	
}	
		

