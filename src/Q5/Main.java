package Q5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Emp implements Comparable<Emp>{
	
	String name;
	int id;
	double sal;

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", sal=" + sal + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	public Emp(String name, int id, double sal) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
	}

	@Override
	public int compareTo(Emp o) {
		if(this.id < o.id) {
			return -1;
		}else if(this.id > o.id) {
			return -1;
		}
		return 0;
	}
	
}

public class Main {
	public static void main(String[] args) {
		Emp emp1 = new Emp("tom", 1, 15000);
		Emp emp2 = new Emp("jerry", 2, 25000);
		Emp emp3 = new Emp("herry", 3, 35000);
		Emp emp4 = new Emp("peter", 4, 45000);
		
		List<Emp> emps = new ArrayList<Emp>();
		emps.add(emp1);
		emps.add(emp2);
		emps.add(emp3);
		emps.add(emp4);
	
		System.out.println("Before....");
		
		Iterator<Emp> iterator = emps.iterator();
		while(iterator.hasNext()) {
			Emp emp = iterator.next();
			System.out.println(emp);
		}
		
		System.out.println("After..");
		
		Collections.sort(emps);
		Iterator<Emp> iterator2 = emps.iterator();
		while(iterator2.hasNext()) {
			Emp emp = iterator2.next();
			System.out.println(emp);
		}
		
		System.out.println("-----------");
		
		Collections.sort(emps, new SalaryComparator());
		Iterator<Emp> iterator3 = emps.iterator();
		while(iterator3.hasNext()) {
			Emp emp = iterator3.next();
			System.out.println(emp);
		}
	}
}
