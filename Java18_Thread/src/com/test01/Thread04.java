package com.test01;

public class Thread04 {

	public static void main(String[] args) {
		MyThread03 cat = new MyThread03("야옹");
		MyThread03 dog = new MyThread03("멍멍");

		long startTime = System.currentTimeMillis();

		cat.start();

		try {
			cat.join();
			// cat thread가 종료될 때 까지 다른 thread를 멈춘다.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		dog.start();

		long endTime = System.currentTimeMillis();

		System.out.println("실행시간 : " + (endTime - startTime));

	}
}
