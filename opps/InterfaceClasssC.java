package opps;

//child class------>having two parent interfaces A and B 

public class InterfaceClasssC implements InterfaceA1,InterfaceB1
{
	void meth3()
	{
		System.out.println("child class method called");
	}
	public void show()
	{
		System.out.println("child class  show method");
		System.out.println("---------");
		InterfaceA1.super.show();
		InterfaceB1.super.show();
		
	}
	public static void main(String[] args) 
	{
		InterfaceClasssC obj = new InterfaceClasssC();
		obj.meth1();
		obj.meth2();
		obj.meth3();
		System.out.println("-----overriding------");
		InterfaceA1 A1obj = new InterfaceClasssC();
		A1obj.show();
		InterfaceA1 B1obj = new InterfaceClasssC();
		B1obj.show();
		
	}

}
