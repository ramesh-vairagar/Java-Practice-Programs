package pack3;

//program on increment operator

public class ClassO 
{
	void meth1()
	{
		int a=10;
		int b = a++ +20;
		System.out.println("a val="+a);
		System.out.println("b val="+b);
		
		int x=100;
		x = x++ + 100;
		System.out.println("x val="+x);
		
		int y=100;
		y = ++y + 100 ;
		System.out.println("y val="+y);
	}
	
	void meth2()
	{
		int a=10;
		a++;
		System.out.println(++a);
		System.out.println(++a);
		System.out.println(a++);
		a++;
		System.out.println(a--);
		System.out.println(a);
		--a;
		System.out.println(++a);
		System.out.println(--a);
		a = a++ + ++a;
		System.out.println(a);
	}
	
	public static void main(String[] args) 
	{
		new ClassO().meth1();
		System.out.println("---------------------------");
		new ClassO().meth2();
		System.out.println("----------------------------");
		
		
		
		int a=34;
		int b=21;
		int	c=a++ + ++b;
		int d=--a + --b + c--;
		int e=a+ +b + +c + d--;
		int f=-a + b-- + -c -d++;
		int sum=a+b+c+d+e+f;
		System.out.println("num="+sum);
		
	}

}
