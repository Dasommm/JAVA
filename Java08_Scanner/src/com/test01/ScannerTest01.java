package com.test01;

import java.util.Scanner;

public class ScannerTest01 {

	public static void main(String[] args) {
	
		//test01();
		test02();

	}
	
	public static void test01() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요 : ");
		int a = sc.nextInt();
		
		System.out.println("또 입력해 주세요 : ");
		
		int b = sc.nextInt();
		
		System.out.println(a+b);
		
		
	}
	
	
	public static void test02() {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next(); // 입력된 값을 토큰으로 잘라서 출력해준다.
		System.out.println(str);
		sc.nextLine();
		
		String str2 = sc.nextLine(); // 잘려진 토큰들도 같이 출력
		System.out.println(str2);
		
		
		
	}

}
