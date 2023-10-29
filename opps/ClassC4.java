package opps;

//super() constructor call super keyword
//super keyword is used to access parent class object functionality
//this is used to access present class functionality

public class ClassC4 //parent class
{
	void meth1()
	{
		System.out.println("Class C4 method");
	}
	ClassC4()
	{
		System.out.println("ClassC4 default constructor");
	}
	ClassC4(int a,int b)
	{
		this();  //calling present class constructor using this() constructor call
		System.out.println("Class C4 parameterized constructor"+(a+b));
		System.out.println(this);
	}
}


