package Q8;

import Q8.Acc;
import Q8.Emp;

class Acc{
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

class Emp extends Acc{
	@Override
	void calSal(double sal) {
		// TODO Auto-generated method stub
		super.calSal(sal);
	}
	@Override
	void calSal(double sal, double bonus) {
		// TODO Auto-generated method stub
		super.calSal(sal, bonus);
	}
	@Override
	void calSal(double sal, double bonus, double tax) {
		// TODO Auto-generated method stub
		super.calSal(sal, bonus, tax);
	}
}

public class Main {
	public static void main(String[] args) {
		Emp e = new Emp();
		e.calSal(35000, 5000, 500);
		e.calSal(500000, 5000, 2500);
	}
}

