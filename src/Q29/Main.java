package Q29;

import Q29.Test;

class Test implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread 1 is running");
		
	}
	
}

public class Main {
	public static void main(String[] args) {
		Test test = new Test();
		test.run();
		
		Thread thread = new Thread(test);
		thread.start();
		
		new  Thread() {
			public void run() {
				System.out.println("Thread 2 is rinning");
			};
		}.start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread 3 is running");
				
			}
		}).start();
	}
}
