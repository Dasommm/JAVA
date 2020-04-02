package com.area;

import java.util.Scanner;

public class Circle extends Arealmpl {
	// 반지름 *반지름* 3.14
	public Circle() {

	}

	public void make() {
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름을 입력해주세요 :");
		int radius = sc.nextInt();
		double res = radius * radius * 3.14;
		setResult(Double.toString(res));

	}

	public void print() {
		System.out.print("원의 ");
		super.print();

	}

}
