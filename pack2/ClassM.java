package pack2;

public class ClassM 
{
	String meth1(int a,int b)
	{
		System.out.println(10);
		System.out.println((54+a)-b);
		int value=new ClassM().meth5();
		System.out.println(value);
		return "java";
	}
	int meth2(int a)
	{
		System.out.println(75);
		int b=5;
		System.out.println(b-a);
		return 5*5-b;
	}
	void meth3()
	{
		System.out.println("start");
		System.out.println(new ClassM().meth4());
		System.out.println(40);
	}
	String meth4()
	{
		System.out.println("today is sunday");
		return new ClassM().meth1(4,8);
	}
	int meth5()
	{
		ClassM obj=new ClassM();
		return obj.meth2(2);
	}
	public static void main(String[] args) 
	{
		ClassM obj=new ClassM();
		obj.meth3();
	}

}
