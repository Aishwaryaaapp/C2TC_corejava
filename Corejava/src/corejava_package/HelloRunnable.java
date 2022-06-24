package corejava_package;
import java.lang.Runnable;

public class HelloRunnable implements Runnable {
	public void run()
	{
		System.out.println("hi");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloRunnable hello=new HelloRunnable();
		Thread hellothread=new Thread(hello);
		hellothread.start();

	}

}
