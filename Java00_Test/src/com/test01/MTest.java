package com.test01;

import com.qclass.Score;

public class MTest {

	public static void main(String[] args) {
	Score sc = new Score();
	sc.setName("홍길동");
	sc.setKor(100);
	sc.setEng(50);
	sc.setMath(76);
	
	System.out.println(sc);
	
	Score lee = new Score("이순신", 80, 100, 68);
	System.out.println(lee);
	
	// ~.jar 파일 
	// 우리가 만든 것을 배포해서 사용했다. (코드 은닉하고 기능만 사용)
	// library (누군가가 배포해준 파일을 사용한다)
	}
}
