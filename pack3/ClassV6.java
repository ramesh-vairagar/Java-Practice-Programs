package pack3;

//static block
public class ClassV6 
{
	static int x=m1();  //200
	
	public static void main(String[] args) 
	{
		System.out.println(ClassV6.x);
		
	}
	static
	{
		System.out.println(x);  //200
		ClassV6.x=x+20;         //220
	}
	static int m1()
	{
		x=50;
		return m2();
	}
	static int m2()
	{
		System.out.println(ClassV6.x); //50
		return 200;
	}
}
