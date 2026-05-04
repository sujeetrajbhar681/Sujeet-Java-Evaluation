package Q10;

import Q10.Emp;

class Emp implements Cloneable{
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
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		Emp emp = new Emp(12, "hii");
		System.out.println(emp);
		
		Emp emp2 = (Emp) emp.clone();
		System.out.println(emp2);
	}
}
