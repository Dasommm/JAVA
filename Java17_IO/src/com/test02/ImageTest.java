package com.test02;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageTest {

	public static void main(String[] args) throws IOException {
		String fileName = "module.jpg";
		
		/*
		FileInputStream fi = new FileInputStream(fileName);
		BufferedInputStream bi = new BufferedInputStream(fi);
		요것들을 한 줄로 가능 
		*/ 
		
		BufferedInputStream bi = new BufferedInputStream(new FileInputStream(fileName));
		// bufferedInputStream은 byte로 불려오는데 이걸 byte[]로 데리고 와서 뭉텅이씩으로 데려온다.
			
		FileOutputStream fo = new FileOutputStream(new File("c.png"));
		
		int a = 0;
		while ((a = bi.read()) != -1) {
			fo.write(a);			
		}
		fo.close();
		bi.close();
		// 가장 나중에 만들어진 것 부터 닫아준다.		
	}
}
