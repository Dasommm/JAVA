package com.test02;

public class MTest {

	public static void main(String[] args) {
		/*
		Cat cat = new Cat();
		cat.bark();
		Dog dog = new Dog();
		dog.bark();
		*/
		
		Animal some = null;
		some = new Dog();
		some.bark();
		
		some = new Cat();
		some.bark();
		
		if(some instanceof Dog) {  	// 오른쪽의 인스턴스 값이 왼쪽과 같니?
			System.out.println("멍멍이다!");
		}else if(some instanceof Cat) {
			System.out.println("고양이다!");
		}
		 		
	}
		
}

/*
  다형성 polymorphism
 1. 부모(선조)의 타입으로 자식(후손)객체 생성
 parent p = new Child();

 2. 부모의 타입으로 자식 대입
 Child c = new Child();
 Parent p = c;
 
 3. 부모의 매서드를 통해 자식 메서드 호출
 
 *같은 부모클래스를 가지고 있는 자식 클래스는
 *컴파일시 형 변환이 가능하지만
 *런타임시 ClassCastException을 발생시킨다.
*/
