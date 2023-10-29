package pack3;

//with the help of 

public class ClassQ 
{
	void meth1(int a,int b,int c)
	{
		System.out.println("addition="+(a+b+c));
		new ClassQ().meth2(20, 50);
	}
	void meth2(int a,int b)
	{
		System.out.println("substarction="+(a-b));
	}
	ClassQ()
	{
		System.out.println("division="+(10/2));
	}
	ClassQ(int a)
	{
		System.out.println("multiplication"+(a*a));
	}
	public static void main(String[] args) 
	{
		new ClassQ(10).meth1(10, 20, 30);
		
	}

}
