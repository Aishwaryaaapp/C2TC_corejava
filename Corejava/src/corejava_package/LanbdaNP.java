package corejava_package;
@FunctionalInterface

interface Statement
{
	public String Greet();
	
}

public class LanbdaNP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Statement s=()->{return "Hello World.";};
		System.out.println(s.Greet());

	}

}
