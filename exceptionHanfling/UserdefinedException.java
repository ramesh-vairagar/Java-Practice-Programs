package exceptionHanfling;

import java.util.Scanner;

//user defined exception 

public class UserdefinedException 
{
	static double curr_bal=100;

	public static void main(String[] args) throws minimumAccountBalance 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("eneter amount to withdraw");
		int n = sc.nextInt();
		try
		{
			if(curr_bal<n)
			{
				throw new minimumAccountBalance("insufficient funds"+curr_bal);
			}
			else
			{
				System.out.println("please take the money"+curr_bal);
			}
		
	 	}
		catch(minimumAccountBalance e)
		{
				e.printStackTrace();
		}
		finally
		{
			sc.close();
		}
	}
	
}
