package corejava_package;

 class A {
	 void run()
	 {
		 
		 
	 }

   public class demo extends A{
		final int speedlimit=90;//final variable
		void run()
		{
			speedlimit=400;

	}
		public static void main(String[] args) {
		//TODO Auto-generated method stub
			 FinalVariable obj=new FinalVariable();
			obj.run();
		}

   }
 }
 
