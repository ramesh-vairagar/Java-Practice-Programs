package exceptionHanfling;

import java.io.FileReader;

//throws and throw keyword
//throw:--->is used for showing user defined exception
public class ClassD 
{
	int avlAmt=10000;
	
	void withdraw(int wid_amt)
	{
		if(avlAmt<wid_amt)
		{
			throw new ArithmeticException("insufficient funds");
		}
		else
		{
			System.out.println("transaction success");
		}
		
	}
	void fileoperations() throws Exception
	{
		System.out.println();
		FileReader fr = new FileReader("path");
		fr.close();
	}
	public static void main(String[] args) throws Exception 
	{
		ClassD obj = new ClassD();
		//obj.withdraw(15000);
		obj.fileoperations();
		
	}

}
