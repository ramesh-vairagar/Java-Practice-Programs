package pack3;

//increment decrement operator
//a++ post increment=first access value then increment
//--a pre increment=first increment then access

public class ClassM

{
	void meth1()
	{
		int a=10;
		System.out.println(a);
		a++;       //increment
		System.out.println(a);
		a--;      //decrement operator
		System.out.println(a);
	}
	
	public static void main(String[] args) 
	
	{
		new ClassA().meth1();
	
		int a=1;
		int b=2;
		int c;
		int d;
		c = ++b;
		d = a++;
		c++;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}
