package com.test02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListTest02 {
	
	public static void main(String[] args) {
		List<String> li = new ArrayList<String>();
		for(int i =1 ; i <11 ; i++) {
			li.add(i+"");
		}
		System.out.println(li);
		Collections.shuffle(li);
		System.out.println(li);
		Collections.sort(li);	// 사전식으로 정렬 , 문자열이기 때문에
		System.out.println(li);
		
		Collections.sort(li, new MySortTest());
		System.out.println(li);
		
	}

}

class MySortTest implements Comparator<String>{
	public int compare(String o1, String o2) {
		/*
		int tmp1 = Integer.parseInt(o1);
		int tmp2 = Integer.parseInt(o2);
		
		if(tmp1 > tmp2) {
			return 1;
		}else if(tmp1<tmp2) {
			return -1;
		}
		
		return 0;
		*/
		return -1;
	}
	
	// comparable : 자기와 다른 객체를 비교
	// comparator : 비교할 조건만 객체로 만들어주고 해당 객체를 정렬에 같이 넣어준다
	
}