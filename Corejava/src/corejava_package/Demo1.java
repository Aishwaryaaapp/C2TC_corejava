package corejava_package;
interface MyInterface
{
	public void method1();
	public void method2();
}
class Demo1 implements MyInterface 
	{
	public void method1()
	{
		System.out.println("implementation of method1");
		
	}
	public void method2()
	{
		System.out.println("implementation of method2");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface obj=new Demo1();
		obj.method1();

	}

}
