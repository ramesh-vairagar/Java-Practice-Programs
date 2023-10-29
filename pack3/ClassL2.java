package pack3;

public class ClassL2 
{
	int meth1(int a,int b) 
	{
		System.out.println("meth1() called");
		return a+b;
	}
	ClassL2(String s)
	{
		System.out.println(s);
	}
	public static void main(String[] args) 
	{
		System.out.println(new ClassL2("hi").meth1(10,20));
		
	}
}
