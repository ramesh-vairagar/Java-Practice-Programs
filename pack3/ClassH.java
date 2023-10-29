package pack3;

//finalize():- garbage collector call finalize method internally when 
//garbage collector destroy object.
//garbage collector destroys all the unused or unreferenced objects in the program

public class ClassH 
{
	void meth1()
	{
		System.out.println("meth1() called");
		
	}
	protected void finalize()
	{
		System.out.println("garbage colected");
	}
	public static void main(String[] args) 
	{
		ClassH obj1 = new ClassH();
		ClassH obj2 = new ClassH();
		obj1.meth1();
		obj1=obj2;
		System.gc();  //way to call garbage collector manually
	}

}
