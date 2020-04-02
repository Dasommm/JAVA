package com.test03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class HiClient implements Runnable{
	//TCP

	@Override
	public void run() {	
		try {
			Socket clientSocket;
			PrintWriter out = null;
			BufferedReader in = null;
			BufferedReader stdin = null;
			//변수 선언
			
			System.out.println("서버에 접속중 입니다...");
			clientSocket = new Socket("localhost",9999); 
			// 어디에 보낼건지, 포트 넘버는 무엇인지 적어준다.
										
			out = new PrintWriter(clientSocket.getOutputStream(),true);
			// 클라이언트가 서버로 흘려 보낼 것이다.서버에게 써줄거야(output)
			// true (Autoflush) 버퍼를 초기화 시켜주는(담아둔 것을 자동으로 보내주는) 
			
			
			in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			//서버와 클라이언트가 연결되어있는 통로. 서버에서 들어오는 것 (getInputStream)을 뭉텅이로 
			// -> bufferedReader
			
			stdin = new BufferedReader(new InputStreamReader(System.in));
			// 콘솔에서 입력해주는 애를 InputStreamReader로 받아서 BufferedReader로 받고 싶음  
			// inputstream은 하나씩, buffering 뭉텅이로 갖고오기 위해서 
			
			
			
			String inputLine;
			// 콘솔 창에서 한줄 읽어와서 , 읽어온 데이터가 null이 아니면 printwriter 객체를 이용해서
			// 출력해주자.
			while ((inputLine = stdin.readLine()) != null) {
				out.println(inputLine);
				// 서버로 out된다. -> 서버의 in.readline으로 간다. 
				System.out.println("Server로부터 다시 받은 메세지 : "+ in.readLine());
				// 나에게 들어온 데이터 출력해주자, 1줄씩
								
			}
			
			out.close();
			in.close();
			stdin.close();
			clientSocket.close();			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
	}

}	
	
	public static void main(String[] args) {
		Thread client = new Thread(new HiClient());
		client.start();
		
		
		
		
		
	}
	
}