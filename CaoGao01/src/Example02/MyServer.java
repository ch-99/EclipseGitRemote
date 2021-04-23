package Example02;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
	
	public static void main(String[] args) {
		
		try {
			ServerSocket  serverSocket = new ServerSocket(8080);
			
			Socket socket = serverSocket.accept();
			System.out.println("客户端连接成功");
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
