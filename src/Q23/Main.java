package Q23;

import Q23.Addr;
import Q23.Hobbie;
import Q23.Student;

class Addr{
	String addr1;
	String addr2;
	
	@Override
	public String toString() {
		return "Addr [addr1=" + addr1 + ", addr2=" + addr2 + "]";
	}
	public Addr(String addr1, String addr2) {
		super();
		this.addr1 = addr1;
		this.addr2 = addr2;
	}
}

class Hobbie{
	String h1;
	String h2;
	@Override
	public String toString() {
		return "Hobbie [h1=" + h1 + ", h2=" + h2 + "]";
	}
	public Hobbie(String h1, String h2) {
		super();
		this.h1 = h1;
		this.h2 = h2;
	}
}

class Student{
	String name;
	int id;
	Addr addr;
	Hobbie hobbie;
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", addr=" + addr + ", hobbie=" + hobbie + "]";
	}
	public Student(String name, int id, Addr addr, Hobbie hobbie) {
		super();
		this.name = name;
		this.id = id;
		this.addr = addr;
		this.hobbie = hobbie;
	}
}

public class Main {
	public static void main(String[] args) {
		Addr addr = new Addr("Mum1", "Mum2");
		Hobbie hobbie = new Hobbie("Playing", "Singing");
		
		Student student = new Student("Sujeet", 12, addr, hobbie);
		
		System.out.println(student);
		System.out.println(student.addr);
	}
}
