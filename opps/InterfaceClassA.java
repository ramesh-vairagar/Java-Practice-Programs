package opps;

//child class to inherit parent interfaces and classes

public class InterfaceClassA extends InterfaceClassB implements InterfaceA,InterfaceB     //inheriting parent classB and InterfaceA,InterfaceB 
{
	public void meth1()    //overriding InterfaceA abstract method by default it is public 
	{
		System.out.println("interface A abstract method overriden");
	}
	public void show()
	{
		System.out.println("Interface B abstract method overridden ");
	}
	
	public static void main(String[] args) 
	{
		InterfaceA aobj1 = new InterfaceClassA();  //holding child class object by parent interface
		aobj1.meth1();
		aobj1.meth2();
		//aobj1.meth3(); static method in interface can only accessed by InterfaceA.meth3();
		InterfaceA.meth3();
		
		System.out.println("=======================");
		InterfaceB Bobj1 = new InterfaceClassA();
		Bobj1.show();
		
	}
}
