package corejava_package;

public class CustomExample {
	void check(int weight) throws InvalidProductException{
		if(weight<50) {
			throw new InvalidProductException("Product Invalid");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomExample obj=new CustomExample();
		try {
			obj.productCheck(35);
		}
		catch(InvalidProductException ex) {
		System.out.println("Caught the exception");
		System.out.println(ex.getMessage());p
		}

	}
}

