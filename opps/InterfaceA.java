package opps;

//abstraction using interfaces


public interface InterfaceA 
{
	void meth1(); //by default every method in interface is public abstract
	
	default void meth2()  //default method form java 1.8 version we can write
	{
		this.meth4();
		System.out.println("Interface A default method ");
	}
	static void meth3()
	{
		//meth4(); CE we cant use this keyword inside static area
		System.out.println("interface A static method");
		
	}
	private void meth4()   //1.9
	{
		System.out.println("interface A private method");
	}
	public static void main(String[] args)  //1.8
	{
		System.out.println("interface A executed");
		//new InterfaceA();  //we can not instantiate interface
		InterfaceA.meth3();
		
	}


}
