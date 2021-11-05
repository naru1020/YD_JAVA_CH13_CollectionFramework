package com.yedam.java.ch04.lifopifo;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<message> messageQueue = new LinkedList<>();

		messageQueue.offer(new message("sendMail", "홍길동"));
		messageQueue.offer(new message("sendSMS", "신용권"));
		messageQueue.offer(new message("sendKakaotalk", "홍두께"));

		while (!messageQueue.isEmpty()) {
			message m = messageQueue.poll();

			switch (m.command) {
			case "sendMail":
				System.out.println(m.to + "님에게 메일을 보냅니다.");
				break;
			case "sendSMS":
				System.out.println(m.to + "님에게 SMS을 보냅니다.");
				break;
			case "sendKakaotalk":
				System.out.println(m.to + "님에게 카카오톡을 보냅니다.");
				break;

			}
		}
	}
}
