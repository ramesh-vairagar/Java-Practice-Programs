package opps;

//multiple inheritance using interfaces  i.e one child--->two parents

public interface InterfaceA1 
{

	default void meth1()
	{
		System.out.println("interface A1 method called");
	}
	default void show()
	{
		System.out.println("interface A showmethod");
	}
}

