package com.test02;

public class Gugu {

	public static void main(String[] args) {
	
		//gugu01();
		//gugu02(3);
		gugu03();		

	}
	
	public static void gugu01() {
		// 2단 ~ 9단까지 전체 출력  (for)
			
		for(int i = 2 ; i < 10 ; i++) {
			System.out.println("<"+i+"단>");
			for(int j = 1 ; j < 10; j++) {
				System.out.println(i+" * "+j+" = "+ i*j);
				//system.out.printf("%d * %d = %d \n, i, j, i*j);
			}		
			System.out.println();			
		}		
	}
	
	public static void gugu02(int i) {
		// i단만 출력 (for)
		
		 	System.out.println("<"+i+"단>");
			for(int j = 1 ; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}		
			// System.out.println();	해도되고 안해도 된다.		
		}			
	
	public static void gugu03() {
		// 2단 ~9단까지 전체 출력 (while)
		
		int i = 2;		
		
		while(i < 10) {
			System.out.println("<"+i+"단>");
			int j = 1;
			while (j < 10) {				
				System.out.println(i+" * "+j+" = "+ i*j);
				j++;
				
				}
				i++;				
				System.out.println();		
			}		
		
	}

}
