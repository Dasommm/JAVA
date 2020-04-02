package com.lotto;

import java.util.Arrays;

// 1 ~ 45 사이의 "중복되지 않는" 난수 7개를 만들고, 
// 정렬해서 출력하자.

public class Lotto {

	// 로또 배열 생성
	private int[] make() {
		int[] arr = new int[7]; // 7칸짜리 방
		int index = 0;

		while (index < 7) { // 중복값이 있으면 다시 생성, 없으면 저장
			int ran = (int) (Math.random() * 45) + 1;

			if (!isSame(arr, ran)) { // isSame은 random을 비교해서 같은게 있으면 true.
										// 따라서 false가 되어야(중복값 없음)한다.
				arr[index] = ran;
				index++;
			}

		}

		return arr;

	}

	// 중복값 판별
	private boolean isSame(int[] arr, int ran) { // 배열이랑 랜덤 값이랑 비교
		// 같은지 다른지 리턴을 해줄 것이다. // 같으면 같다고 출력, 다르면 값 저장
		boolean same = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ran) {
				same = true;
				break;
			}
		}

		return same;

	}

	// 정렬
	private void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[j] < arr[j - 1]) { // swap 알고리즘
					int tmp = arr[j]; // 임시의 방을 만들어서 B를 방에 잠시 저장하고
					arr[j] = arr[j - 1]; // A를 B의 자리에 덮어씌운 후 B가 다시 A의 자리로 덮어씌운다.
					arr[j - 1] = tmp; // 이 과정을 배열의 길이만큼 반복

				}
			}
		}
	}

	// 출력
	public void prn() {
		int[] arr = make();

		sort(arr);
		// Arrays.sort(arr); => 이것도 똑같다.

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%3d", arr[i]);
		}
	}

	public static void cnt() {
		 /* // 1 
		 * // 1 2 
		 * // 1 2 3 
		 * // 1 2 3 4 
		 * // 1 2 3 4 5
		 */ //--------------- 
		for (int j = 1; j <= 5; j++) {
			for (int i = 1; i <= j; i++) {
				System.out.printf("%d", i);
			}
			System.out.println();

		}

	}

	public static void arr() {
		/* // a B c D e F 
		 * // g H i J k L 
		 * // m N o P q R 
		 * // s T u V w X
		 */ // y Z

		char a = 'a';
		for (int i = 0; i < 26; i++) {
			if (i % 2 != 0) { // 인덱스가 짝수가 아닐때
				System.out.println(Character.toUpperCase(a));
			} else {
				System.out.print(a + " ");
			}
			a++;
		}
	}

}

