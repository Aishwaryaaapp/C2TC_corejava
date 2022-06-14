package corejava_package;

public class ArrayExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr=new int[3];
		arr[0]=6;
		arr[1]=5;
		arr[2]=7;
		
		int min= arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(min>arr[i])
		min=arr[i];
	}
	System.out.println("the lowest value is"+min);

	}

}
