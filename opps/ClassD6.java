package opps;

//child class abstract class inherited

public class ClassD6 extends ClassD5 
{
	void meth1()  //implementation of abstract method
	{
		System.out.println("hi");
	
	}
	void meth1(String msg) //implementation of abstract method
	{
		System.out.println(msg);
	}
	static void meth3()
	{
		System.out.println("D6static meth3 called");
	}
	
	public static void main(String[] args) 
	{
		ClassD5 D6obj = new ClassD6(); //parent class reference holding child class object
		D6obj.meth1();
		D6obj.meth1("java");
		D6obj.meth2();
		D6obj.meth3();
		new ClassD6().meth3();
	}
		
}
