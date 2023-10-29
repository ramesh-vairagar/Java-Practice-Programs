package pack3;

//data types in java

public class ClassJ 
{
	int i;
	byte b;
	short s;
	long l;
	
	float f;
	double d;
	
	char c;
	boolean flag;
	
	void meth1()
	{
		System.out.println("printing default values ");
		System.out.println("int="+i);
		System.out.println("byte="+b);
		System.out.println("long="+l);
		System.out.println();
		System.out.println("float="+f);
		System.out.println();
		System.out.println("char="+c);
		System.out.println("boolean="+flag);
		
	}
	void meth2()
	{
		int i=10;
		int i2=20;
		int i3=i+i2;
		System.out.println("i val="+i3);
		System.out.println();
		
		byte b1=10;
		byte b2=20;
		//byte b3=b1+b2;  //arithmetic operator returns integer value we are assigning a int value to byte type thats why we are getting an error    
		byte b3=(byte)(b1+b2);//explicit type casting 
		System.out.println("b3 val="+b3);
		
		//by default every number in java is considered as int type;
		//by default every decimal in java is considered as double by the compiler
		short s=10;//implicit type casting converting int value to short value by default compiler 
		System.out.println("s val="+s);
		
		float f=10.9f; //type casting
		System.out.println("float value="+f);
		
		long l=109554545L;  //explicit type casting
		System.out.println("long val="+l);
		
		}
	
	public static void main(String[] args) 
	{
		ClassJ obj = new ClassJ();
		obj.meth1();
		System.out.println();
		obj.meth2();
		
	}

}
