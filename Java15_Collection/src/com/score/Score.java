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

	public void setName(String name) {
		this.name = name;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public int getSum() {
		return kor + eng + math;
	}

	public double getAvg() {
		return (double) getSum() / 3;
	}

	@Override
	public String toString() {
		return "이름 : " + name + ", 국어 : " + kor + ", 영어 : " + eng + ", 수학 : " + math + 
				", 총 점 : " + getSum() + ", 평균 : "+ getAvg();
	}

}
