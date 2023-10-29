package opps;

//child class  super keyword

public class ClassC9 extends ClassC8
{
	void display()
	{
		System.out.println("hi");
		super.meth4();
	}
	static int show(int a)
	{
		System.out.println(a+a);
		return a+a++;
	}
	ClassC9()
	{
		this(show(50));
		while(true)
		{
			super.meth4();
			break;
		}
		System.out.println("hi");
		System.out.println(show(50));
	}
	ClassC9(int a)
	{
		System.out.println("---->"+(a++ + show(50)));
	}
	public static void main(String[] args) 
	{
		new ClassC9().display();

	}
}
