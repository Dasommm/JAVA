package com.test02;

import java.util.Random;

public class RandomCube {

	// 1. 5 * 5 숫자를 출력하자. (0~9 사이의 랜덤한 숫자 하나하나를)
	/*
	 * 1 5 2 5 9
	 * 2 8 5 2 1 ....
	 */
	// 2. 만들어진 전체 숫자의 평균을 출력하자.

	public static void main(String[] args) {

		Cube();

	}

	public static void Cube() {

		int sum = 0;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				int r = (int) (Math.random() * 10);
				System.out.printf("%2d", r);
				sum += r;
			}
			System.out.println();
		}
		System.out.println("평균은 = " + ((double) sum / 25));

	}

}
