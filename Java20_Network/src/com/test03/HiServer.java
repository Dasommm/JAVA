package com.test03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class HiServer {
	// TCP

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket servieceSocket;
		PrintWriter out = null;
		BufferedReader in = null;
		// 변수 선언
		
		try {
			serverSocket = new ServerSocket(9999);
			// 서버생성
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		while(true) {
			System.out.println("client를 기다립니다...");
			
			try {
				servieceSocket = serverSocket.accept();
				// 클라이언트 소켓이 서버 소켓에 연결되면 소켓으로 관리해준다.
				System.out.println("client가 접속했습니다.");
				
				in = new BufferedReader(new InputStreamReader(servieceSocket.getInputStream()));
				// 클라이언트와 연결된=serviecesoket
				// inputStreamReader 바이트를 문자열로 
				
				out = new PrintWriter(servieceSocket.getOutputStream(),true);
				// 데이터 받아서 연결된 클라이언트에게 보내준다.
								
				String inputLine;
				while((inputLine = in.readLine()) != null) {
					// in. 클라이언트에서 보내주는애가 null이 아니면 화면서 출력해주고
					
					System.out.println("client가 보낸 메세지 : "+ inputLine);
					out.println("★"+inputLine);
					// 클라이언트에게 다시 보내주자, 별 붙여서
					// 이 데이터가 클라이언트의 in.readline으로 간다. 
					
				}
				
				out.close();
				in.close();
				servieceSocket.close();
				serverSocket.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
	}
}
