package pack3;

//programs on increment operator

public class ClassN 
{
	void meth1()
	{	
		int a=10;
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a);
		System.out.println(++a);
		
		int x=100;
		int y=a++;
		int z=++a;
		System.out.println("x val="+x);
		System.out.println("y val="+y);
		System.out.println("z val ="+z);
	
		int m=25;
		int n=--m;
		int o=m--;
		System.out.println("m val="+m);
		System.out.println("n val="+n);
		System.out.println("o val="+o);
	}
	public static void main(String[] args) 
	{
		new ClassN().meth1();
		
	}

}
