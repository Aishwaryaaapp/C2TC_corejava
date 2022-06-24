package corejava_package;
import java.lang.*;

public class Extendthread implements Runnable {
	public void run()
	{
		System.out.println("Hi Dear");

	System.out.println(Thread.currentThread());
	System.out.println(Thread.currentThread());

	for(int i=1;i<=9;i++)
	{
		System.out.println(i);
	}}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Extendthread ob1=new Extendthread();
	Thread an = new Thread(ob1);
	an.start();
	an.setName("Anu");
	an.setName("Arya");
		}
}
