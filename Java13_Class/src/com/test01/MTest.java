package com.test01;

public class MTest {

	public static void main(String[] args) {
		AA a = new AA();
		Super s = a;
		// BB b = (BB)s; 
		
		System.out.println(a.hashCode());
		System.out.println(s.hashCode());
		
		

	}

}
