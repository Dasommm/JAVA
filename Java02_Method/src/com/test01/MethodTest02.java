package com.test01;

public class MethodTest02 {

	public static void main(String[]args) {
		//메모리 영역 : static / (non-static)
		//static : class명.method이름(); 로 호출한다.
		MethodTest01.publicMethod();
		MethodTest01.protectedMethod();
		MethodTest01.defaultMethod();
		//MethodTest01.privateMethod(); -> not visible 
				
		//(non-static) 
		//class 변수 = new class();
		//변수.method();
		//MethodTest01.nonStaticMethod();
		MethodTest01 method01 = new MethodTest01();	
		// new MethodTest01의 값을 MethodTest01 type의 method01에 대입한다.
		method01.nonStaticMethod();
					
	}
}
