package Q6;

import Q6.Message;

class Message{
	String message = " ";
}

public class Main {
	public static void main(String[] args) {
		Message message = new   Message();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				synchronized (message) {
					try {
						System.out.println("Waiting Message..");
						message.wait();
						System.out.println("Got the message..");
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				synchronized (message) {
					System.out.println("Sending Message..");
					message.notify();
				}
				
			}
		}).start();
	}
}
