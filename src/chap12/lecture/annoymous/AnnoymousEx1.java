package chap12.lecture.annoymous;

public class AnnoymousEx1 {
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			@Override
			public void run() {
				for(int i =0; i < 5 ; i++) {
					System.out.println(i);
					try {
						Thread.sleep(500);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i =0; i < 5 ; i++) {
					System.out.println((char)('a'+i));
					try {
						Thread.sleep(500);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		Thread t3 = new Thread(() -> {

			for(int i =0; i < 5 ; i++) {
				System.out.println((char) ('Z' -i));
				try {
					Thread.sleep(500);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}

		});
		t1.start();
		t2.start();
		t3.start();
	}
}

//18~29 클라스안에 인터패이스가 없어서 직접 만들어서 작성
//t3 은 추상매소드 생략후 작성 t2의 간략화 
