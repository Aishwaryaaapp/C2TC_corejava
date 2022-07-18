package corejava_package;
@FunctionalInterface
interface cube
{
	int calculate(int a);
}

public class Functional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=6;
		cube c=(int a)->a*a*a;
		int result=c.calculate(x);
		System.out.println(result);

	}

}
