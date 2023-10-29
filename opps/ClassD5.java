package opps;

/*abstraction:- it is the process of hiding implementation details and showing necessary details
                                     |                     |
                                1.abstract class       2.interfaces
 */

public abstract class ClassD5   //abstract class
{
	abstract void meth1();   //abstract method
	abstract void meth1(String s);
	
	void meth2()
	
	{
		System.out.println("meth2 called");
	}
	static void meth3()
	{
		System.out.println("static meth3 called");
	}
	ClassD5()
	{
		System.out.println("abstract class constructor called");
	}
	public static void main(String[] args) 
	{
		System.out.println("abstract class main() called");
		//ClassD5 obj new ClassD5();  ce abstract class cant be instantiated 
		ClassD5.meth3();
		
	}


}
