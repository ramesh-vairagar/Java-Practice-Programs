package opps;  

//inherited class to perform overriding 

public class ClassD4 extends ClassD3 //child class
{
	private void meth1()
	{
		System.out.println("ClassD4-meth1-called");
	
	}
	void meth1(int x)
	{
		System.out.println("hello--->"+x);
	}
	public void show()
	{
		System.out.println("hello world");
	}
	static void display()
	{
		System.out.println("substarction="+(99-1));
	}
	ClassD4 meth2()   //covarent return type
	{
		System.out.println("ClassD4-meth2-called");
		return new ClassD4();
	}
	public static void main(String[] args) 
	{
		ClassD3 D3obj = new ClassD4();  //parent class reference----->child Class object
		//D3obj.meth1();  //meth1 is private it can not be overridden
		D3obj.meth1(100);
		D3obj.show();
		D3obj.meth2();
		System.out.println("===========");
		D3obj.display();  //static method
		new ClassD4().meth1();
		display();
	}

}
