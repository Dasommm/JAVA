package com.cal;

import java.util.Scanner;

/*
 * ① 서력 기원 연수가 4로 나누어 떨어지는 해는 우선 윤년으로 하고,
 * ② 그 중에서 100으로 나누어 떨어지는 해는 평년으로 하며, 
 * ③ 다만 400으로 나누어 떨어지는 해는 다시 윤년으로 정하였다. * 
 *  윤년인지 아닌지를 판별
 */

public class LeapYear {

	public static void main(String[] args) {

		for (int i = 2000; i <= 2020; i++) {
			if (isLeapYear(i)) {
				System.out.println(i + "년도는 윤년이 맞습니다.");
			} else {
				System.out.println(i + "년도는 윤년이 아닙니다.");
			}
		}

	}

	public static boolean isLeapYear(int year) {
		boolean leap = false; // 윤년의 조건이 맞을 경우 true로 하기 위해
								// 기본값을 false로

		// Scanner sc = new Scanner(System.in); 내가 쓴 코드들 (틀린애들)
		// System.out.println("년도를 입력 해주세요.");
		// int i = sc.nextInt();

		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			leap = true;
		}

		return leap;

	}
}
