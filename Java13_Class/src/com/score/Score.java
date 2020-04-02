package com.score;

public class Score {

	private String name;
	private int kor;
	private int eng;
	private int math;

	public Score() {
	
	}
	public Score(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;

	}
	public String getName() {
		return name;

	}
	public void setName(String name) {
		this.name = name;

	}
	public int getKor() {
		return kor;

	}
	public void setKor(int kor) {
		this.kor = kor;
		
	}
	public int getEng() {
		return eng;

	}
	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
		
	}
	public void setMath(int math) {
		this.math = math;
		
	}
	public int getSum() {
		return kor + eng + math;

	}
	public double getAvg() {
		return (double)getSum()/ 3;	//casting 해준다.

	}
	public String getGrade() {
		
		switch((int)getAvg()/10) {
		case 10: case 9:
			return "A";
		case 8:
			return "B";
		case 7:
			return "C";
		case 6:
			return "D";
			
		}
		return "F";
		
	}

	@Override
	public String toString() {
		return "이름 : " + name + " 국어 : " + kor + " 영어 : " + eng + " 수학 : " + math + " 총점 : " + 
				getSum() + " 평균 : "+ getAvg() + " 등급 : " + getGrade();
	// toString이 없으면 주소값이 나온다. 
	}

}
