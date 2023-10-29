package pack3;


public class ClassV5 
{
	int x=10;  //non-static variable
	public static void main(String[] args) 
	{
		//System.out.println(ClassA.x); instance variable access in only one way in static method
		System.out.println(new ClassV5().x);
		
	}
	static
	{
		int x=30;
		System.out.println(x+" ");
	}

}
