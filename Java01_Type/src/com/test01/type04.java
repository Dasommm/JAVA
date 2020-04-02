package com.test01;

public class type04 {
	
	//문자형, 문자열, 논리형
	public static void main(String[] args) {
		
		//문자형 ''  -> 하나만 가질 수 있다.
		char c01 ='a';
		System.out.println(c01);
		char c02 = 'b';
		char sumC = (char) (c01 + c02);
		System.out.println(sumC);
		
		//문자열 ""
		String s01 = "a";
		String s02 = "bc";
		String sumS = s01 + s02;
		System.out.println(sumS);
		
		//unicode도 가능
		char lastName = '\uad8c';
		System.out.println(lastName);
		String firstName = "\ub2e4\uc19c";
		System.out.println(firstName);
		
		
		
		System.out.println("--------------------");
		boolean bl01 = true;
		boolean bl02 = false;
		System.out.println(bl01);
		System.out.println(bl02);
		
		
				
		
		
		
		
		
		
		
	}

}
