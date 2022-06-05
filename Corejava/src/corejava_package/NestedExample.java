package corejava_package;

public class NestedExample {
	private static String str="Hi";
	//static class
	static class MyNestedClass{
		//non-static method
		public void disp() {
			System.out.println(str);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NestedExample.MyNestedClass obj=new NestedExample.MyNestedClass();
		obj.disp();

	}

}
