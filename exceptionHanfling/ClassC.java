package exceptionHanfling;

import java.io.FileReader;
import java.util.Scanner;

public class ClassC {
	void meth1() {
		Scanner sc = new Scanner(System.in);
		String s = null;
		System.out.println(10);
		try {
			System.out.println("try block executed");
			System.out.println("=======>" + 20 / sc.nextInt());
			System.out.println("length of s" + s.length());
			System.out.println("hello world");
		}
		/*
		 * catch(ArithmeticException e) {
		 * System.out.println("1st catch block executed"); e.printStackTrace(); }
		 * catch(NullPointerException e) {
		 * System.out.println("2nd catch block executed"); e.printStackTrace(); }
		 */
		catch (ArithmeticException | NullPointerException e) // we can handle multiple exceptions using a single
																// catch block also but those exceptions should not be
																// having any parent child relation
		{
			System.out.println("catch block executed");
			e.printStackTrace();

		} finally {
			System.out.println("finally block executed");
			sc.close();
		}
		System.out.println(30);

	}

	void meth2() throws Exception
	{
		System.out.println("meth2 called");
		try(FileReader fr = new FileReader("filepath"))  //from java 1.7 onwards we can write single try block also with resources 
		{
			//code for reading the data
		}
		
	}
	public static void main(String[] args) throws Exception
	{
		new ClassC().meth1();
		//new ClassC().meth2();
	}

}
