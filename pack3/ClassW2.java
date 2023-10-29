package pack3;

//selection statement:- if--else ,else if , switch

public class ClassW2 
{
	void meth1(int a)
	{
		System.out.println("----meth1()-----");
		if(a<=10)
		{
			System.out.println("hi");
		}
		System.out.println("meth1() executed");
	}
	void meth2(int a)
	{
		System.out.println("-----meth2()-------");
		if('A'==a)
		{
			System.out.println("hello");
			++a;
		}
		System.out.println("meth2() executed");
	}
	void meth3(int a)
	{
		if(a<5)
			//int x=10;  if we are not writing flower braces only one statement is dependent on condition and that statement should not be declarative statement
			System.out.println("java");
			System.out.println("meth3() executed");
	}
	void meth4(int a)
	{
		System.out.println("------meth3()---------");
		if(!(a<=5))
		{
			System.out.println("if block");
			System.out.println("hi");
		}
		else
		{
			System.out.println("else bloc");
			System.out.println("hi");
		}
		System.out.println("meth4() executed");
				
	}
	void meth5(byte b)
	{
		System.out.println("----meth5()-------");
		if(b==50 && b<=45)
			System.out.println("hi");
			//System.out.println("java");  //CE flower braces require
		else
			System.out.println("hello");
			System.out.println("hi");
		System.out.println("meth5() executed");
	}
	void meth6(int a)
	{
		System.out.println("------meth6()------");
		if(a<=10)
		{
			System.out.println("hi");
			System.out.println("java");
		}
		else
			System.out.println("hello");
		System.out.println("meth6() executed");
	}
	void meth7(int a)
	{
		System.out.println("-------meth7()--------");
		if(a>0)
		{
			System.out.println(a+" : is positive");
		}
		else if(a<0)
		{
			System.out.println(a+":is negative");
		}
		else
		{
			System.out.println("zero");
		}
		System.out.println("meth7() executed");
	}
	void meth8(int a,int b)
	{
		System.out.println("------meth8()-------");
		if(a<=20)
		{
			if(a<=10)
			{
				System.out.println("nested if executed");
			}
			else
			{
				System.out.println("nested else executed");
			}
		}
		else
		{
			System.out.println("else block");
		}
		System.out.println("meth8() executed");
	}
	public static void main(String[] args) 
	{
		ClassW2 obj = new ClassW2();
		obj.meth1(5);
		obj.meth2('A');
		obj.meth3(10);
		obj.meth4('A'-60);
		obj.meth5((byte)10);
		obj.meth6(3);
		obj.meth7(0);
		obj.meth8(10,5);
	}
}
