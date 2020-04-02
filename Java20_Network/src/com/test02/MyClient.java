package com.test02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class MyClient {
	// UDP

	public static void main(String[] args) throws IOException {
		System.out.println("클라이언트 입니다.");

		// 클라이언트 생성 (포트 번호가 없다.)
		// 클라이언트는 소켓을 그냥 열고, 서버는 포트를 지정해서 열어준다.
		DatagramSocket ds = new DatagramSocket();

		// 보낼 데이터
		byte[] buff = "연습입니다.".getBytes();

		// Packet으로 보낼 데이터를 감싼다. 적힌 IP주소에다가 8888의 포트를 통해 보낼 것이다.
		// 데이터를 블록으로 쌓아서 보낸다.
		DatagramPacket sendPacket = new DatagramPacket(buff, buff.length, InetAddress.getByName("localhost"), 8888);

		ds.send(sendPacket); // 데이터를 (연습입니다.를)보낸다.
		ds.close();
		ds.disconnect();

	}

}
