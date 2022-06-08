package corejava_package;
//wrapper objects and viceversa

public class WrapperClassExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f=50.0F;
		double d=60.0D;
		char c='a';
		boolean b2=true;
		
		//Autoboxing:converting primitives into objects
		Float floatobj=f;
		Double doubleobj=d;
		Character charobj=c;
		Boolean boolobj=b2;
		
		//printing objects
		System.out.println("Float object:"+floatobj);
		System.out.println("Double object:"+doubleobj);
		System.out.println("Charcter object:"+charobj);
		System.out.println("Boolean object:"+boolobj);
		
		//Unboxing:Converting objects to primitives
		float floatvalue=floatobj;
		double doublevalue=doubleobj;
		char charvalue=charobj;
		boolean boolvalue=boolobj;
		
		//printing primitives
		System.out.println("-----Printing primitive values---");
		System.out.println("float value:"+floatvalue);
		System.out.println("double value:"+doublevalue);
		System.out.println("char value:"+charvalue);
		System.out.println("boolean value:"+boolvalue);

	}

}
