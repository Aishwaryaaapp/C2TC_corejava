package corejava_package;
abstract class atm
{
	abstract void withdraw();
}


public class day1_p3 extends atm {
	void withdraw()
	{
		System.out.println("withdraw successful");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		day1_p3 ob1=new day1_p3();
		ob1.withdraw();

	}

}
