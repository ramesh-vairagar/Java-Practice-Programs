package pack3;

import java.util.Scanner;

//program on switch calculator program 

public class ClassW9 
{
	int meth1(int a,String c,int b)
	{
		switch(c)
		{
		case "+":
			return a+b;
		case "-":
			return a-b;
		case "*":
			return a*b;
		case "/":
			return a/b;
		default:
			return 0;
				
		}
	}
	public static void main(String[] args) 
	{
		ClassW9 obj = new ClassW9();
		try (Scanner sc = new Scanner(System.in))
		{
			System.out.println("write your calculaton here");
			int a=sc.nextInt();
			String c=sc.next();
			int b=sc.nextInt();
			System.out.println(obj.meth1(a, c, b));
		}
		
	}
}
