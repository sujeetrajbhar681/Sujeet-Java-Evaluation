package Q1;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		int[] a = {4,6,7,8};
		for (int i : a) {
			System.out.println(i);
		}
		
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		ListIterator iterator = list.listIterator();
		while(iterator.hasNext()) {
			Object object = iterator.next();
			System.out.println(object);
		}
		while(iterator.hasPrevious()) {
			Object object = iterator.previous();
			System.out.println(object);
		}
		
		Vector vector  =new Vector();
		vector.add("A");
		vector.add("B");
		vector.add("C");
		vector.add("D");
		
		Enumeration enumeration = vector.elements();
		while (enumeration.hasMoreElements()) {
			Object object = (Object) enumeration.nextElement();
			System.out.println(object);
		}
	}
}
