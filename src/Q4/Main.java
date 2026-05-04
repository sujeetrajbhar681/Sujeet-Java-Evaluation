package Q4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Emp implements Serializable{
	String name;
	int id;
	String dept;
	
	public Emp(String name, int id, String dept) {
		super();
		this.name = name;
		this.id = id;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", dept=" + dept + "]";
	}
}

public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp("Sujeet", 1, "CS");
		
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("emp.txt"))){
			out.writeObject(emp);
			System.out.println("Data Added..");
			
		} catch (Exception e) {
			System.out.println(e);
		}
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("emp.txt"))){
			in.readObject();
			System.out.println(emp);
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
