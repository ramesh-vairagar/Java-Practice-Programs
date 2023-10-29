package opps;

import java.util.Scanner;

//entering employee data

public class Encapsulation3
{
	void meth1()
	{
		Encapsulation2 obj =new Encapsulation2();  //creating another class object to access data and member function
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Name");
		obj.setEmpName(sc.next());
		
		System.out.println("Enter  Experiance");
		obj.setEmpExp(sc.nextInt());
		
		System.out.println("Enter Salary");
		obj.setEmpSal(sc.nextInt());
		
		System.out.println("\n-----printing employee details-------\n");
		
		System.out.println("Employee Name:-     "+obj.getEmpName());
		System.out.println("Employee Exp:-      "+obj.getEmpExp());
		System.out.println("Employee FinalSal:- "+obj.getEmpSal());
		
		sc.close();
	}
	public static void main(String[] args) 
	{
		new Encapsulation3().meth1();
		
	}

}
