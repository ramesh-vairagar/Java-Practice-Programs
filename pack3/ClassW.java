package pack3;

//wrapper classes in java :- in java collection framework allow only objects not primitive data type
//auto boxing:- converting primitive data type into its respective class object
//auto unboxing:-converting wrapper class object into its respective primitive data type

public class ClassW 
{
	void meth1()
	{
		System.out.println("performing autoboxing");
		int i = 100;
		Integer ival1 = i;                  //1st way of converting primitive data type into class object
		Integer ival2 = new Integer(i);    //2nd way depreciated from java 1.9 version
		Integer ival3 = Integer.valueOf(i);//3rd way 
		
		System.out.println("primitive data type value ="+i);
		System.out.println("Integer Wrapper class object value="+ival1);
		System.out.println("Integer Wrapper class object value="+ival2);
		System.out.println("Integer Wrapper class object value="+ival3);
		
		System.out.println("----------------------------------");
		
		byte b = 50;
		Byte bval1 = Byte.valueOf(b); //3rd way
		System.out.println("byte pdt value="+b);
		System.out.println("Byte WCO value="+bval1);
		
		System.out.println("-----------------------------------");
		
		float f = 10.9f;                  //type casting by default every decimal in java is double
		Float fval = Float.valueOf(f);   //3rd way
		Float favl1 = f;                //1st way converting PDT====>WCO
		System.out.println("float PDT value="+f);
		System.out.println("Float WCO value="+fval);
		
		System.out.println("----------------------------------------");
		
	}
	void meth2()
	{

		Integer ival1 = new Integer(100);
		Integer ival2 = new Integer("100");  //we can pass only numeric string data as argument
		Integer ival3 = new Integer('a');    //int and char are compatible
		
		Byte bval1 = new Byte((byte)10);   //by default every number in java is int so we need to typecast
		Byte bval2 = new Byte("100");
		//Byte bval3 = new Byte("java");  //only numeric string
		
		Character cval1 = new Character('a');
		//Character cval2 = new Character("java");   CE character wrapper class will not accept string data as argument
		
		System.out.println("ival1="+ival1);
		System.out.println("ival2="+ival2);
		System.out.println("ival3="+ival3);
		System.out.println("bval1="+bval1);
		System.out.println("bval2="+bval2);
		System.out.println("cval1="+cval1);
	}
	public static void main(String[] args) 
	{
		ClassW obj = new ClassW();
		obj.meth1();
		obj.meth2();
		
	}
	/* All wrapper classes will accept its respective data and string data also 
	   but character wrapper class will accept only char data
	 */

}
