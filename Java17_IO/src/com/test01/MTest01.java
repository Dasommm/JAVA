package com.test01;

import java.io.File;
import java.io.IOException;

public class MTest01 {
	
	public static void main(String[] args) {
		File fi = new File("C:\\test_io");
		
		if(fi.exists()) {
			System.out.println("exist!");
			
		}else {
			System.out.println("new!");
			fi.mkdirs();
						
		}
		
		File fic1 = new File(fi,"AA");
		fic1.mkdir();
		
		File fic2 = new File("c:\\test_io","BB");
		fic2.mkdir();
		
		File fitxt = new File(fic1,"a.txt");
		
		try {
			fitxt.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
									// checked exception 컴파일 시에 자바가 알려준다.
		}												
		
	}

}
