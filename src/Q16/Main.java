package Q16;

import 	Q16.Calc;
import Q16.Thread1;
import Q16.Thread2;

class Calc{
	synchronized void mul(int a) {
		for (int i=1;i<=5;i++)
			System.out.println(i*5);
		try {
			Thread.sleep(400);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Thread1 extends Thread{
	Calc calc;

	public Thread1(Calc calc) {
		super();
		this.calc = calc;
	}
	@Override
	public void run() {
		calc.mul(5);
	}
}

class Thread2 extends Thread{
	Calc calc;

	public Thread2(Calc calc) {
		super();
		this.calc = calc;
	}
	@Override
	public void run() {
		calc.mul(100);
	}
}

public class Main {
	public static void main(String[] args) {
		Calc calc = new Calc();
		
		Thread1 thread1 = new  Thread1(calc);
		Thread2 thread2 = new Thread2(calc);
		
		thread1.start();
		thread2.start();
	}
}

