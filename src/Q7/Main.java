package Q7;

class InvalideOperationException extends Exception{
	public InvalideOperationException() {
		System.out.println("Invalide Operation.. ");
	}
}

public class Main {
	public static void cal(int a, int b, String operation) {
		if(operation.equals("+")){
			System.out.println(a+b);
		}else if(operation.equals("-")){
			System.out.println(a-b);
		}else if(operation.equals("*")){
			System.out.println(a*b);
		}else if(operation.equals("/")) {
			try {
				System.out.println(a/b);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
	public static void main(String[] args) {
		try {
			cal(10, 2, "/");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
