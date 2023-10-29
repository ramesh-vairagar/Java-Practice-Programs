package pack3;

//implementing switch case statement

public class ClassW8 
{
	
	void meth1()
	{
		System.out.println("implementing switch case statement");
		int a=65;
		int b=20;
		final int x=10;//final variable are constant we can not change its value
		//x++  //CE as x is constant
		switch(b+45)   //20+45=65  int
		{
		case x:
		//case a:  //case label should be constant 
			System.out.println("case 20 as x="+20);
			break;
		case 200:
			System.out.println("case 200");
			break;
		case 'A'-5:
			System.out.println("int and char both are compatible");
			break;
		case 40+25:
			System.out.println("case 65 executed ");
			if(a<=100)
			{
				System.out.println("----if blokk---");
				new ClassW8().meth2();
			}
			else
			{
				System.out.println("===else block==");
				new ClassW8().meth3();
			}
			break;
		case 50:
			System.out.println("case 50");
			break;
		default:
			System.out.println("no matching case label");
		}
		System.out.println("out of switch");
		
	}
	void meth2()
	{
		System.out.println("meth2() called");
		
	}
	void meth3() 
	{
		System.out.println("meth3() callled");
		
	}
	public static void main(String[] args) 
	{
		new ClassW8().meth1();
		
	}

}
