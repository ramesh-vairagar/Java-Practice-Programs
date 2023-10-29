package pack2;

public class ClassE {

	void meth1()
	{
		int a=10;
		System.out.println("meth1() called");
		System.out.println(a);
		System.out.println(+90);
	}
	int meth2()
	{
		System.out.println("meth2() called");
		return 99;
	}
	public static void main(String[] args) 
	{
		System.out.println("start");
		ClassE obj=new ClassE();
		obj.meth1();
		System.out.println("---------------");
		int i=new ClassE().meth2();
		System.out.println("i value ="+i);
		System.out.println("end");
		
		
	}
}
