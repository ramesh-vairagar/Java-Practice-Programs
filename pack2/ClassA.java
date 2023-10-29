package pack2;

public  class ClassA 
{
	void meth1()
	{
		System.out.println("meth1()called");
		System.out.println(10);
	}
	public static void main(String[] args) 
	{
		int a=100;
		ClassA obj=new ClassA();
		obj.meth1();
		System.out.println("----------------");
		new ClassA().meth1();
		System.out.println(a);
		ClassB Bobj=new ClassB();
		Bobj.meth2();
	}

}
class ClassB
{
	int meth2()
	{
		System.out.println("mwth2()from classB");
		return 100;
	}
		public static void main(String[] args) {
		ClassB	Bobj=new ClassB();
		Bobj.meth2();
		}

}
