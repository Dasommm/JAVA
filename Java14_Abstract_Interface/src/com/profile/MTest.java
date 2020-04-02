package com.profile;

public class MTest {

	public static void main(String[] args) {
		/*
		 * Profile과 Display, Job을 상속받는 MyProfile 클래스를 만들자.
		 */

		MyProfile my = new MyProfile("kh", "010-1234-5678");
		my.jobLoc("강남");
		my.display();

	}

}
