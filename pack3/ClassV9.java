package pack3;

//type casting

public class ClassV9 
{
	void impicit()
	{
		byte b=10;
		System.out.println("byte value ="+b);
		short s=b;
		System.out.println("short value"+s);
		s++;
		int i=s++;
		System.out.println("int value="+i);
		System.out.println("short value="+s);
		
		long l=i;
		System.out.println("long value="+l);
		float f = l;
		System.out.println("float value="+(f+b));
		double d=--f;
		System.out.println("double d="+d);
		show();
		if(!(d==f))
		{
			System.out.println("equal");
			
		}
		else
		{
			System.out.println("not equal");
		}
		
	}
	public static void main(String[] args) 
	{
		ClassV9 obj = new ClassV9();
		obj.impicit();
	}
	static void show()
	{
		char c='A';
		int a=c++;
		System.out.println(a);
		String s= new ClassV9().meth1();
		System.out.println(s);
	}
	String meth1()
	{
		String s = "implicit type casting automatically";
		return s;
	}

}
