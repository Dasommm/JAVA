package com.test02;

public class MTest {

	public static void main(String[] args) {
		
		//stringTest();
		stringBufferTest();
			
	}
	
	public static void stringBufferTest() {
		//mutable : 값이 변한다.
		StringBuffer sb = new StringBuffer();
		sb.append("안녕하세요").append("저는").append("이순신 입니다.");
		// 메소드가 연결되어 사용되어진다. method chaining
		
		System.out.println(sb);
		System.out.println(sb.hashCode());
				
	}
	
	public static void stringTest() {
		String s = "안녕하세요";
		s += "저는";
		s += "홍길동 입니다.";
				
		System.out.println(s);
				
		System.out.println(s.hashCode());
		// 더하기 "저는"을 했더니 주소값이 바뀜. 
		// String POOL에 새로 만들어졌기 때문에
		
		s.replace("안녕하세요", "하이!");	// 값을 바꾸었는데도 내용이 바뀌지 않는다.
		System.out.println(s);		// ? -> 현재 3개가 만들어졌다.
									// 안녕하세요./ 저는 / 안녕하세요 저는 홍길동입니다.
									// 값은 바뀌었지만 주소값이 바뀐 주소를 가르키지 않기 때문
		s = s.replace("안녕하세요", "하이");	// 대입을 해주어야한다.
		System.out.println(s);
					
	}
}
