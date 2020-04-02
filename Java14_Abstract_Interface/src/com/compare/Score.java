package com.compare;

public class Score implements Comparable<Object> {

	private String name;
	private int kor;
	private int eng;
	private int math;
	
	// 생성자 (기본 생성자, 파라미터 4개짜리 생성자)
	public Score() {
		super();
	}
	
	public Score(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	// getter & setter 

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getMath() {
		return math;
	}

	public int getEng() {
		return eng;
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
	
	public int getSum() {
		// 3개 다 더해서 리턴
		return kor + eng + math;
	}
	public double getAvg() {
		// 더해진 값을 평균으로 만들어서 리턴
		return (double)getSum() /3;  // 또는 getSum()/3.0;
	}
	
	public String getGrade() {
		// 90 ~ 100 : A
		// 80 ~ 89 : B
		// 70 ~ 79 : C
		// 60 ~ 69 : D
		// ~59 : F 리턴
		switch ((int)getAvg()/10) {
		case 10 :
		case 9 :
			return "A";		
		case 8 :
			return "B";		
		case 7 :
			return "C";		
		case 6 : 
			return "D";		
		default : 
			return "F";
					
		}
				
	}

	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", getSum()=" + getSum()
				+ ", getAvg()=" + getAvg() + ", getGrade()=" + getGrade() + "]";
	}

	@Override
	public int compareTo(Object o) {
		/*
		 * 앞의 값이 더 크면 1, 같은 값이면 0, 뒤의 값이 더 크면 -1
		 */
		
		Score other = (Score)o;
		
		if(this.getKor() > other.getKor()) {
			return 1;	//오름차순
		}else if (this.getKor() < other.getKor()) {
			return -1;
		}else if (this.getKor() == other.getKor()) {
			if(this.getEng() > other.getEng()) {
				return -1; 	//내림차순
			}else if(this.getEng() <other.getEng()) {
				return 1;
			}
		}
				
		return 0;
	}

	
	}

