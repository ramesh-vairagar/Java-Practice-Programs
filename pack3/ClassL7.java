package pack3;

public class ClassL7 
{
	int amount=500;
	ClassL7()
	{
		System.out.println("no amount added");
		System.out.println("final amount="+amount);
		
	}
	ClassL7(int add)
	{
		amount=amount+add;
		System.out.println("final amount="+amount);
	}
	public static void main(String[] args) 
	{
		new ClassL7();
		new ClassL7(100);
		
	}
}
