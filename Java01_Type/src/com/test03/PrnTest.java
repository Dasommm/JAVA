package com.test03;

public class PrnTest {

	/*
	 * System.out.print(); - 줄 바꿈 없음
	 * System.out.println(); - 출력후, 줄 바꿈 있음
	 * System.out.printf(); - 줄 바꿈 없음. 'f':formatter (자리or형식 지정가능)
	 *                             //1 more
	 * System.put.printf(String format, object,...);
	 * 
	 * java.util.Formatter
	 * 
	 * 
	 */
	 public static void main(String[] arg) {
		 int i = 100;
		 
		 System.out.print("1.i=" + i);
		 System.out.println("2.i="+ i);
		 System.out.printf("3.i = %10d %5d \n", i,i);   // \n은 줄바꿈  %10d는 자릿수 10칸 
		 						//%5d는 자릿수 5칸
		 
		 System.out.println("-----------------------------");
		 
		 /*
		  * printf()를 사용하자!
		  * 시험 점수 결과는 (su)점이고, 학점은'(ch)'가 나왔다.
		  * 나의 오늘 감정지수는 (d)%이다.
		  * 
		  */
		 
		 int su = 100; 			//자릿수 5칸
		 char ch = 'A';			//자릿수 3칸
		 double d = 96.789; 	// 자릿수 2칸, 소숫점 둘째자리까지
		 
		 System.out.printf("시험 점수 결과는 %5d점이고,학점은 '%3c'가 나왔다. \n"
		 		+ "나의 오늘 감정지수는 %2.2f%% 이다",su,ch,d);
		 
		 
		 
	 }
	
}
