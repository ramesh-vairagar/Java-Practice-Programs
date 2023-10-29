package pack3;

//variables in java

public class ClassK 
{
	int x=10;          //instance variable
	static int y=20;  //static variable 
	
	int a;           //instance
	static int b;   //static
	
	boolean flag;
	
	void meth1() 
	{
		int z=30;
		System.out.println("meth1() called");
		System.out.println("instance x="+x);               //accessing instance by identifier name
		System.out.println("instance x="+new ClassK().x); //accessing instance by class object
		
		System.out.println("ststic y="+y);              //by identifier name
		System.out.println("static y="+new ClassK().y); //by Class Object 
		System.out.println("static y="+ClassK.y);       //by class name
		
		System.out.println("local z="+z);    //identifier only
		
	}	
	void meth2()
	{
		System.out.println("meth2() called"); 
		System.out.println("x value="+x);   //accessing instance variable in method
		System.out.println("y value="+y);
	   //System.out.println("z value="+z); //CE we cant access local variable out side method
	}
	void meth3()
	{
		System.out.println("meth3() called");
		int x=100;  //local x
		int y=200;  //local y
		System.out.println("instance x="+x);//priority given to local variable
		System.out.println("instance x="+new ClassK().x); //accessing with object
		System.out.println("static y="+ClassK.y);   //by Class name
		System.out.println("local x="+x);  //identifier only
		System.out.println("local y="+y);  //identifier only
		
		
	}
	void meth4()
	{
		System.out.println("meth4() called");
		int c;  //local
		System.out.println("instance variable a="+a);
		System.out.println("static variable b="+b);
		System.out.println("insatnce variale ="+flag);
		//System.out.println("local c="+c);  //CE we cant use local variable without initializing
	}
	public static void main(String[] args) 
	{
		ClassK obj=new ClassK();
		obj.meth1();
		System.out.println("-----------------------------------");
		obj.meth2();
		System.out.println("-----------------------------------");
		obj.meth3();
		System.out.println("------------------------------------");
		obj.meth4();
		
	}

}
