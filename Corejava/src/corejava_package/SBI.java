package corejava_package;
interface rbi
{
	float rateofInterest();
}
interface worldbank
{
	float roi();
}

public class SBI  implements rbi,worldbank{
	public float rateofInterest()
	{
		return 9.15f;
	}
	public float roi()
	{
		return 10.25f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI ob1=new SBI();
		System.out.println("rbi"+ob1.rateofInterest());
		System.out.println("world bank"+ob1.roi());

	}

}
