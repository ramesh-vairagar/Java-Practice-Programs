package pack3;

//java constructor is used to initialize class object  and used to provide 
//value for instance variable
//java constructor called simultaneously whenever we creating an object

public class ClassL 
{
	ClassL()
	{
		System.out.println("non-parameterized constructor called");
		
	}
	ClassL(int a,int b)
	{
		System.out.println("parameterized constructor called");
	}
	void meth1()
	{
		System.out.println("meth1() called");
		
	}
	void meth2()
	{
		System.out.println("meth2() called");
		
	}
	public static void main(String[] args) 
	{
		new ClassL(99,1).meth1();  //first parameterized constructor called then meth1 caled
		
	}

}
