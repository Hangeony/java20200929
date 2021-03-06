package chap18.textbook.s180704;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerExample {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;

		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("172.30.1.39", 5001));
			while (true) {
				System.out.println("[연결을 기다림]");
				Socket socket = serverSocket.accept();
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("[연결을 수락함]" + isa.getHostName());

				byte[ ] bytes = null;
				String message = null;

				InputStream is = socket.getInputStream();
				bytes = new byte[100];
				int readByteCount = is.read(bytes);
				message = new String(bytes, 0, readByteCount, "UTF-8");
				System.out.println("[데이터 받기 성공]" + message);

				OutputStream os = socket.getOutputStream();
				message = "안녕하세요 ";
				bytes = message.getBytes("UTF-8");
				os.write(bytes);
				os.flush();
				System.out.println("[데이터 보내기 성공]");

				is.close();
				os.close();
				socket.close();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		if(!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			}
			catch(IOException e1) {
				e1.printStackTrace();
			}
		}
	}

}
//누군가 접속하길 기다림. socket이 생기고 데이터를 주고 받는게 가능함