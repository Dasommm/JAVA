package com.test03;

import java.util.Arrays;

public class MTest {

	public static void main(String[] args) {
	
		Person lee = new Person();
		lee.name = "이순신";
		lee.age = 33;
		
		Person hong = new Person();
		hong.name = "홍길동";
		hong.age = 19;
		
		Person cho = new Person();
		cho.name = "조세호";
		cho.age = 40;
		
		// 객체 배열
		Person[] qclass = new Person[27];		//참조타입  	//변수를 여러개 만들지 않아도 가능 
		qclass[0] = new Person();
		qclass[0].name = "이동헌";
		qclass[0].age = 100;
		
		qclass[1] = new Person();
		qclass[1].name = "강유진";
		qclass[1].age = 20;
		
		qclass[2] = new Person();
		qclass[2].name = "권다솜";
		qclass[2].age = 20;
		// int type에 아무 값을 넣지 않으면 0, String type에 아무 값을 넣지 않으면 null
		
		System.out.println(Arrays.toString(qclass));
		System.out.println(qclass[0].name);
		System.out.println(qclass[0].age);
	}

}
