package chap15.textbook.s150602;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		//FIFO (First In First Out)
		Queue<Message> messageQueue = new LinkedList<>();
		
		messageQueue.offer(new Message("sendMail","홍길동"));
		messageQueue.offer(new Message("sendSMS","신용권"));
		messageQueue.offer(new Message("sendKakaotalk","홍두께"));
		
		while(!messageQueue.isEmpty()) { 
			Message message = messageQueue.poll();
			switch(message.command) {
			case "sendMail" :
				System.out.println(message.to + "님에게 메일을 보냅니다");
				break;
			case "sendSMS" :
				System.out.println(message.to + "님에게 SMS를 보냅니다.");
				break;
			case "sendKakaotalk" : 
				System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
				break;

			}
		}
		
		
	}

}
//Message message = messageQueue.poll(); 비어있지 않을동안 실행됨
//
//messageQueue.offer(new Message("sendMail","홍길동"));
//messageQueue.offer(new Message("sendSMS","신용권"));
//messageQueue.offer(new Message("sendKakaotalk","홍두께"));
//poll 실행될떄마다 먼저 실행된것부터 실행됨
