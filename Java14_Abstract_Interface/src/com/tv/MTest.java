package com.tv;

public class MTest {

	public static void main(String[] args) {

		SamsongTV samsong = new SamsongTV();
		samsong.volumeUp();
		samsong.volumeUp();
		System.out.println(samsong.getVolume());

		IgTV ig = new IgTV();
		ig.volumeUp();
		ig.volumeUp();
		ig.volumeDown();
		System.out.println(ig.getVolume());

	}
}
