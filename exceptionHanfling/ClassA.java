package exceptionHanfling;

import java.util.Scanner;

//exception:- if our program is having exception it will be terminated but we can save our program
//by handling that exception 
//exception always occurs inside method or block
public class ClassA 
{
	void meth1()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(10);
		try
		{
			System.out.println(10);
			System.out.println("eneter nuumber");
			System.out.println("------->"+20/sc.nextInt());
			
		}
		catch(ArithmeticException e)			
		{
			System.out.println("catch block executed");
		}
		finally
		{
			System.out.println("final block executed");
		}
		sc.close();
		
	}
	public static void main(String[] args) 
	{
		new ClassA().meth1();
		
	}

}












