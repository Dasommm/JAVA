package com.coffee01;

import java.util.Scanner;

public class CoffeeMachine {

	public void inputMoney() {
		System.out.println("돈을 넣어주세요. \n(한 잔당 300원)");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		
		if(money >= 300 ) {
			coffeeMake(money);			
		}else {
			System.out.println("금액이 부족합니다.");
			System.out.println("잔돈은" + money + "원입니다.");
		}
	}
	
	private void coffeeMake(int money) {		// 같은 클래스 내에서만 가능
		int coffee = money / 300;				// 다른 클래스에서는 사용하지 못하게끔
		int change = money % 300;				// 왜냐면 다른 클래스에서 돈 안내고 커피가 나오는 경우가 없도록
		
		System.out.println("커피 "+ coffee + "잔 나왔습니다.");
		System.out.println("잔돈은" + change + "원 입니다.");
				
	}
	
}
