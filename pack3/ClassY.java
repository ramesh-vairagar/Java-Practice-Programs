package pack3;
import java.util.*;

//understanding java scanner Class

public class ClassY 
{
	static ClassY obj = new ClassY();
	static Scanner sc = new Scanner(System.in); //creating an object of scanner class and taking reference as static
	void meth1()
	{
		System.out.println("-----meth1()------");
		System.out.println("enter first number");
		int a = sc.nextInt();    //nextInt method present in scanner class which takes int input only
		System.out.println("value eneter="+a);
		System.out.println("eneter second number");
		int b=sc.nextInt();
		System.out.println("value entered="+b);
		int c=a+b;
		System.out.println("c="+c);
	}
	void meth2()
	{
		System.out.println("-------meth2()-------------");
		System.out.println("please enter your name");
		String name=sc.next();  //next() method takes string input upto first space occurance
		System.out.println("dear "+name);
		System.out.println("enter your full name");
		sc.nextLine();
		name=sc.nextLine();   //nextLine() method take string input up to next line
		System.out.println("dear "+name+" please eneter your age ");
		int age=sc.nextInt();
		if(age>18)
			System.out.println("eligible for vote");
		else
			System.out.println("not eligible");
		System.out.println("------------------------");
	}
	void meth3(int exp)
	{
		System.out.println("candidate is having "+exp+"years of experience");
		String ans="no";
		switch(exp)
		{
		case 5:
			System.out.println("tell me about yorself");
			sc.nextLine();
			ans=sc.nextLine();
		case 10:
			break;
		default:
			System.out.println("invalid");
		}
		System.out.println("your ans is "+ans);
	}
	public static void main(String[] args) 
	{
		//obj.meth1();
		///obj.meth2();
		System.out.println("eneter your exprience");
		obj.meth3(sc.nextInt());
	}

}
