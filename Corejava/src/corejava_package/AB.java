package corejava_package;

public class AB implements Runnable {
	public void run()
	{
		System.out.println("Hello");
		try
		{
			Thread.sleep(4000);
		}
		catch(InterruptedException ie) {
			System.out.println(ie.getMessage());
		}
		System.out.println("java");
		System.out.println(Thread.currentThread());
	}
	void m1()
	{
		System.out.println("m1 method");
	}
	
//sleep program
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AB a=new AB();
		Thread t=new Thread(a,"Child Thread");
		t.start();
		System.out.println("number of active"+Thread.activeCount());
		a.m1();
		
		

	}

}
