package Q12;

import Q12.Acc;
import Q12.Emp;

class Acc{
	String task;

	public Acc(String task) {
		super();
		this.task = task;
		System.out.println("Parent Constructor..");
	}
	public String displayTask() {
		return task;
	}
}

class Emp extends Acc{

	public Emp(String task) {
		super(task);
		// TODO Auto-generated constructor stub
	}
	public String displayWork() {
		System.out.println(super.displayTask());
		System.out.println(super.task);
		return task;
		
	}
}

public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp("Email..");
		emp.displayWork();
	}
}
