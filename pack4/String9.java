package pack4;

/*  StringBuffer and StringBuilder
           |                |
        mutable  		   mutable
equals() compare address  equals() compare address
       Synchronized        not synchronized
       
     bf.append() -----> it adds to string
*/     
public class String9 
{
	void meth1()
	{
		String s = new String("java");
		
		StringBuffer buffer = new StringBuffer("java");
		
		StringBuilder builder = new StringBuilder("java");
		
		s.concat(" is awesome");  //new object is created 
		buffer.append(" is awesome "); //given object is  updated
		builder.append(" is awesome");
		
		System.out.println("String value before concatination=        "+s);
		System.out.println("StringBuffer value before concatination=  "+buffer);
		System.out.println("StringBuilder value before concatination= "+builder);
		System.out.println("---------------------------------------------------");
		
		System.out.println("String value after concatination=         "+s);
		System.out.println("String buffer value after concatination=  "+buffer);
		System.out.println("StringBuilder value after concatination=  "+builder);
		
		
	}
	public static void main(String[] args) 
	{
		new String9().meth1();
		
	}

}








