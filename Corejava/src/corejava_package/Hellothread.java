package corejava_package;

public class Hellothread extends Thread
{
	public void run()
	{
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hellothread t=new Hellothread();
		t.start();
		//t.run();

	}

}
