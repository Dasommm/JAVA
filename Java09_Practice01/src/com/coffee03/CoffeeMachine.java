package com.coffee03;

import java.util.Scanner;

public class CoffeeMachine {

	// 입력 예)
	// "일반커피 / 고급커피 선택해 주세요.
	// "일반커피(300원) : 1 / 고급커피(500원) : 2"
	// 2
	// "돈을 넣어 주세요."
	// 10000
	// "커피 몇 잔이 필요하신가요?"
	// 1
	// "고급커피 1잔이 나왔습니다."
	// "잔돈은 8500원 입니다."
	public void inputMoney() {
		//int money = 0;
		//int type = 0;
		//int num = 0; 
		//int price = 0;   => 변수들 미리 선언한 후에 아래에서 대입하여 사용해도 된다. 
		/*
		System.out.println("일반커피 / 고급커피 선택해주세요.\n 
		일반커피(300원) : 1 / 고급커피(500원) : 2");
		Scanner sc = new Scanner(System.in);
		select = sc.nextInt();
		switch (selct) {
		case 1 : 
			price = 300;
			break;
			
		case 2 : 
			price = 500;
			break;
		}
		System.out.println("돈을 넣어주세요.");
		money = sc.nextInt();
		
		System.out.println("잔 수를 입력해주세요.");
		count = sc.nextInt();
		
		if(select == 1 && money >= 300) {
			coffeeMake(money, count, price);
		} else if (select ==2 && money >= 500) {
			coffeeMake(money, count, price);
		} else {
			System.out.println("잔액이 부족합니다.");
			System.out.printf("잔돈은 %d원 입니다. \n", money);
		}
		
		*/
		
		System.out.println("일반커피 / 고급커피 선택해주세요.\n "
				+ "일반커피(300원) : 1 / 고급커피(500원) : 2");
		Scanner sc = new Scanner(System.in);
		int type = sc.nextInt();

		System.out.println("돈을 넣어주세요.");
		int money = sc.nextInt();

		if (type == 1 && money >= 300) {
			System.out.println("커피 몇잔이 필요하신가요? (숫자만 입력)");
			int num = sc.nextInt();
			coffeeMake(type, money, num);
		} else if (type == 2 && money >= 500) {
			System.out.println("커피 몇잔이 필요하신가요? (숫자만 입력)");
			int num = sc.nextInt();
			coffeeMake(type, money, num);
		} else {
			System.out.println("금액이 부족합니다.");
			System.out.printf("잔돈은 %d원 입니다.", money);
		}

	}

	private void coffeeMake(int type, int money, int num) {
		/*int change = money - (count *price);
		if (change >= 0) {
			System.out.printf("커피 %d 잔이 나왔습니다. \n,count");
			System.out.printf("잔돈은 %d원 입니다.\n",change);
		}
		*/
		int change = 0;
		switch (type) {
		case 1:
			change = money - (num * 300);
			if (change >= 0) {
				System.out.printf("커피 %d잔이 나왔습니다.", num);
				System.out.printf("잔돈은 %d원 입니다.", change);
			} else {
				System.out.println("금액이 부족합니다.");
				System.out.printf("잔돈은 %d원 입니다.\n", money);
			}
			break;

		case 2:
			change = money - (num * 500);
			if (change >= 0) {
				System.out.printf("커피 %d잔이 나왔습니다.", num);
				System.out.printf("잔돈은 %d원 입니다.", change);
			} else {
				System.out.println("금액이 부족합니다.");
				System.out.printf("잔돈은 %d원 입니다.\n", money);
			}
			break;
		}

	}

}
