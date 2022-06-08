package corejava_package;

public class WithExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d=0,a;
		try
		{
	        a=42/d;
			System.out.println("not printed");
		}
		catch(ArithmeticException e) {
			System.out.println("Division by zero");
			}
		System.out.println("Will not Respond");

	}

}
