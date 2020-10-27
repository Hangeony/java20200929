package chap18.lecture.filterstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamEx1 {
	public static void main(String[] args) throws Exception {
		String path = "01. 기본 타입과 참조 타입의 차이.png";
		FileInputStream fis = new FileInputStream(path);
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		long start = System.currentTimeMillis();
		while (bis.read() != -1) {
			
		}
		long end = System.currentTimeMillis();
		System.out.println("총 읽은 시간 " + (end-start) + "ms");
		fis.close();
		
		
		
	}
}
//중간에 저장하는 임시공간 (입출력을 위한)
//바로 하드디스크로 안가고 Butter까지만 가서 저장 하는 매소드 (중간 저장 장치)
//속도를 빠르게해주는inputStream