package pack3;

//returning a value from method:-return type of method and retruning value should be compatible
//int and char are compatible

public class ClassI 
{
	void meth1()
	{
		System.out.println("meth1() called");
		System.out.println(10);
		return;
	}
	int meth2(int a,int b)
	{
		System.out.println("meth2() called");
		System.out.println(a+b);
		return a;
		//System.out.println("hello"); CE unreachable code
	}
	int meth3()
	{   
		System.out.println("meth3() called");
		return 'a'; //a int and char are compatible
	}
	int meth4(int a)
	{
		char A='a';
		System.out.println("meth4() called");
		System.out.println("a val="+a);
		return A+5;  //ascii val of A=65
	}
	char meth5() 
	{
		System.out.println("meth5() called");
		return 65; //char and int are compatible
		
	}
	int meth6(int a)
	{
		System.out.println("meth6() called");
		if(a<=10)
		{
			System.out.println("if block");
			return a+10;
		}
		else
		{
			System.out.println("else block");
			return a+20;
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.println("start");
		ClassI obj1=new ClassI(); 
		
		obj1.meth1();
		System.out.println("-------------------");
		
		obj1.meth2(99, 1);
		System.out.println("-------------------");
		
		System.out.println("meth3() returning ="+obj1.meth3());
		System.out.println("-------------------");
		
		System.out.println("meth4() returning="+obj1.meth4('a'));
		System.out.println("-------------------");
		
		System.out.println("meth5() returning ="+obj1.meth5());
		System.out.println("-------------------");
		
		System.out.println("meth6() returning="+obj1.meth6(5));
	}
	

}
