package pack2;

public class ClassZ3 
{
	public void meth1()
	{
		System.out.println("public met1() called");
	}
	protected void meth2()
	{
		System.out.println("protected meth2() called");
	}
	public static void main(String[] args) 
	{
		new ClassZ3().meth2();
	}

}
