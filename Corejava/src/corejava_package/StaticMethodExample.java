package corejava_package;

public class StaticMethodExample {
	//static variable
	static int i=100;
	
	//instance variable
	int n=200;
	
	//static method
	static void a()
	{
		int a=200;
		System.out.println("Print from a");
		//cannot make a static reference to non-static field b
		//n=100;
		//compilation error
		//cannot make a static reference to the non-static method a2() from the type test
		//a2();
		//compilation error
		//System.out.println(super.i);
	}
	//instance method
	void a2()
	{
		System.out.println("inside a2");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethodExample ob1=new StaticMethodExample();
		ob1.a2();
		StaticMethodExample.a();
		

	}

}
