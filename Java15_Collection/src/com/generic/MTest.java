package com.generic;

public class MTest {

	public static void main(String[] args) {
		/*
		 * // <>(generic)은 타입을 감지하며, 컬렉션안에 들어가는 값의 타입을 강제한다.
		 * // 값에 의도치 않은 타입의 값(에러)이 들어가지 않도록하기 위해서
		 * 
		List<Integer> list = new ArrayList<Integer>();	
		//list.add("1");								
		list.add(2);
		//list.add('c');
		list.add(null);
		list.add(3);
				
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		*/
		
		Emp<String> samsong = new Emp<String>();
		samsong.setEname("홍길동");
		samsong.setEmpno("dev0015");
		
		Emp<Integer> ig = new Emp<Integer>(19019,"이순신");
		
		Emp dhit = new Emp("abcd", "김선달");
		
		System.out.println(samsong);
		System.out.println(ig);
		System.out.println(dhit);
		
		
	}
}
