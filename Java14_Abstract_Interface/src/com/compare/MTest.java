package com.compare;

import java.util.Arrays;

public class MTest {

	public static void main(String[] args) {
		Score[] students = new Score[3];
		students[0] = new Score("홍길동",100,50,77);

		students[1] = new Score();
		students[1].setName("이순신");
		students[1].setKor(100);
		students[1].setEng(100);
		students[1].setMath(65);
		
		Score sc = new Score("김선달",40,37,100);
		students[2] = sc;
		
		for(Score tmp : students) {
			System.out.println(tmp);
			
		}
		
		Arrays.sort(students);
		System.out.println("-------------------");
		for(Score tmp : students) {
			System.out.println(tmp);
			
		}
	}
}
