package com.test01;

public class MTest {

	static String str = "The String class represents character strings.";

	public static void main(String[] args) {
		String s = "Hello";
		System.out.println(1 + 2 + s);
		System.out.println(s);

		s = s + 1 + 2;
		System.out.println(s);
		// String concatenation
		System.out.println("--------------------");

		// 1. str의 전체 길이 (출력하자)
		System.out.println(str.length());

		// 2. str 전체 대문자로 바꿔서
		System.out.println(str.toUpperCase()); // is가 앞에 붙을 경우엔 보통 ~이니? 라고 물어보는
												// has가 앞에 붙을 경우엔 보통 ~가지고 있니? 라고 물어보는
												// to가 앞에 붙을 경우엔 보통 ~하자 라고 물어보는

		// 3. str 전체 소문자로 바꿔서
		System.out.println(str.toLowerCase());

		// 4. str에서 첫 번째로 나오는 c의 인덱스를
		System.out.println(str.indexOf('c'));

		// 5. "class" -> "java"로 바꿔서
		System.out.println(str.replace("class", "java")); // 값을 값으로 바꿔준다.
		// first = 첫번째만 바꿔준다.
		// all = 모두 바꿔준다.

		// 6. "character" 찾아서 대문자로 변환 후, 변환된 내용으로 전체출력
		// 변환을 먼저 하고 다시 출력
			String target = "character";
			int start = str.indexOf(target);
			int end = start + target.length();
			
			String upper = str.substring(start, end).toUpperCase();
			
			System.out.println(str.replace(target, upper));
	
		// 7. str을 char[]로 출력하되, 'c'만 출력, 그리고 c의 갯수도 출력
		char[] ch = str.toCharArray();
		int cnt = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'c' || ch[i] == 'C') {
				System.out.print(ch[i]);
				cnt++;
			}
		}
		System.out.println("\nc 의 갯수 : " + cnt);
		prn01();
		prn02();

	}

		// 8. str을 char[]로 출력하되, 대문자만 출력, 그리고 갯수도 출력
		public static void prn01() {
			char[] ch = str.toCharArray();
			int cnt = 0;
			for (int i = 0; i < ch.length; i++) {
				if (ch[i] >= 65 && ch[i] <= 90) {
				System.out.print(ch[i]);
				cnt++;
				
				// for문까지는 동일
				// if(character.isUpperCase(ch[i])){
				// System.out.print(ch[i]+" ");
				// cnt++;
				// }
			}
		}
		System.out.println("\n 대문자의 갯수 : " + cnt);

		// 9. str 안의 모든 공백 제거 후 출력
		System.out.println(str.trim());
		System.out.println(str.replace(" ",""));
		System.out.println(str.replaceAll(" ", ""));   //regex		
		
		}
		// 10. 전체 역순으로
		public static void prn02() {
		int index = 0;
		char[] ch = new char[str.length()];
		for(int i = str.length()-1 ; i >= 0; i--) {	//새로 저장된 공간 처음부터 저장
			ch[i] = str.charAt(index);	// 인덱스 처음 (T)를 가져온다. -> 그리고 맨뒤에 저장
					index++;
		}
		System.out.println(ch);
		
		}
		
	}


