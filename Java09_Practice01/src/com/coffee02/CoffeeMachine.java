package com.coffee02;

import java.util.Scanner;

public class CoffeeMachine {
	// 입력 예)
	// "돈을 넣어 주세요."
	// 10000
	// "커피 몇 잔이 필요하신가요?"
	// 1
	// "커피 1잔이 나왔습니다."
	// "잔돈은 9700원 입니다."

	/*
	 * public void inputMoney() { System.out.println("돈을 넣어주세요. \n(한 잔당 300원)");
	 * Scanner sc = new Scanner(System.in); 
	 * int money = sc.nextInt();
	 * 
	 * System.out.println("커피 몇잔이 필요하신가요?"); 
	 * int num = sc.nextInt();
	 * System.out.printf("커피 %d잔이 나왔습니다.", num);
	 * 
	 * int change = money - (num * 300); System.out.printf("잔돈은 %d원 입니다.", change);
	 * 
	 * } =====>솜이가 만든거
	 */
	public void inputMoney() {
		System.out.println("돈을 넣어주세요. \n(한 잔당 300원)");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();

		if (money >= 300) {
			System.out.println("몇 잔이 필요하십니까? (숫자만 입력)");
			int count = sc.nextInt();
			coffeeMake(money, count);
		} else {
			System.out.println("금액이 부족합니다.");
			System.out.println("잔돈은 " + money + "원 입니다.");
		}

	}

	private void coffeeMake(int money, int count) {
		int change = money - (count * 300);
		if (change >= 0) {
			System.out.printf("커피 %d잔 나왔습니다.\n", count);
			System.out.printf("잔돈은 %d원 입니다.\n", change);
		} else {
			System.out.println("금액이 부족합니다.");
			System.out.printf("잔돈은 %d원 입니다.\n", money);
		}

	}

}
