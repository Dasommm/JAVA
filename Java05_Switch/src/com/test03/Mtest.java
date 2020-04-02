package com.test03;

public class Mtest {

	public static void main(String[] args) {
		// Score 클래스를 완성하자.
		// getAvg 메소드는, 국어 영어 수학 점수를 전달하면 
		// 평균을 리턴해준다.
		// getGrade 메소드는, 평균을 전달하면 
		// 90~100 : A
		// 80~89 : B
		// 70~79 : C
		// 60~ 69 : D
		// 0 ~ 59 : F 를 리턴해준다.
		//"ㅇㅇㅇ님의 평균은 xx.xx점이고, 등급은 'ㅁ'입니다."라고 출력.
		
		//String avg = score.getAvg(80,90,90);   //getAvg는 non-static이기 때문에 이렇게 부르면 안됨.
		
		score sc = new score();
		double avg = sc.getAvg(80, 90, 90);
		//System.out.println(avg);
		
		String grade = sc.getGrade(avg);
		
		System. out.printf("권다솜 님의 평균은 %.2f 점이고, 등급은 %s 입니다.", avg, grade);

		
	}

}
