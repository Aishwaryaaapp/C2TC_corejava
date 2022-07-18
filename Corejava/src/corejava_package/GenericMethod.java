package corejava_package;

public class GenericMethod {
	public <T> void methodgen(T var1)
	{
		System.out.println("The value passed is of type"+var1.getClass().getSimpleName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericMethod ob=new GenericMethod();
		ob.<String>methodgen("is the best");
		//sometime we can omit the explicit mention of the type in<> and the compiler can automatically identify
		ob.methodgen("Learning java");
		ob.methodgen(154);
		
		

	}

}
