package com.test02;

public class TypeToType03 {

	public static void main(String[] args) {
		//Boxing : 값을 wrapper class에 넣는 것.
		Integer i = new Integer(100);
		System.out.println(i);
		
		// unBoxing : wrapper class에서 값을 꺼내는 것.
		// 1)명시적 
		int j = i.intValue();
		System.out.println(j);
				
		// 2)묵시적
		int k = i;
		System.out.println(k);
		
		
		
		
		
		
	}
	
}
