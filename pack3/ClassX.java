package pack3;

//iteration statement:- repeated execution of a part of program 
//while loop ,do-while loop


public class ClassX 
{
	void meth1(int a)
	{
		System.out.println("---meth1()-----");
		while(a<=5)
		{
			System.out.println("a val ="+a);
			a++;
		}
		System.out.println("meth1 executed");
		
	}
	void meth2(int a)  //infinite loop condition
	{
		System.out.println("-----meth3()------");
		while(a<=3)
			//int a=10;
			System.out.println("a val= "+(++a));  //only one statement depends on condition if we are not writing braces that should not be declarative
			a++;
			System.out.println("meth2 executed"+a);
	}
	void meth3(int a)
	{
		System.out.println("-------meth3()--------");
		while(true)
		{
			System.out.println("a val:"+a);
			a++;
			//break;  //compiler terminate out from block
		}
		//System.out.println("meth3() executed");//unreachable code
	}
	void meth4(int a)
	{
		System.out.println("--------meth4()-----");
		do
		{
			System.out.println("a val: "+a);
		}
		while(a<=5);
		System.out.println("mth4() executed ");
	}
	public static void main(String[] args) 
	{
		ClassX obj=new ClassX();
		obj.meth1(2);
		//obj.meth2(1);
		//obj.meth3(10);
		obj.meth4(2);
	}

}
