package opps;

//polymorphism :- it is an ability to perform multiple task with same identity

//1.method overloading:-writing two or more than two methods in the same class having same method name but different parameters

public class ClassD 
{
	public static void meth1()
	{
		System.out.println(10);
	}
	static int meth1(int a)
	{
		System.out.println(20);
		return a;
	}
	private void meth1(int a,String s)
	{
		System.out.println(30);
	}
	static String meth1(String s,int a)
	{
		System.out.println(40);
		return s;
	}
	protected void meth1(String s)
	{
		System.out.println(50);
	}
	static final void meth1(StringBuffer sb)
	{
		System.out.println(60);
	}
	byte meth1(byte b)
	{
		System.out.println(70);
	
		return b;
	}
	public static void main(String[] args) 
	{
		ClassD dobj = new ClassD();
		System.out.println("------------------");
		meth1();
		meth1(500);
		dobj.meth1(500,"java");
		meth1("java",500);
		dobj.meth1("java");
		meth1(new StringBuffer("java"));
		dobj.meth1((byte)10);
		System.out.println("-----------------");
		main();
		main("java");
	}
	public static void main()
	{
		System.out.println("1st main");
	}
	final public static  void main(String s)
	{
		System.out.println("2nd main");
	}
	ClassD()
	{
		this(500);
		System.out.println("default constructor");
	}
	ClassD(int a)
	{
		System.out.println("parameterized constructor");
	}
}
