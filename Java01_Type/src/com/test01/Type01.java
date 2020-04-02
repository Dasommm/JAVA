package com.test01;

/**
 * javadoc test<br>
 * "Hello, World!" 를 출력하는 class <br><br>
 * 
 * javadoc 만드는 방법 <br>
 * project 우클릭 - export - javadoc - %JAVA_HOME%\bin\javadoc.exe <br>
 * 
 * @author 권다솜
 *
 */
public class Type01 {

	/**
	 * mian method : 프로그램의 주 진입점(프로그램 시작 시 가장 먼저 실행됨!)
	 * 
	 * 
	 * @param args 기본 파라미터
	 */
	public static void main(String[] args) {
		System.out.println("Hello, World!");
		// 한 줄 주석 : 설명 -> 이 코드를 보는 "사람"을 위한
		/*
		 * 여러 줄 주석
		 * compile 할 때 제거됨
		 */
	}
	
	//ms949,euc-kr : 한글 완성형 인코딩
	//UFT-8 : 유니코드형 인코딩 
	
	
}
