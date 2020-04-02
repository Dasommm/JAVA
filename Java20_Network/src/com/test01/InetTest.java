package com.test01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetTest {

	public static void main(String[] args) throws UnknownHostException {
		
		InetAddress addr = InetAddress.getLocalHost();
		System.out.println(addr);
		System.out.println("localhost : "+ addr.getHostAddress());
		System.out.println("host name : "+ addr.getHostName());
		
		InetAddress[] naver = InetAddress.getAllByName("www.naver.com");
		for(int i = 0; i <naver.length; i++) {
			System.out.println(naver[i].getHostAddress());
			
			
		}
		
	}
	
}
 