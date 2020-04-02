package com.test02;

public class MTest01 {

	/*
	 * A B C D E
	 * F G H I J
	 * K L M N O
	 * P Q R S T
	 * U V W X Y
	 * Z
	 *  
	 */
	
	public static void main(String[] args) {
		int count = 0;		// A부터 Z까지 출력되면 멈추는 용도
		char c = 'A';
		boolean stop = false;
		
		while(!stop) {		// 조건에 !붙으면 반대 
			while(true) {
				System.out.printf("%2c", c);
				c++;		// char 타입에 더해주면 ascii코드로 증가 가능
				count++;
				if (count%5 == 0) {
					break;
					
				}				
				if (count == 26) {
					stop = true;
					break;
				}
				
			}
			System.out.println();
			
		}		

	}

}
