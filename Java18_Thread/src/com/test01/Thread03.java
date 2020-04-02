package com.test01;

class MyThread03 extends Thread {

	public MyThread03(String name) {
		super(name);

	}

	@Override
	public void run() {
		super.run();
		for (int i = 0; i < 1000; i++) {
			System.out.println(this.getName() + ":" + i);
		}
	}
}

public class Thread03 {

	public static void main(String[] args) {
		MyThread03 t01 = new MyThread03("야옹");
		MyThread03 t02 = new MyThread03("멍멍");

		// java의 thread scheduling은 우선순위(priority)와 순환할당(round-robin) 방식을 사용한다.

		t01.setPriority(Thread.MIN_PRIORITY);
		t02.setPriority(10);

		t01.start();
		t02.start();

	}

}
