package pack3;

public class ClassL1 
{
	ClassL1(int a)
	{
		System.out.println("hi");
		new ClassL1(10,20);
	}
	ClassL1(int a,int b)
	{
		System.out.println("hllo");
		
	}
	ClassL1(String s)
	{
		System.out.println(s);
		new ClassL1(10);
	}
	public static void main(String[] args) 
	{
		new ClassL1("java is awesome");
	}

}
