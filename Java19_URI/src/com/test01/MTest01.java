package com.test01;

import java.net.URI;
import java.net.URISyntaxException;

public class MTest01 {

	public static void main(String[] args) throws URISyntaxException {
		
		URI u = new URI("http://localhost:8787/Java19_URI_Web/res.jsp?myname=%EA%B6%8C%EB%8B%A4%EC%86%9C&myaddr=%EA%B0%95%EB%8F%99%EA%B5%AC");
		
		System.out.println(u.getScheme());
		System.out.println(u.getHost());
		System.out.println(u.getPort());
		System.out.println(u.getPath());
		System.out.println(u.getQuery());
		
		
	}
}
