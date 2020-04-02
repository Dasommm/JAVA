package com.test01;

public class Mtest01 {

	public static void main(String[] args) {
		
		prn01();
		//prn02();		
	}
	public static void prn01() {
		// for(초기값; 조건식; 증감식){명령;}
		for (int i = 1 ; i <= 10 ; i++){
			System.out.println(i);		
		}				
			}	
	public static void prn02() {
	
		/*for (int i = 10 ; i > 0; i -= 2) {
		System.out.println(i);			
		}
		 */			
		
	/*int i = 10;
	while (i > 0) {
		System.out.println(i);
		i -= 2;		
		}	
	*/		
		for (;;) {
			System.out.println("hi!");	// 조건식 없이 무한루프 가능			
		}		
	}		
	}

