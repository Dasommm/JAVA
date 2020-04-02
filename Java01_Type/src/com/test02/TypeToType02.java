package com.test02;

public class TypeToType02 {
	
	public static void main(String[] args) {
		
		//int to char
		int i01 = 65;
		char c01 = (char)i01;
		System.out.println("int to char:" + c01);
		//ascii코드 65=A 코드가 문자로 바뀌었다.
		
		//char to int
		char c02 = 'A';
		int i02 = c02 + 1;
		System.out.println("char to int:" + i02);
		System.out.println((char)i02);
		
		char c03 = '1';			//숫자가 아닌 아스키코드에 대응되는 것
		char c04 = '2';
		System.out.println((char)(c03 + c04));
		
		// String to int
		String str01 = "65";
		int i03 = Integer.parseInt(str01);
		System.out.println(i03+1);
		
		
		//int to String
		int i04 = 66;
		String s01 = Integer.toString(i04);
		String s02 = String.valueOf(i04);
		System.out.println(s01+1);		//숫자가 아닌 문자열이기 때문에
		System.out.println(s02+2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
