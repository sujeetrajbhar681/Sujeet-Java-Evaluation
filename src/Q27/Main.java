package Q27;

import Q27.Emp;

class Emp{
	int id;
	String name;
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize is finally done.. ");
		super.finalize();
	}
}

public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp(12, "hello");
		System.out.println(emp);
		emp=null;
		System.gc();
		System.out.println(emp);
	}
}

