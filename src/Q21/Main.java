package Q21;

import Q21.TestSleep;

class TestSleep extends Thread{
	
	@Override
	public void run() {
		for (int i=1; i<5; i++){
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
}

public class Main {
	public static void main(String[] args) {
		TestSleep sleep = new TestSleep();
		TestSleep sleep2 =  new TestSleep();
		
		sleep.start();
		sleep2.start();
	}
}
