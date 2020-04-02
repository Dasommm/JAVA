package com.test01;

class MyThread02 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("i:" + i);

		}

	}

}

public class Thread02 {

	public static void main(String[] args) {

		MyThread02 t01 = new MyThread02();
		MyThread02 t02 = new MyThread02();

		t01.start();
		t02.start();

	}
	// runnable은 Thread화 시켜서 작동
	// extends Thread는 바로 사용 가능
}
