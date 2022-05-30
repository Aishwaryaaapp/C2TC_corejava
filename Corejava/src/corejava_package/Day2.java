package corejava_package;

class withdraw
{
	int amt_withdraw=2000;
}

public class Day2 extends withdraw{
	int amt_left=5000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day2 ob=new Day2();
		System.out.println("withdraw amount:"+ob.amt_withdraw);
		System.out.println("balance amount:"+ob.amt_left);
		

	}

}
