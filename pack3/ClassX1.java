package pack3;

//understanding for loop

public class ClassX1 
{
	//ClassX1 obj1=new ClassX1();
	void meth1()
	{
		System.out.println("----meth1()----");
		for(int i=1;i<=1;i++)
		{
			System.out.println("i val="+i);

		}
		System.out.println("mth1() execited");
		
	}
	void meth2()
	{
		System.out.println("------meth2()------");
		for(int i=0;i<=10;i++)
		{
			System.out.println("i val="+i);
			i++;
		}
		System.out.println("meth2() executed");
	}
	void meth3()
	{
		System.out.println("------meth3----");
		int i=1;
		for(;i<=3;)
		{
			System.out.println("i val="+i);
			++i;
		}
		System.out.println("meth3() executed");
	}
	void meth4()  //infinite for loop
	{
		System.out.println("--------meth4-------");
		int i=1;
		for(;i<=3;)
			//int x=50;  //CE we cant write declarative statements
			System.out.println("i val="+i);
			i++;
			System.out.println("meth4() executed");
	}
	void meth5()
	{
		int i=1; 
		for(System.out.println("-----meth5()---");i<=3;System.out.println("hello")) 
			//condition statement should be a condition
		{
			System.out.println("i val="+i);
			i++;
		}
		System.out.println("meth5 executed");
	}
	void meth6()
	{
		int i=0;
		for(System.out.println("hi"),System.out.println("hello");i<=3;System.out.println(i))
		{
			System.out.println("i val="+i);
			i++;
		}
	}
	void meth7()
	{
		System.out.println("-----------meth7()------");
		for(int i=new ClassX1().meth8();i<='A'-62;new ClassX1().meth9())
		{
			System.out.println("i val="+i);
			i++;
		}
		System.out.println("meth7() executed");
	}
	int meth8()
	{
		System.out.println("java is awesome");
		return 'a'-96;
	}
	void meth9()
	{
		System.out.println("---------------------");
	}
	void meth10()
	{
		System.out.println("-------meth10() --------");
		int i=10;
		for(;;)   //infinite for loop
		{
			System.out.println("i val="+i);
			i++;
		}
		//System.out.println("meth10() executed"); //CE unreachable code
	}
	void meth11(int a,int b,int c)
	{
		for(;a<=5;)
		{
			if(b==10)
			{
				System.out.println("if block executed");
				switch(c)
				{
				case 100:
					System.out.println("case 100 executed");
					break;
				default:
					System.out.println("no case lable matched");
				}
				System.out.println("compiler out from switch");
			
				while(c<=105)
				{
					System.out.println("c val="+c);
					c++;
				}
				do
				{
					System.out.println("c value="+c);
					c++;
				}
				while(false);
			}
			else
			{
				System.out.println("else block executed");
			}
			return;
		}
	}
	public static void main(String[] args) 
	{
		ClassX1 obj = new ClassX1();
		//obj.meth1();
		//obj.meth2();
		//obj.meth3();
		obj.meth4(); 
		//obj.meth5();
		//obj.meth6();
		//obj.meth7();
		//obj.meth10();
		obj.meth11(1,10,100);

	}
	

}
