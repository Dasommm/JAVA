package com.test02;

import java.util.Scanner;

public class MTest {

	/*
	 * 동적 바인딩 - 런타임시 메모리 할당을 하면서 메모리를 동적으로 연결하는 방식 1. 메모리 절약 2. 실행속도 향상 3. 행위 은닉
	 */
	public static void main(String[] args) {
		System.out.println("선택해주세요. [1:고양이 2:멍멍이 3:랫서팬더]");
		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();

		Animal some = null; // 어떤 것이 들어갈지 아직 모른다. 따라서 아무것도 들어가있지 않는다.
		switch (select) { // 사용자가 값을 넣은 후에야 값을 넣어준다. = 동적바인딩
		case 1: // *팩토리 패턴
			some = new Cat();
			break;

		case 2:
			some = new Dog();
			break;

		case 3:
			some = new Panda();
			break;
		}

		some.start();
		some.stop();

	}

}
