package exceptionHanfling;

//creating user defined exception class

public class minimumAccountBalance extends Exception
{
	String msg;
	public  minimumAccountBalance(String msg)
	{
		this.msg=msg;
		
	}
	public String toString()
	{
		return msg;
	}

}
