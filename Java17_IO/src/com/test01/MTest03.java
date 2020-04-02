package com.test01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MTest03 {

	public static void main(String[] args) {
		File fi = new File("a.txt");

		myInput(fi);
		myOutput(fi);
		// input과 output 순서 중요하다!
	}

	private static void myOutput(File fi) {
		FileWriter fw = null; // file writer를 열었으면 닫아줘야한다.
		try {
			fw = new FileWriter(fi, true);
			fw.write("연습중입니다.");
			fw.append("abc").append("def\n");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close(); // 닫아준다.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	private static void myInput(File fi) {
		// try with resource : try(예외가 발생할 수 있는 구문 ){명령 ;} catch(){}...
		// 만일 close()해주는 객체가 있다면, 자동으로 close();
		try (FileReader fr = new FileReader(fi);) {
			int ch;
			while ((ch = fr.read()) != -1) {
				System.out.print((char) ch);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace(); // 발생할 수 있는 예외들을 생성해줌
		}
	}
}
