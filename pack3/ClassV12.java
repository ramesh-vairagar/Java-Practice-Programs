package pack3;

//control statements:-change or break the flow of execution of program
// 1]selection 2]iteration 3] jump

//if-else

public class ClassV12 
{
	void meth1(int a)
	{
		System.out.println("----meth1()----");
		if(a<=10)
		{
			System.out.println("hi");
		}
		System.out.println("meh1() executed");
	}
	void meth2(int a)
	{
		System.out.println("----meth2()-----");
		if('A'==a)
		{
			System.out.println("hello");
			a++;
		}
		System.out.println("meth2() executed :"+(char)a);
	}
	void meth3(int a) //10
	{
		System.out.println("----meth3()----");
		if(a>=5)
			//int x=100; CE
			System.out.println("java");
			System.out.println("meth3() executed");
			/*if we are not writing flower braces then only stmt dependent on the condition 
			in that single stmt we should not write any declarative stmt.*/
	}
	void meth4(int a)
	{
		System.out.println("-----meth4()-----");
		if(!(a<=5))
		{
			System.out.println("if block ");
			System.out.println("hi");
		}
		else
		{
			System.out.println("else block executed");
			System.out.println("hello");
		}
		System.out.println("meth4() executed");
	}
	public static void main(String[] args) 
	{
		ClassV12 obj = new ClassV12();
		obj.meth2(10);
		
		obj.meth4('A'-60);
		
		
	}
	
	
}
