package pack3;

public class ClassL3 

{

	public ClassL3()   //main
	{
		System.out.println("sunday");
		ClassL3 obj=new ClassL3(10);
		System.out.println("tuesday");
		String s=obj.display("challenge Accepted");
		System.out.println(s);
	
	}
	public ClassL3(int temp)  //ClassL3()
	{
		System.out.println("saturday");
		ClassL3 obj=new ClassL3(10,20);
		int a=obj.meth1();
		System.out.println("-------->"+(a+obj.meth2()));
		System.out.println("monday");
	}
	String display(String s)
	{
		System.out.println("int the nextv stmt i amreturning string value");
		return s;
	}
	int meth1()
	{
		return 100;
	}
	int meth2()
	{
		return 99;
	}
	public ClassL3(int data ,int temp)  //ClassL3(int temp)
	{
		System.out.println("thursday");
		System.out.println("--------->"+(data+new ClassL3("hi").meth2()-temp));
	}
	ClassL3 (String s)  //ClassL3(int int)
	{
		System.out.println(s);
	}
	public static void main(String[] args) 
	{
		ClassL3 obj= new ClassL3();
		System.out.println("output verified");
		
	}
	

}
