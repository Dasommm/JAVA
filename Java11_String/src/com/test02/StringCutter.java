package com.test02;

import java.util.StringTokenizer;

public class StringCutter {

	public static void main(String[] args) {
		
		String str = "The String class represents character strings.";
		
		// 1.
		System.out.println(str.substring(4,10));
		
		// 2.
		String[] tmp = str.split(" "); // 정규표현, 공백을 기준으로 자른다.
		System.out.println(tmp[1]);
		
		// 3.
		String str2 = "represents.character.strings.";
		StringTokenizer st = new StringTokenizer(str2, ".");
				
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
			 // 점을 기준으로 잘린 토큰들이 나온다.
			
		}
		
	}
}
