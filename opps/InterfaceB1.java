package opps;

//multiple inheritance using interfaces parent for classc

public interface InterfaceB1 
{
	default void meth2()
	{
		System.out.println("interface B1 method called");
	}
	default void show()
	{
		System.out.println("interface B show method");
	}
}
