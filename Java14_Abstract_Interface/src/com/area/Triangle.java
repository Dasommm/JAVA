package com.area;

import java.util.Scanner;

public class Triangle extends Arealmpl {
	// 가로 *세로 * 0.5
	public Triangle() {

	}

	public void make() {
		Scanner sc = new Scanner(System.in);
		System.out.println("밑변을 입력해주세요 : ");
		int width = sc.nextInt();
		System.out.println("높이를 입력해주세요 : ");
		int height = sc.nextInt();

		double res = width * height * 0.5;
		setResult(Double.toString(res));
		        // String.valueOf(res)
		        // res+""
		        // => String type이기 때문에 맞춰주기 위한 방법들
	}

	public void print() {
		System.out.print("삼각형의 ");
		super.print(); // 부모 클래스에 있는 "넓이 :"

	}

}
