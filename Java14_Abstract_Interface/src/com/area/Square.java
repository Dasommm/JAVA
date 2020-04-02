package com.area;

import java.util.Scanner;

public class Square extends Arealmpl {
	// 가로 * 세로
	public Square() {

	}

	public void make() {
		Scanner sc = new Scanner(System.in);
		System.out.println("가로를 입력해주세요 : ");
		int width = sc.nextInt();
		System.out.println("세로를 입력해주세요 : ");
		int length = sc.nextInt();
		double res = width * length;
		setResult(Double.toString(res));

	}

	public void print() {
		System.out.print("사각형의");
		super.print();

	}

}
