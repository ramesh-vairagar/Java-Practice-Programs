package pack3;

//type casting in java

public class ClassV8 
{
	void implicit()
	{
		System.out.println("performung implicit type casting");
		  //smaller data type to larger implicitly by compiler
		byte b = 10;
		int i = b;
		System.out.println("byte value="+b);
		System.out.println("int value="+i);
		System.out.println("--------------------");
		char c = 'd'; 
		int x = c;  //ascii value of d=100
		System.out.println("char value="+c);
		System.out.println("int value="+x);
		//int and char both are compatible
	}
	void explicit()
	{
		System.out.println("performing explicit");
		//larger data type=====>smaller data type explicitly
		
		int i1 = 100;
		byte b1 = (byte)i1;
		System.out.println("int value="+i1);
		System.out.println("byte value="+b1);
		
		int i2=500;
		
		byte b2 = (byte)(i2);  //byte range -128 to 127
		/*[min range+result-max range-1]
		 [-128 + 500 - 127 -1]
		 [244]
		 [-128 + 240 -127  -1]
		 [-12]
		 */
		System.out.println("int value="+i2);
		System.out.println("byte value="+b2);
		
		
		float f = 10.9999f;  // every decimal in java is double 
		byte b3 = (byte)f;
		//f=b3;
		System.out.println("float value="+f);
		System.out.println("byte value="+b3);
		
	}
	void meth1(byte b)
	{
		System.out.println("meth1() called");
		System.out.println(b);
	}
	
	public static void main(String[] args) 
	{
		ClassV8 obj = new ClassV8();
		obj.implicit();
		System.out.println("===================");
		obj.explicit();
		System.out.println("====================");
		obj.meth1((byte)10);  //every number in java is int 
		
		
	}
}
