package com.test02;

public class SleepTest {

	public static void main(String[] args) {
		
		while(true) {
			for(int i = 1; i<=10 ; i++) {
				try {
					Thread.sleep(500);		// 해당 숫자만큼 멈췄다가 다시 실행
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.printf("%c", '★');
			}
			
			System.out.println();
		}
	}
}
