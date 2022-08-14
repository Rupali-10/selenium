package exception;

public class finallyblock {
	public static void main(String[]arg) {
		int i =0;
		int j =10;
		try {
		int k=j/i;
		System.out.println("inside try");
		}
		catch(ArithmeticException e) {
			System.out.println("catch block execution");
	}
		finally {
			System.out.println("finally is execute");
		}
	}
}
