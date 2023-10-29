package pack3;

//this()

public class ClassZ6 
{
	ClassZ6()
	{
		this("hello");   //constructor call
		System.out.println("default constructor ");
	}
	ClassZ6(String s)
	{
		this(100);  //should be first statement
		System.out.println("parameterized constructor "+s);
		//this(100);  CE
	}
	ClassZ6(int a)
	{
		System.out.println("constructor"+a);
	}
	public static void main(String[] args) 
	{
		new ClassZ6();
		
	}

}
