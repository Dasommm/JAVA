package com.test02;

class MyCalc extends Thread {
	private int start;
	private int stop;
	int sum;

	public MyCalc(int start, int stop) {
		this.start = start;
		this.stop = stop;
	}
	@Override
	public void run() {
		super.run();
		sum = 0;

		for (int i = start; i <= stop; i++) {
			sum += i;
			System.out.println("Current Thread : " + currentThread().getName());
		}
	}
}
public class JoinTest {

	public static void main(String[] args) {

		MyCalc t01 = new MyCalc(1, 5);
		MyCalc t02 = new MyCalc(6, 10);

		t01.start();
		t02.start();

		try {
			t01.join();
			t02.join();

		} catch (InterruptedException e) {
			e.printStackTrace();

		}
		System.out.println("Thread1 sum : " + t01.sum);
		System.out.println("Thread2 sum : " + t02.sum);
		System.out.println("Total sum : " + (t01.sum + t02.sum));
	}
}
