package com.test03;

public class SumX {
	/*
	 *   1  2  3  4  5 
	 *   6  7  8  9 10
	 *  11 12 13 14 15
	 *  16 17 18 19 20
	 *  21 22 23 24 25
	 *  X의 총 합     
	 *  X의 평 균     
	 *  
	 */
	

	public static void main(String[] args) {
		prn();
				
	}
	
	public static void prn() {
		int cnt = 1;		// 1씩 증가하면서  1부터 25까지 
		int sum = 0;		// 해당 내용에 적합한 숫자들의 합
				
		for (int i = 0; i < 5 ; i++) {
			for(int j = 0 ; j < 5; j++) {
				
				if((i == j) || (i + j == 4)) {
					
					sum += cnt;		// sum = sum + cnt;
				}
					
				System.out.printf("%3d ", cnt++); 	//후위 연산자이기 때문에 
				// 얘가 숫자를 찍어준다. (0,0)에는 1을, (0,1)에는 2를...
			}
		System.out.println();				
		}		
		System.out.println("총 합은 " + sum);
		System.out.println("평균은 " + sum / 9.0);
	
	}
}

