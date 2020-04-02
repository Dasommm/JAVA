package com.profile;

public class MyProfile extends Profile implements Job, Display {
	private String loc;

	public MyProfile(String name, String phone) {
		super(name, phone);

	}

	@Override
	public void display() {
		prn();
		System.out.println("회사주소 : " + loc);
		System.out.println("회사직종 : " + JOB_ID);
		// super : 부모 클래스를 의미 / interfacer는 super를 사용할 수 없다.

	}

	@Override
	public void jobLoc(String loc) {
		this.loc = loc;

	}

}
