package com.test01;

public class Mtest02 {

	public static void main(String[] args) {
		// java 1.7 이후
		// 이전 : enum class
		String s = "한국";
		
		switch(s) {
		case "한국" :
			System.out.println("korea");
			break;
		case "중국" :
			System.out.println("china");
			break;
		case "일본" :
			System.out.println("japan");
			break;
		default:
			System.out.println("다른 나라 입니다.");
		}
	}

}
