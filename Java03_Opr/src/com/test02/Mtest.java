package com.test02;

public class Mtest {

	
	public static void main(String[] args) {
		FruitsBasket bananaBasket = new FruitsBasket();	//클래스 가지고 값을 만들었다 = 객체(instance)
		bananaBasket.setting("바나나",20);				//클래스는 객체를 만들기 위한 설계도 
		
		bananaBasket.size = 100;	
		FruitsBasket.size = 50;							//size가 static으로 되어있기 때문에 
		System.out.println(bananaBasket.size);
							
		bananaBasket.fruitCount = 100;
		System.out.println(bananaBasket.fruitCount);
		//FruitsBasket.fruitCount = 100;      static에서 non-static은 호출이 안됨. non-static은 static 호출 가능.
		
		
		FruitsBasket appleBasket = new FruitsBasket();
		appleBasket.setting("사과",30);
		System.out.println(appleBasket.size);
		System.out.println(appleBasket.fruitCount);		//non-static (객체 하나하나에 해당)이기 때문에
		
		
	}
	
}
