package Q24;

import Q24.Emp;

class Emp{
	void calSal(double sal) {
		System.out.println(sal);
	}
	void calSal(double sal, double bonus) {
		System.out.println(sal+bonus);
	}
	void calSal(double sal, double bonus, double tax) {
		System.out.println(sal+bonus-tax);
	}
}


public class Main {
	public static void main(String[] args) {
		Emp e = new Emp();
		e.calSal(35000);
		e.calSal(35000, 5000);
		e.calSal(35000, 5000, 250);
	}
}
