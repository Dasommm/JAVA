package com.test03;

public class MyCalc {

	// 접근제한자 메모리영역 리턴타입 메소드이름(파라미터) {}
	// 파라미터 : method 외부에서 전달된 값을 받아서, method 내부에서 사용하기 위한 변수 
	public static void sum(int i, int j) {
		int res = i + j;
		System.out.println(i + "+" + j + "=" + res);			
	}
	public static int sub(int i, int j) {
		int res = i - j;
		
		return res;
				
	}
		
	public static double mul(double i, double j) {
		double result = i * j;
		
		return result;
			
	}
	
	public static void div(int i, int j) {
		
		int mok = i / j;
		int namergi = i % j;
		
		System.out.printf("%d / %d의 몫 : %d \n " , i,j,mok);
		System.out.printf("나머지는 %d",namergi);
				
	}
		
}
