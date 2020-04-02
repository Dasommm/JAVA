package com.cal02;

import java.util.Calendar;

public class CalendarUseApi {

	public void prn(int year, int month) {
		Calendar cal = Calendar.getInstance();
		// singleton pattern : 메모리에 객체가 단 한번만 만들어지고,
		// 이후에 다시 호출하면 메모리에 있는 객체가 전달된다.
		// 얘네들은 new로 객체를 만들 수 없다.
		// 한번 만들어놓으면 얘가 계속 불려들여진다.

		System.out.printf("\t\t%d년 %d월 \n", year, month);
		System.out.printf("일\t월\t화\t수\t목\t금\t토\n");

		// 시작 날짜 설정
		cal.set(year, month - 1, 1); // month가 -1인 이유는 0-based이기 때문에

		// 설정한 1일의 요일
		int start = cal.get(Calendar.DAY_OF_WEEK); // 다 대문자로 표기하는 것은 보통 상수. /static

		// 요일만큼 공백
		for (int i = 1; i < start; i++) { // 1로 시작하는 이유는 일요일이 1부터 시작하기 때문에

			System.out.print("\t");
		}

		// 달력 출력
		for (int i = 1; i <= cal.getActualMaximum(Calendar.DATE); i++) {
			// getMaximum은 달력의 최대치값 :31이 항상 나올 것.
			System.out.printf("%d\t", i);
			if (start % 7 == 0) {
				System.out.println();

			}
			start++;

		}

	}

}
