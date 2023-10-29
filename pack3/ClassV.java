package pack3;

//static variable and static block will be having same priority they are execute in defined order

public class ClassV 
{
	static int a=ClassV.meth1();  //static variable 100 
	
	static int meth1()
	{
		System.out.println("meth1() called");
		return 100;
	}
	public static void main(String[] args) 
	{
		System.out.println("main method called "+a);
		
		
	}
	static
	{
		System.out.println("static block "+a);
	}

}
