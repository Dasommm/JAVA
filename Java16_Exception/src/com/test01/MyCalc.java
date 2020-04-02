package com.test01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyCalc {

	public int inputNum() {
		int n = 0;
		System.out.println("숫자만 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
				n = sc.nextInt();
		
		return n;
		
	}
	
	public int calculation() {
		int res = 0;
		
		while(true) {
			try {						// try안에 예외가 발생할 수 있는 명령을 넣어둔다.
				res = inputNum() / inputNum();
				String a = "10";
				int i = Integer.parseInt(a);
			System.out.println(res);
			break;
		} catch(InputMismatchException e) {	
			System.out.println("숫자 입력 에러");
			//e.printStackTrace();
		}catch(NumberFormatException e) {	// try에서 날 수 있는 에러들을 잡아줄 수 있는 것을 넣어둔다.
			 System.out.println("숫자변환에러");
			 e.printStackTrace();
		
		}finally {						
			// 예외가 발생하든 하지 않든 위에 내용이 수행이 되면 수행하게 된다.
			System.out.println("----------");
	 		
		}
	}
			return res;
	}
	
}
