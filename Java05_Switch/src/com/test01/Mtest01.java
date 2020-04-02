package com.test01;

public class Mtest01 {

	public static void main(String[] args) {
		
		prn01();
		prn02();
		prn03();
		
	}
	
	private static void prn03() {
		char c = 'b';
		
		switch(c) {
		case 'a' : 
			System.out.println("a 입니다.");
			break;
		case 'b' :
			System.out.println("b 입니다.");
			break;
		case 'c' :
			System.out.println("c 입니다.");
			break;
			
		}
		
	}

	private static void prn02() {

		switch(6) {
		 	case 1:
			case 3:
				System.out.println("홀수 입니다.");
				break;
			case 2: 
			case 4:
				System.out.println("짝수 입니다.");
				break;
			default:
				System.out.println("다른 숫자 입니다.");
			}
		
	}

	public static void prn01() {
		//Switch : 해당 case(값)로 jumping 후 fall through / 점핑 이후로 쭈루룩 다 실행
		int i = 2;
		
		switch(i) {
		case 1: 
			System.out.println("1입니다.");
			break;	// 뒤의 내용은 실행하기 싫을 때 . 끝나고 넘어가 버린다.
		case 2:
			System.out.println("2입니다.");
			break;
		case 3:
			System.out.println("3입니다.");
			break;
		case 4:
			System.out.println("4입니다.");
			break;
			
		}
		
		
		
	}
	
	
}


