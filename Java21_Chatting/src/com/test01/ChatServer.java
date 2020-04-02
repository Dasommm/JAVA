package com.test01;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class ChatServer{

	Vector<ServiceThread> Clients;
	
	public ChatServer(){
		Clients = new Vector<>();
	}
	
	public void addClient(ServiceThread st){
		Clients.addElement(st);
	}
	
	public void removeClient(ServiceThread st){
		Clients.removeElement(st);
	}
	
	public void sendMessageAll(String msg){
		try{
			System.out.println(msg);

			for(int i = 0;i<Clients.size();i++){
				ServiceThread st = ((ServiceThread)Clients.elementAt(i));
				st.sendMessage(msg);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void sendMessageOne(String msg, String wisper) {
		try{
			
			String[] msgArr = msg.split(" ");
			String wMsg = "";
			for(int i = 2 ; i < msgArr.length ; i++) {
				wMsg += (msgArr[i]+" ");
			}
			
			System.out.println("["+wisper+">>"+msgArr[1]+"]" + wMsg);

			for(int i = 0;i<Clients.size();i++){
				ServiceThread one = ((ServiceThread)Clients.elementAt(i));
				
				if(one.getUserName().equals(msgArr[1])) {
					one.sendMessage("["+wisper+">>"+msgArr[1]+"]" + wMsg);
				}
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ChatServer server;
		ServerSocket serverSocket = null;
		int port = 9999;
		server = new ChatServer();
		
		try {
			serverSocket = new ServerSocket(port);
		} catch (IOException e) {
			System.err.println("연결 실패");
			System.exit(1);
		}
		
		System.out.println("서버 \n" + serverSocket + "\n에서 연결을 기다립니다.");

		try{
			while(true){

				Socket serviceSocket = serverSocket.accept();
				ServiceThread thread = new ServiceThread(server,serviceSocket);
				thread.start();
				server.addClient(thread);
			}
			
		}catch(Exception e){
			try {
				serverSocket.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
}
