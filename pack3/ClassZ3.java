package pack3;

//this keyword: it point towards the present object in the class and use as reference

public class ClassZ3 
{

	void meth1()
	{
		System.out.println(10);
		meth2(20); //this keyword provided by compiler by default
		//System.out.println(new ClassZ3());
	}
	protected void meth2(int a)
	{
		System.out.println(a);
		this.meth3(10,30);  //calling non static method with the help of this keyword without creating object
	}
	void meth3(int a,int b)
	{
		System.out.println(a+b);
		System.out.println(this);
	}
	public static void main(String[] args) 
	{
		ClassZ3 obj=new ClassZ3();
		obj.meth1();
		//this.meth1();  CE we cant use this keyword static area
		//System.out.println(obj);
		new ClassZ3();
		
	}

}
