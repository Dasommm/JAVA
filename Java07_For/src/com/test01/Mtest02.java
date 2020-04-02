package com.test01;

public class Mtest02 {
	
	
	public static void main(String[] args) {
		
		prn01();	
				
	}	
	public static void prn01() {
		for(int i = 0 ; i <10 ; i++) {
			for(int j = 0 ; j < 10; j++) {		// j는 지역변수 = 그 지역에서만 사용된다. 
				System.out.printf("(%d, %d)  ", i, j);	// 이 for문을 나오면 j는 사라진다.
			}
			System.out.println();
					}			
	}	
	// 디버그 모드 
}
