package chap18.textbook.exercise.p11;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("172.30.1.29", 5001);
		OutputStream os = socket.getOutputStream();
		
		String filePath = "Wow.jpg";
		File file = new File(filePath);
		
		String fileName = file.getName();
		//작성위치
		byte[] bytes = new byte[100];
		fileName.getBytes(0, fileName.length(), bytes, 0);
		os.write(bytes);
		
		System.out.println("[파일 보내기 시작]");
		//작성위치
		FileInputStream fis = new FileInputStream(file);
		int len = 0;
		while ((len = fis.read(bytes)) != -1) {
			os.write(bytes, 0, len);
		}
		os.flush();
		System.out.println("[파일 보내기 완료]");
		
		fis.close();
		os.close();
		socket.close();

	}
}
