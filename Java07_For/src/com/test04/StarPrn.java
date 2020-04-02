package com.test04;

public class StarPrn {
	//반복문 사용해서 풀기
	
	public void prn01() {
		// ★
		// ★★
		// ★★★
		// ★★★★
		// ★★★★★
			
		
		// i = 줄 (0,1,2,3,4)
		// j = ★(0+1), ★★(1+1), ★★★(2+1), ★★★★(3+1), ★★★★★(4+1)
		
		for(int i = 0; i < 5; i++) {
			
			for(int j = 0 ; j < i+1; j++) {
				System.out.print("★");
			}
			System.out.println();
		}		
		
		/* 이것도 가능한 코드
		 * for (int i = 1; i < 6; i++) {
			
			for(int j = 0; j < i ; j++){
					System.out.print("★");
			}
					System.out.println();
		}
		*/
	}			
			
	public void prn02() {
		// ★★★★★
		// ★★★★
		// ★★★
		// ★★
		// ★		
		
		//i는 줄 (0,1,2,3,4)
		for (int i = 0; i < 5; i++) {
				//j의 조건이 무엇일지 고민을 해보자
			for (int j = 0 ; j < 5-i; j++) {
				// j = (5-0)개, (5-1)개, (5-2)개, (5-3)개, (5-4)개
				System.out.print("★");
			}
			System.out.println();
		}
		
	}
	
	public void prn03() {
		//  □□□□★
		//  □□□★★
		//  □□★★★
		//  □★★★★
		//  ★★★★★
		
		// 큰 for안에 작은 for 2개 (공백, 별)
				
		for (int i = 0; i <5; i++) {
			// 공백이 (4-0)개 (4-1)개 (4-2)개 (4-1)개 (4-4)개 
			
			for(int j = 0; j < 4-i; j++) {
				System.out.print(" ");
			}
		
			// 별이    (1+0)개 (1+1)개 (1+2)개 (1+3)개 (1+4)개 
			for (int k = 0; k < 1+i; k++) {
				System.out.print("★");
			}
		System.out.println();

		}
	}
	
	public void prn04() {
		// ★★★★★
		//  ★★★★
		//   ★★★
		//    ★★
		//     ★
		
		for(int i = 0; i <5 ; i++) {
			
			//공백 (0+0, 0+1, 0+2, 0+3, 0+4)
			for(int j = 0 ; j < 0+i; j++) {
				System.out.print(" ");
			}
			
			//별 (5-0, 5-1, 5-2, 5-3, 5-4, 5-5) 
			for(int k = 0 ; k < 5-i; k++) {
				System.out.print("★");
			}
			System.out.println();	
		
		}		
	}
	
	public void prn05() {
		//       ★
		//      ★★★
		//     ★★★★★
		//    ★★★★★★★
		//   ★★★★★★★★★
		
		// 3번을 응용해서 해도 된다.
		
		for(int i = 0 ; i < 5; i++) {
			//공백 (4-0, 4-1, 4-2, 4-3, 4-4)
			for(int j = 0; j < 4-1 ; j++) {
				System.out.print(" ");
				
			}
			
			// 별 (2*0+1, 2*1+1, 2*2+1, 2*3+1, 2*4+1)
			for (int k = 0 ; k < 2*i+1; k++) {
				System.out.print("★");
				}
			System.out.println();
			
		}
		
		
		
	}

	

}
