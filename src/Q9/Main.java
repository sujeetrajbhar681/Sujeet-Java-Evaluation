package Q9;

class Emp {
	String name;
	int id;
	double sal;
	String addr;

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", sal=" + sal + ", addr=" + addr + "]";
	}

	public Emp(String name, int id, double sal, String addr) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
		this.addr = addr;
	}

}

public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp("Sujeet", 12, 34000, "Mumbai");
		System.out.println(emp);
	}
}

