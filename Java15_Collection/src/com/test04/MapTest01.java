package com.test04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.score.Score;

import java.util.Set;

public class MapTest01 {	// 얘는 collection의 상속을 받지 않는다.
							// map도 순서 없고, 중복 안된다.(key 값은 중복 안되지만 value값은 중복 가능) 
							// key를 통해서 안에 있는 value를 가져올 수 있다.
							// map은 key를 통해서만 value에 접근을 할 수 있지만
							// map.entry Map에서는 key값과 value값을 따로 접근/가져올 수 있다.
	public static void main(String[] args) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 111 ; i <116 ; i++) {
			map.put(i, i+1000);			
		}
		
		map.put(112,119);		// 중복이 안된다.
					
		System.out.println(map);
		System.out.println(map.get(112));
		
		prn(map);
			
	}

	private static void prn(Map<Integer, Integer> map) {
		Set<Map.Entry<Integer,Integer>> entrySet = map.entrySet();
		/*
		for(Entry<Integer, Integer> entry : entrySet) {
			//System.out.println(entry.getValue());
			if(entry.getValue() == 1113) {
				System.out.println(entry.getKey());
			}		
		}
		*/
		//iterator를 사용해서 위의 forEach문과 같은 결과를 출력하자.
		
		Iterator<Entry<Integer, Integer>> ir = entrySet.iterator(); 	
		// entrySet에 있는 내용을 iterator로
		while (ir.hasNext()) {
			Entry <Integer, Integer> tmp = ir.next();
			if(tmp.getValue() ==1113) {
				System.out.println(ir.next().getKey());
				
			}
		}		
		
	}
	
}
