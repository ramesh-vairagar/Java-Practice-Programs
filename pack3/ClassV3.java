package pack3;

public class ClassV3 
{
	int x=10;  //non static variable
	public static void main(String[] args) 
	{
		int x=20;  //local variable
		System.out.println(x);
		
	}
	static
	{
		int x=30;
		System.out.println(x+" ");
	}
	

}
