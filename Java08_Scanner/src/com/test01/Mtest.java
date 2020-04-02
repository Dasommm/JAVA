package com.test01;

public class Mtest {

	// class 우클릭 -> run as -> run configurations -> arguments -> program arguments -> ${string_prompt}
	// 공백을 기준으로 값이 저장된다.
	
	public static void main(String[] args) {
		//System.out.println(args[0]);

		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}

}
