package com.test01;

import java.util.Vector;

public class VectorTest01 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>(10, 5);
		System.out.println(v.size() + ":" + v.capacity());

		for (int i = 0; i < 10; i++) {
			v.add(i);
			System.out.println(v.size() + ":" + v.capacity());
		}

		System.out.println("---------------------");
		v.add(10);
		System.out.println(v.size() + ":" + v.capacity());

	}

}
