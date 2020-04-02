package com.test04;

import java.util.Random;

public class MTest {
	/*
	 * 1. 5칸짜리 int형 1차원 배열을 만들자. 
	 * 2. 반복문을 사용하여, 해당 배열의 앞에서 4개의 (0~3번지의 값) 
	 *    5~9 사이의 랜덤한 숫자를 각각 대입하자. 
	 * 3. 배열의 5번째 위치한 인덱스에 앞의 4개의 모든 값들을 곱해서 저장하자. 
	 * 4. 배열을 출력하자. 
	 * 5. 배열안의 모든 값을 더해서 출력하자.
	 * 
	 */
	public static void main(String[] args) {
		// 1.
		int[] arr = new int[5];

		// 2.
		for (int i = 0; i < 4; i++) {
			arr[i] = (int) (Math.random() * 5) + 5;
		}

		// 3.
		int tmp = 1;
		for (int i = 0; i < 4; i++) {
			tmp *= arr[i];
		}
		arr[4] = tmp;

		// 4.
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%2d,", arr[i]);
		}
		System.out.println();

		// 5.
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("총 합 : " + sum);

	}

}
