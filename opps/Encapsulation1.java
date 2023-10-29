package opps;

import java.util.Scanner;

//

public class Encapsulation1 
{
	void meth1()
	{
		Scanner sc = new Scanner(System.in);
		Encapsulation obj = new Encapsulation();  //creating an object of another class 
		
		System.out.println("enter your name");
		//obj.studentName=sc.next();  //CE we can not access private variables in another class
		obj.setStudentName(sc.next());
		
		System.out.println("enter your rollno");
		obj.setStudentRollno(sc.nextInt());
		
		System.out.println("enter your Dept");
		obj.setStudentDept(sc.next());
		
		System.out.println("---data entered by the user----\n");
		
		System.out.println("StudentName="+obj.getStudentName());
		//System.out.println("StudentNAme="+obj.StudentName); //CE 
		System.out.println("StudentRollno="+obj.getStudentRollno());
		System.out.println("StudentRollno="+obj.getStudentDept());
		
		sc.close();  //scanner close
		
	}
	public static void main(String[] args) 
	{
		new Encapsulation1().meth1();
		
	}

}
