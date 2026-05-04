package Q14;

import Q14.Emp;

class Emp{
	
	private String name;
	private double sal;
	private int id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}

public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.setName("sujeet");
		System.out.println(emp.getName());
		emp.setId(12);
		System.out.println(emp.getId());
		emp.setSal(35000);
		System.out.println(emp.getSal());
	}
}
