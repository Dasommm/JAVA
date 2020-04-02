package com.profile;

public class Profile {
	private String loc;

	private String name;
	private String phone;

	public Profile(String name, String phone) {
		this.name = name;
		this.phone = phone;

	}

	public void prn() {
		System.out.println("이      름 : " + name);
		System.out.println("전화번호 : " + phone);
	}

}
