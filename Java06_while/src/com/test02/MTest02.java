package com.test02;

public class MTest02 {

	public static void main(String[] args) {
		prn();

	}

	public static void prn() {
		// 1부터 10까지의 홀수만 출력

		int i = 0;
		while (i <= 10) {
			i++;
			if (i % 2 == 0) {
				continue; // 아래를 무시하고 해당 반복문의 가장 위로 올라가자.
			}
			System.out.println(i);
		}

	}

}
