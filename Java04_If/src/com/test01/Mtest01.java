package com.test01;

public class Mtest01 {

	public static void main(String[] args) {	// 기능이 있는 메소드들을 호출해주는  main 메소드
				
	prn01();
	prn02(true,false);		// boolean type의 값 : true / false
	
		
	}
	
	public static void prn01() {
		// if : 만약 ~라면 
		int i = 10;
		int j = 20;		
		
		//if 
		if (i < j) {		// 조건이 맞다면 중괄호 안의 내용을 출력해준다.  참 일때 실행
			System.out.println("i가 j보다 작아요.");
						
		}
		
		// if ~ else
		if (i > j) {							//조건이 참일 때
			System.out.println("i가 j보다 커요.");	
		} else {								//조건이 거짓일 때
			System.out.println("i가 j보다 안커요.");
		}
		
		//if ~ else if ~  : 조건을 여러개 연결
		if(i > 15) {			
			System.out.println("i가 15보다 커요.");
		} else if(i > 10) {
			System.out.println("i가 10보다 커요.");
		} else if(i == 10) {						// 위에서부터 조건을 찾아가면서 참이 되면 if문을 빠져나간다.
			System.out.println("i가 10과 같아요.");
		} else {									// 꼭 else로 끝나지 않고 이 문장은 안 적어도 된다.
			System.out.println("i가 10보다 작아요.");
		}
			
		
	}
	private static void prn02(boolean ring, boolean married) {	//boolean 은 참인지 거짓인지, 
	
		if(ring) {
			if(married) {
				System.out.println("결혼하셨군요!");
			} else {
				System.out.println("연인이 있으시군요!");
			}
					
		}else {
			if(married) {
				System.out.println("연인이 있으시군요!");
			} else {
				System.out.println("솔로시군요..");
			}
		}
		
		if(ring && married) {						// 모두 참이어야 참
			System.out.println("결혼하셨군요!");
		} else if(ring || married) {				// 하나만 참이어도 참
			System.out.println("연인이 있으시군요!");
		} else {		
			System.out.println("솔로시군요..");
		}
		
		if(ring)
			System.out.println("반지 있다.");
		
		if(married) {
			System.out.println("결혼했다.");		// {}가 없는 것들은 바로 다음 줄만 인식된다.
			System.out.println("부럽다.");
		}
	}	
}


