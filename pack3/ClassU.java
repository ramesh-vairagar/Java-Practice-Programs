package pack3;

//programs on static block

public class ClassU 
{
	static int a;
	final static int b;
	void meth1()   //non-static method
	{
		a=10;
	   //b=50; // CE we cannot initialize final static variable inside method
		System.out.println("meth1() called");
	}
	static void meth2()   //static method
	{
		a=100;
		System.out.println("meth2() called");
	}
	static  //static block
	{
		b=50;  //initializing final variable in static block
		System.out.println("1st static block");
	}
	public static void main(String[] args)   //main
	{
		System.out.println("main method called");
		ClassU obj = new ClassU();
		obj.meth1();
		System.out.println("a val="+a);
		System.out.println("b val="+b);
	}

	static   //static block
	{
		//b=100; CE we can initialize final static at once in a program as it is constant
		System.out.println("2nd static block");
		meth2();
	}
}
