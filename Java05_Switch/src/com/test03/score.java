package com.test03;

public class score {

	public double getAvg(int kor, int eng, int math) {
		double res = (kor + eng + math) / 3;
		return res;
		
		//return (double)(kor + eng + math)/3.0;  으로 해도 된다.
		
	}
	
	public String getGrade(double avg) {

		switch((int)avg/10) { // 스위치는 더블형을 인식하지 못한다. 식 또는 문자열 = 정수형
		case 10 : 
		case 9 : 
			return "A";		//case 안에서 바로 return할 수 있다. break는 필요없다. return이 있기 때문에 
		case 8 : 
			return "B";
		case 7 : 
			return "C";
		case 6 : 
			return "D";
		default :
			return "F";
		}
		
		
		// return null;을 쓰지 않는 이유. 위에 디폴트가 있기 때문에 필요가 없음. 
		// return null 을 쓰려면 위의 디폴트를 지우고, return "F"; 해도 된다.
		


		
	}
}
