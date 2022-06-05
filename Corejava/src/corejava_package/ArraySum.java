package corejava_package;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare array
		//initialize it with values
		int array[]= {10,20,30,40,50};
		//initialize sum value with 0
		int sum=0;
		for(int i=0;i<array.length;i++)
		{
			sum+=array[i];
		}
		//display the result
		System.out.println("Sum of array elements="+sum);
	}
}
