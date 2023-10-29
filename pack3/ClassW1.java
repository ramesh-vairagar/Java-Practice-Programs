package pack3;

//auto unboxing:-

public class ClassW1
{
	void meth1()
	{
		System.out.println("performing autounboxing");
		Integer ival = new Integer(100);
		int i = ival;                   //1st way of converting WCO =====>  PDT
		int i2 = ival.intValue();      //2nd way 
		System.out.println("Integer WCO value="+ival);
		System.out.println("int PDT="+i);
		System.out.println("int PDT="+i2);
		System.out.println();
		
		Byte bval = new Byte((byte)100);
		byte b1 = bval; //1st
		byte b2 = bval.byteValue();
		System.out.println("Byte WCO ="+bval);
		System.out.println("byte PDT ="+b1);
		System.out.println("byte PDT ="+b2);
		System.out.println();
		
		Boolean boolval1 = new Boolean("TrUe");
		Boolean boolval2 = Boolean.valueOf(false);
		boolean flag1 = boolval1;
		boolean flag2 = boolval2.booleanValue();
		System.out.println("Boolean WCO ="+boolval1);
		System.out.println("Boolean WCO ="+boolval2);
		System.out.println("bool PDT ="+flag1);
		System.err.println("bool PDT ="+flag2);
		
		
	}

	public static void main(String[] args) 
	{
		new ClassW1().meth1();
		
	}
}
