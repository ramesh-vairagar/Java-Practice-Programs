package pack3;

//static method

public class ClassT 
{

	int a =10;  //non-static or instance variable
	static int b=20; //static variable
	
	void meth1()    //non static method or instance method
	{
		System.out.println("instance ="+a);
		System.out.println("static ="+b);
	}
	static void meth2()  //static method
	{
		System.out.println("instance="+new ClassT().a); 
		//accessing not static variable in static method with only class object
		
		System.out.println("static="+b);
	}
	public static void main(String[] args) 
	{
		ClassT obj=new ClassT();
		obj.meth1();      //calling non static method using object
		
		System.out.println("-----------------");
		ClassT.meth2();  //calling static method using class
		obj.meth2();     //calling static method using object
		meth2();         //calling static method using identifier
		
	}
}
