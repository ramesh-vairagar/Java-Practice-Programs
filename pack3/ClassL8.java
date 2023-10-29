package pack3;

public class ClassL8
{
	void meth1()
	{
		System.out.println("meth1() called");
	}
	ClassL8(int a)
	{
		System.out.println(a);
	}
	ClassL8(String s)
	{
		System.out.println(s);
	}
	public static void main(String[] args) 
	{
		//new ClassL8().meth1(); //we need to initialize class object with 
		//help of available constructor in class
		
		new ClassL8(10).meth1();
		
		
		new ClassL8("java").meth1();
		
		//new ClassL8("java",10);  //CE constructor is not present
		
	}

}
