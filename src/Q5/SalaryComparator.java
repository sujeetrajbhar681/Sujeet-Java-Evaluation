package Q5;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
		if(o1.sal < o2.sal) {
			return -1;
		}else if(o1.sal > o2.sal) {
			return 1;
		}
		return 0;
	}
	
}
