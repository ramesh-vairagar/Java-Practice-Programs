package pack3;
//printing statements
//println() and print
public class Class1 
{
	void meth1()  //main()
	{
		System.out.println("hi");
		System.out.println("hello");
	}
	void meth2()  //main()
	{
		System.out.print("hi--");
		System.out.print("hello\n");
		System.out.println();
	}
	void meth3()  //main()
	{
		System.out.print("java is object ");
		System.out.println("oriented programming language");
		System.out.println("java is awesome");
		System.out.println("so i loved it\n");
	}
	public static void main(String[] args) 
	{
		Class1 obj=new Class1();  //creating new object 
		obj.meth1();
		System.out.println("==========================");
		obj.meth2();
		System.out.println("==========================");
		obj.meth3();
	}

}
