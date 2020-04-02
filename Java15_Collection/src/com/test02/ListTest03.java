package com.test02;

import java.util.ArrayList;
import java.util.List;

public class ListTest03 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		// 입력 순서가 있다. 중복 가능. 
		list.add("홍길동");
		list.add("김길동");
		list.add("신길동");
		list.add("김길동");
		list.add("박길동");
		
		System.out.println(list);
		
	}

}
