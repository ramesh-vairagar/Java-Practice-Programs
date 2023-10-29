package opps;

/*   method overriding key points
 		1]if we can not inherit we cannot override
 		2]private > default > protected > public
 		3]child class methods should not be more restrictive than parent class methods
 		4]static methods can not be overridden 
 		5]after 1.5 version return may not be same in covarent return type
 		6]constructors can not override 
*/
public class ClassD3   //parent class methods 
{
	private void meth1() 
	{
		System.out.println("ClassD3--meth1()");
	}
	void meth1(int a)       //overridden method
	{
		System.out.println("hi--"+a);
	}
	public void show()
	{
		System.out.println("java is awesome");
	}
	static void display()
	{
		System.out.println("addition="+(99+1));
		
	}
	ClassD3 meth2()   //covarent return type
	{
		System.out.println("ClassA-meth2-called");
		return new ClassD3();
	}
	
}
