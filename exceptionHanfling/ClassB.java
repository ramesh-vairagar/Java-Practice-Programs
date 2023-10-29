package exceptionHanfling;


//whenever we are using try catch finally 110% we need to maintain order

public class ClassB 
{

	void meth1()
	{
		System.out.println(10);
		try
		{
			System.out.println("try block executed");
			System.out.println("----------->"+10/0);
			System.out.println("hello world");
			
		}
		catch(Exception e)
		{
			System.out.println("catch block executed");
			System.out.println(e.getMessage());   //getMessage() gives reason of the exception present in throwable class
			System.out.println(e.toString());    //toString() gives name and reason of the exception present in object class 
			//e.printStackTrace();              //gives complete information about the exception in throwable class
		}
		finally
		{
			System.out.println("final block");
			System.out.println(30);
			
		}
		
	}
	public static void main(String[] args) 
	{
		
		new ClassB().meth1();
		
	}
}
