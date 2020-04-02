package com.test01;

import java.io.IOException;

public class RuntimeTest {

	public static void main(String[] args) {
		String path = "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe";

		Runtime rt = Runtime.getRuntime();

		try {
			Process prc = rt.exec(path);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
