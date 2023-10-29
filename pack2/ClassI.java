package pack2;

public class ClassI 
{
	void meth1()
	{
		System.out.println(10);
		System.out.println(64);
		System.out.println("end");
	}
	int meth2(int a,int b,int c)
	{
		String s=new ClassI().meth5(100,"java");
		System.out.println(s);
		return a-b;
	}
	String meth3(String s,int b,int d)
	{
		System.out.println(b+d);
		return s;
		
	}
	int meth4(int c,int k)
	{
		System.out.println(k);
		ClassI obj=new ClassI();
		int result=obj.meth2(50,50,50);
		System.out.println(result);
		return k+10;
	}
	String meth5(int a,String l)
	{
		System.out.println(a+a);
		String s=new ClassI().meth3("hi", 5, 10);
		System.out.println(s);
		return l;
	}
	public static void main(String[] args) 
	{
		ClassI obj=new ClassI();
		System.out.println("start");
		int result=obj.meth4(20,10);
		System.out.println(result);
		obj.meth1();
		
	}
}
