package corejava_package;

	public class day1 {

		int year_of_pur;//data members
		String make;
		int model;
		double cost;
		 public void disp1()//member function
		 {
			 System.out.println("year of purchase"+2001);
			 System.out.println("make"+"suzuki");
		 }
		 public void disp2() //member fuction
		 {
			 System.out.println("model"+1909);
			 System.out.println("cost"+2500000.0);
			 }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			day1 ob=new day1();
			day1 ob1=new day1();
			ob.disp1();
			ob1.disp2();
		}
	}


