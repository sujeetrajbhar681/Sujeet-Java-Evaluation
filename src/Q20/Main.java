package Q20;

public class Main {
	public static double divide(int a, int b, String operation) {
		return a/b;
	}
	public static void calDivide(int a, int b, String operation) {
		if(operation.equals("/"));
		double result = divide(a, b, operation);
		System.out.println(result);
		
	}
	
	public static void main(String[] args) {
		try {
			calDivide(10, 2, "/");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
