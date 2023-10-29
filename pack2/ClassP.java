package pack2;

public class ClassP 
{
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println("addition="+c);
		new ClassP().div(10,10);
		
	}
	void sub(int a,int b)
	{
		int c=a-b;
		System.out.println("substraction="+c);
		new ClassP().add(1,2);
	}
	void mul(int a,int b)
	{
		int c=a*b;
		System.out.println("multiplication="+c);
		//ClassP.main(10,"java");
		new ClassP().sub(100,200);
	}
	void div(int a,int b)
	{
		int c=a/b;
		System.out.println("division="+c);
		
	}
	public static void main(String[] args) {
		new ClassP().mul(20,5);
	}
}
