package com.test02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class MyServer {
	// UDP

	public static void main(String[] args) throws IOException {
		System.out.println("서버입니다.");

		// 8888포트를 통해 서버 생성
		DatagramSocket ds = new DatagramSocket(8888);

		// 클라이언트가 보내면 받을 방을 생성해준다.
		// UDP는 데이터를 방으로 보내버린다.
		// [1024]는 임의의 숫자
		byte[] buff = new byte[1024];

		// Packet으로 감싼다.
		// 이만큼의 방을 만들어두고 받을 준비를 하고 있다.
		// DatagramPacket으로 만든 데이터를 받을 준비
		DatagramPacket recievePacket = new DatagramPacket(buff, buff.length);

		// Data를 받는다.
		ds.receive(recievePacket);
		System.out.println(new String(recievePacket.getData()));
		// 보낸 데이터가 바이트 배열, 받는 데이터도 바이트 배열
		// 보기 어려우니 String으로

		ds.close();
		ds.disconnect();

	}
}
