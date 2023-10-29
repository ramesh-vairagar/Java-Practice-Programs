package pack2;

public class ClassO 
{
	int a;
	public String testmethod()
	{
		System.out.println(35);
		return new ClassO().testmethod3(new ClassO().testmethod2())+new ClassO().testmethod4("hi");
	}
	public int testmethod2()
	{
		System.out.println(25);
		return 25+5;
	}
	public String testmethod3(int a)
	{
		System.out.println(15);
		return "is ";
	
	}
	public String testmethod4(String s)
	{
		System.out.println(45);
		return "awesome";
	}
	public static void main(String [] args)
	{
		ClassO obj=new ClassO();
		System.out.println("java "+ obj.testmethod() +obj.a);
	}

}
