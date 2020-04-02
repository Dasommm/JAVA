package com.test01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MTest02 {

	public static void main(String[] args) {
		File fi = new File("a.txt");
		
		try {
			myOutput(fi);
			myInput(fi);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}	
	//read()
	private static void myInput(File fi) throws IOException {	// fileNotFound Exception이 IOException으로 바뀜
		FileReader fr = new FileReader(fi);
		int ch;
		
		// -1 : file의 끝
		while ((ch = fr.read()) != -1) {	// 파일의 끝이 아니라면 반복하자.
			System.out.print((char)ch);
		}
		
		fr.close();
			
	}
	//write()
	private static void myOutput(File fi) throws IOException {	// throws => 해당 메소드를 호출한 애한테 예외를 미뤄버림
																// throw => 예외를 발생시킨다.
		FileWriter fw = new FileWriter(fi, true);			// true는 파일을 생성해준다. false는 덮어쓰기	
		fw.write("연습중입니다. \n");
		fw.append("abc\n");
					// append는 method chaining 가능하다.
		
		fw.close();
		
	}
	
}
