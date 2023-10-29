package opps;

//child class 

public class ClassC2 extends ClassB2  
{

	void meth3()
	{
		System.out.println("ClassB method");
	}
	public static void main(String[] args) 
	{
		ClassC2 cobj =new ClassC2();
		cobj.meth1();
		cobj.meth2();
		cobj.meth3();
		
	}
}
