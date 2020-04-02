package com.test02;

import java.util.Arrays;

public class ShallowCopy {
	// 얕은 값 복사 (해당 배열의 주소값 복사)
	public static void main(String[] args) {
		int[] original = { 10, 20, 30, 40, 50 };
		int[] copy = original;

		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(copy));

		System.out.println(original == copy);

		copy[0] = 100;

		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(copy));
		// 주소를 참조하기 때문에 안에 내용이 바뀌어도 같은 것을 출력한다.

		// hashCode :객체의 주소값
		System.out.println(original.hashCode());
		System.out.println(copy.hashCode());

	}

}
