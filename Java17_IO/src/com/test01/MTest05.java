package com.test01;

import java.io.File;

public class MTest05 {

	public static void main(String[] args) {
		File fi = new File("c:\\");
		 //prn01(fi);
		prn02(fi);

	}

	public static void prn01(File fi) {
		for (String list : fi.list()) {
			System.out.println(list);

		}

	}

	public static void prn02(File fi) {
		int dir = 0;
		int file = 0;

		for (File f : fi.listFiles()) {

			if (fi.isDirectory()) {
				dir++;
				System.out.println("dir : " + f.getName());
			} else if (fi.isFile()) {
				file++;
				System.out.println("file : " + f.getName());

			}

		}
		System.out.printf("dir의 총 갯수 : %d\n", dir);
		System.out.printf("file의 총 갯수 : %d", file);
	}

}
