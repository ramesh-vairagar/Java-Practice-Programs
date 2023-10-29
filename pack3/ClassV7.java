package pack3;

public class ClassV7 
{
	int c; //non-static 0
	static int e; //0
	
	ClassV7()
	{
		System.out.println(++c);
		System.out.println(++e);
	}
	public static void main(String[] args) 
	{
		int a=34;
		int b=21;
		
		new ClassV7().c -= a++ + ++b;
		
		int d = --a + --b + new ClassV7().c--;
		
		e = a+ +b+ +new ClassV7().c-- +d--;
		
		int f = -a +b-- + -new ClassV7().c - d++;
		
		int sum = a + b + new ClassV7().c + d + e + f;
		
		System.out.println("sum="+sum);
		
		
	
	}

}
