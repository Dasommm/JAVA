package com.test01;

import java.util.Arrays;

public class MTest02 {
	public static void main(String[] args) {
		// 변수[인덱스] => 주소값으로 변경
		// 인덱스는 0부터 시작
		// 배열은 생성시에 크기가 고정된다.
		// 데이터타입 [] 변수 = {..}의 형태
		// 배열은 참조타입이므로 주소값으로 불려짐

		// 배열의 2차원
		// 방법 1
		int[][] a = new int[3][2];
		a[0][0] = 1;
		a[0][1] = 2;
		a[1][0] = 3;
		a[1][1] = 4;
		a[2][0] = 5;
		a[2][1] = 6;

		// 방법 2 => 세로값은 넣고 가로값은 지정
		int[][] b = new int[3][];
		b[0] = new int[5];
		b[1] = new int[7];
		b[2] = new int[2];

		// 방법3 => 바로 값을 넣어준다, 값으로 초기화
		int[][] c = new int[][] { { 1, 2, 3 }, { 4, 5, 6, 7, 8 }, { 9 }, { 10, 11 } };

		// 방법 4
		int[][] d = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10, 11, 12, 13 }, { 14, 15, 16 } };
		System.out.println(d);
		prn(d);
		System.out.println(Arrays.deepToString(d));
		// Arrays클래스에서는 여러 기능들이 있다.

		String[][] s = { { "have", "a", "nice", "day" }, { "너무", "어려워" }, { "배열", "이차원 배열" } };
		test(s);
	}

	public static void test(String[][] arr) {
		// nice -> good
		// 어려워 -> 쉬워
		// 이차원 배열 -> 다차원 배열
		// 로 바꾸어 전체 출력

		arr[0][2] = "good";
		arr[1][1] = "쉬워";
		arr[2][1] = "다차원 배열";

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void prn(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			// System.out.println(arr[i].length);
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();

		}
	}
}
