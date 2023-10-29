package pack4;

//input a,b ---->abba
//hi , bye--->hibyebyehi

public class String4 
{
	public String makeAbba(String a, String b)
	{
		return a+b+b+a;
	}

	public static void main(String[] args) 
	{
		System.out.println(new String4().makeAbba("hi","bye"));
		
	}
}
