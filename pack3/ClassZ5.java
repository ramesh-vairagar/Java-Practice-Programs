package pack3;

//this() constructor call

public class ClassZ5 
{
	void meth1()
	{
		System.out.println("meth1 called");
	}
	ClassZ5()
	{
		System.out.println("default constructor" );
		this.meth1();   //meth1 called using this keyword
	}
	ClassZ5(int a)
	{
		this();  //constructor call
		System.out.println("parameterize constructor");
		this.meth1();
		//new ClassZ5().meth1();
	}
	public static void main(String[] args) 
	{
		new ClassZ5(500);
		
	}

}
