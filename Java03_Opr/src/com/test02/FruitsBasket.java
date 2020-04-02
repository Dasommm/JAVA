package com.test02;

public class FruitsBasket {
	
	// class diagram을 보고 FruitsBasket class를 작성하자.
	/* - fruitsCount의 초기값은 5이다.
	 * - setting 메서드를 호출할 때, size 변수에 30을 대입하자.
	 * - setting 메서드의 string 파라미터는 과일의 이름을 받아서 
	 *  fruitName 변수에 대입하고,
	 *  int변수는 과일의 갯수를 받아서 fruitCount 변수에 더해서 대입하자(+=)
	 *  -basketPrn 메서드는 size와 fruitCount의 값을 비교해서,
	 *  size가 크거나 같으면 과일이름 + "의 갯수는 " +갯수 +"입니다."
	 *  작으면 "바구니가 꽉 찼습니다."를 출력한다. 
	 */

	// field : class의 속성 (메소드 밖에 적는다.)
	static int size = 30;							//과일 바구니의 사이즈
	public int fruitCount =5;  // 초기값은 5이다.      과일바구니에 들어있는 갯수 
	private String fruitName;					//과일바구니에 들어있는 과일의 이름
	
	// method : class의 기능 - 행위들 
	public void setting(String name,int cnt) {  //string은 과일의 이름을 받고, int는 과일의 갯수를 받기 때문에
		//size = 30;
		fruitName = name;
		fruitCount += cnt; // fruitCount = fruitCount + cnt;
						
		basketPrn();
		
	}
		
	private void basketPrn() {
		
		String res = (size >= fruitCount)? 	
			fruitName + "의 갯수는 " + fruitCount + "개 입니다." : "바구니가 꽉 찼습니다.";
		System.out.println(res);
		
	}	
		
}
