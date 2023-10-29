package pack1;

//understanding main method

public class ClassC 
{
	public static void meth1()
	{
		System.out.println("meth1()called");
	}
	public static int add()  //calling meethod main()
	{
		int a=10,b=20;
		int c=a+b;
		System.out.println("meth2() called");
		return c;
	}
	public static void main(String [] args) 
	{
		System.out.println("main method called");
		//ClassC obj=new ClassC();
		//ClassC newobj=new ClassC();
		//int i=obj.add();
		//new ClassC().meth1();
		//meth1();
		//System.out.println(i);
		int x=10;
		x+=x++ + ++x+x;
		System.out.println(x);
		
	}

}
