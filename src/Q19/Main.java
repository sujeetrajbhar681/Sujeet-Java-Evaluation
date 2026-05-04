package Q19;

class CalSalPolicy{
	public CalSalPolicy calSal(double sal) {
		return this;
	}
	public CalSalPolicy calSal(double sal, double bonus) {
		return this;
	}
}

class Manager extends CalSalPolicy{
	@Override
	public Manager calSal(double sal) {
		System.out.println(sal);
		return this;
	}
	@Override
	public Manager calSal(double sal, double bonus) {
		System.out.println(sal+bonus);
		return this;
	}
}

class Emp extends CalSalPolicy{
	@Override
	public Emp calSal(double sal) {
		System.out.println(sal);
		return this;
	}
	@Override
	public Emp calSal(double sal, double bonus) {
		System.out.println(sal+bonus);
		return this;
	}
}

public class Main {
	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.calSal(560000);
		manager.calSal(56000, 10000);
		
		Emp emp = new Emp();
		emp.calSal(500000);
		emp.calSal(50000, 10000);
	}
}

