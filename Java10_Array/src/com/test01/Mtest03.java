package com.test01;

public class Mtest03 {

	// 1. a~z의 값을 일차원 배열에 저장하고
	// 다음과 같이 출력하자.
	/*
	 * a b c d e f 
	 * g h i j k l 
	 * m n o p q r 
	 * s t u v w x 
	 * y z
	 */

	// 2. 위에서 만든 배열을 거꾸로 출력하자.
	/*
	 * z y x w v u 
	 * t s ...
	 */

	// 3. 1번에서 만든 배열을 대문자로 바꿔서 출력하자.

	public static void main(String[] args) {

		char[] ch = new char[26];
		for (int i = 0; i < ch.length; i++) {
			ch[i] = (char) ('a' + i);

		}
		prn01(ch);
		prn02(ch);
		prn03(ch);		

	}

	public static void prn01(char[] arr) {
		for (int i = 1; i <= arr.length; i++) {
			System.out.print(arr[i - 1] + " ");

			if (i % 6 == 0) {
				System.out.println();

			}

		}
		System.out.println();
	}

	public static void prn02(char[] arr) {
		System.out.println("---------------");
		int cnt = 1;
		for (int i = arr.length; i > 0; i--) {
			System.out.print(arr[i - 1] + " ");
			if (cnt % 6 == 0) {
				System.out.println();

			}
			cnt++;

		}
		System.out.println();
	}

	public static void prn03(char[] arr) {
		System.out.println("---------------");
		for (int i = 1; i <= arr.length; i++) {
			System.out.print(Character.toUpperCase(arr[i - 1]) + " ");
			if (i % 6 == 0) {
				System.out.println();
			}
		}
	}

}
