package corejava_package;

public class FinalVariable {
	final int speedlimit=90;//final variable
	void run() { //if we insert final in this line error
		speedlimit=400;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalVariable obj=new FinalVariable();
		obj.run();

	}

}
