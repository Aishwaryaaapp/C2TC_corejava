package corejava_package;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int data=100/0;
			System.out.println(data);
		}
		catch(Exception e) {
			System.out.println("can't divide integer by 0!");
		}

	}

}
