package com.test04;

public class MTest {

	public static void main(String[] args) {
		int kor, eng, math; 		// 변수를 선언한다
		kor = eng = math = 0;		// 값을 할당, 초기화
		
		kor = 100; 					// 초기화 된 값이 바뀜
		eng = 34;
		math = 79;
		
		int sum;
		double avg; 	
				
		sum = getSum(kor,eng,math);
		avg = getAvg(sum);
		
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+avg);
		
	}
	
	// 1. 국어, 영어, 수학 점수를 받아서 총점을 리턴하는 메서드를 만들자.
	// 접근제한자는 default, 메모리 영역은 static, 리턴 타입은 int 
	// 파라미터는 int형 변수 3개, 이름은 getSum이다.
	
	static int getSum(int kor, int eng, int math) {
		int sum = kor + eng + math;
		return sum;
	}
	
	// 2. 총점을 받아서 평균을 리턴하는 메서드를 만들자.
	// 접근제한자는 private, 메모리 영역은 static, 리턴타입은 double
	// 파라미터는 int형 변수 1개, 이름은 getAvg이다.
	
	private static double getAvg(int sum) {
		double res = (double)sum / 3;
		return res;
		
	}
	
	// 3. main 메서드에서 getSum과 getAvg를 호출하여, 
	// 총점과 평균을 출력하자.
		
	
}
