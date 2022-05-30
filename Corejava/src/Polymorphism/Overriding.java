package Polymorphism;

public class Overriding {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ob =new A();
		B ob1=new B();
		ob.run();
		ob1.run();

	}

}
class A
{
	void run()
	{
		System.out.println("hi");
	}
}
class B
{
	void run()
	{
		System.out.println("hello");
	}
}


