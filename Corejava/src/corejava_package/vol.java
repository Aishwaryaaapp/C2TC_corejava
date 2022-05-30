package corejava_package;

public class vol {
	void volume(int s)
	{
		int vc=s*s*s;
		System.out.println("The volume of cube is"+vc);
		}
	void volume(double r)
		{
			double vs=(4/3.0)*3.15*r*r*r;
			System.out.println("The volume of the sphere is"+vs);
		}
	void volume(int l,int b,int h)
	{
		int vcd=l*b*h;
		System.out.println("The volume of cuboid is"+vcd);
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vol ob=new vol();
		ob.volume(6);
		ob.volume(2,3,2);
		ob.volume(3.0);
	}
}




