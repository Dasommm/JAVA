package com.test01;

import java.util.Scanner;

public class ScannerTest02 {

	public static void main(String[] args) {
		
		//test01();
		//test02();

	}
	
		
	public static void test01() {
		Scanner sc = new Scanner(System.in);	//콘솔창에서 입력된 걸 가져와주는 역할
		System.out.println("성을 입력해 주세요 : ");
		String lastName = sc.nextLine();	// nextline은 한 줄을 잘라서 가져감
		System.out.println("이름을 입력해 주세요 : ");
		String firstName = sc.next();	//next라는 애들은 공백을 기준으로 하나씩 잘라서 가져감
		System.out.println("안녕하세요, "+ lastName + firstName + "님.");
		
		System.out.println(sc.next());
		
		sc.close();					// sc가 닫히지 않다가 이 명령을 보면 닫힌다. 
									// 따라서 전역변수로 넣고 모든게 끝날 때 닫는게 좋다.
		
	
	}
	public static void test02() {
		//콘솔창에 입력한 숫자의 단만 출력하자.
		
		Scanner sc = new Scanner(System.in);	// sc가 닫히지 않는 이유는 콘솔창에서 입력을 기다리고 있기 때문에
		System.out.println("구구단의 단을 입력해주세요.");
		
		int i = sc.nextInt();
		System.out.println("<" + i + "단>");
		for(int j = 1 ; j <10; j++) {
			System.out.printf("%d * %d = %d \n", i, j, i*j);
		}
				
		
	}
	

}
