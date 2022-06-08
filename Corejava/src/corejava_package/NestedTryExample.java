package corejava_package;

public class NestedTryExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="welcome";
		int x[]= {0,1,2,3,4};
		try //outer try block
		{
			int slength=str.length();
			System.out.println("String length:"+slength);
			try
			{
				int y=6;
				System.out.println(x[y]);
			}
			catch(ArithmeticException ae)//No match is found.
			{
				System.out.println("Exception is thrown");
			    System.out.println(ae.toString());
		    }
	    }
	       catch(ArrayIndexOutOfBoundsException aie)//match found.
	       {
	    	   System.out.println("Exception is thrown");
		       System.out.println(aie.toString());
	       }
               System.out.println("i am out of outer catch block");
         }
}
