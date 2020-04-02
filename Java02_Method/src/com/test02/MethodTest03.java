package com.test02;

import com.test01.MethodTest01;

//다른 패키지의 메소드들 사용하려면



public class MethodTest03 {
	
	public static void main(String[] args) {
		MethodTest01.publicMethod();
		//MethodTest01.protectedMethod();  같은 패키지 내에서
		// MethodTest01.defaultMethod();  같은 패키지 내에서
		// MethodTest01.privateMehod();		같은 클래스 내에서
		
		MethodTest01 test = new MethodTest01();
		test.nonStaticMethod();
		
		//UML : Unified Modeling Language - 미리 구조화 시켜준다
		//https://www.objectaid.com/home
		
		
	}
	
}
